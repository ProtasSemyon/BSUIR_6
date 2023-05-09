import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from sklearn.cluster import KMeans

data = pd.read_csv('/home/cati0n/labs/СтатОИВ/wine-clustering.csv')

#data = data[['Proline', 'Flavanoids']]
#plt.scatter(*np.array(data).T)

#inertia = []
#for i in range(1, 11):
#    k_means = KMeans(n_clusters=i, init= 'k-means++')
#    k_means.fit(data)
#    inertia.append(k_means.inertia_)
#plt.scatter(range(1, 11), inertia)

CLUSTERS = 4
model = KMeans(n_clusters=CLUSTERS)
model.fit(data)

clusters = pd.DataFrame(
    columns=data.columns,
    data=model.cluster_centers_
    )


data["Type"] =  pd.Series(model.labels_)

colors = ['green', 'yellow', 'red', 'black']

data = data.values.tolist()

for i in data:
    plt.scatter(i[0], i[1], c = colors[int(i[2])])
