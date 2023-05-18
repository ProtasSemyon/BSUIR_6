import sys
import requests
from PyQt5.QtWidgets import QApplication, QLabel, QLineEdit, QPushButton, QTextBrowser, QVBoxLayout, QWidget, \
    QHBoxLayout
from PyQt5.QtGui import QPalette, QColor
from SPARQLWrapper import SPARQLWrapper, JSON


# ZAPROS-1 vivesti vse podklassi klassa poroda sobak
# SELECT ?subclass WHERE {?subclass rdfs:subClassOf :animal . }
# ZAPROS-2 vivesti vse klassi
# SELECT (strafter(str(?entity), '#') AS ?className) WHERE { ?entity rdf:type owl:Class}
# SELECT ?pet WHERE {?entity :married :Alexey . ?entity :has_pet ?pet}
# SELECT ?husband ?s2 WHERE {?s1 :is_sister_of ?s2 . ?s2 :married ?husband}
# SELECT (COUNT(?s) AS ?count) WHERE {?s :is_sister_of ?s1}


class GraphDBGui(QWidget):
    def __init__(self):
        super().__init__()
        self.init_ui()

    def init_ui(self):
        # Создаем виджеты
        self.query_label = QLabel('SPARQL запрос:')
        self.query_edit = QLineEdit()
        self.query_button = QPushButton('Выполнить запрос')
        # add class 5 stroki
        self.class_label = QLabel('Добавить новый класс:')
        self.class_edit = QLineEdit()
        self.class_sub_label = QLabel('Родительский класс:')
        self.class_edit_sub = QLineEdit()
        self.class_button = QPushButton('Добавить')
        # add individual 5 strok
        self.individual_label1 = QLabel('Добавить новый экземпляр:')
        self.individual_edit1 = QLineEdit()
        self.individual_sub_label1 = QLabel('Класс:')
        self.individual_edit_sub1 = QLineEdit()
        self.individual_button1 = QPushButton('Добавить')
        #
        # add property 7 strok
        self.property_label1 = QLabel('Добавить новоe свойствo:')
        self.property_edit1 = QLineEdit()
        self.property_sub_label1 = QLabel('Введите первый класс:')
        self.property_edit_sub1 = QLineEdit()
        self.property_sub_label2 = QLabel('Введите второй класс:')
        self.property_edit_sub2 = QLineEdit()
        self.property_button1 = QPushButton('Добавить')
        #
        # add property 7 strok
        self.property_label12 = QLabel('Введите первый экземпляр:')
        self.property_edit12 = QLineEdit()
        self.property_sub_label12 = QLabel('Введите свойство:')
        self.property_edit_sub12 = QLineEdit()
        self.property_sub_label22 = QLabel('Введите второй экземпляр:')
        self.property_edit_sub22 = QLineEdit()
        self.property_button12 = QPushButton('Добавить связь')
        #
        # add individual 5 strok
        self.individual_label12 = QLabel('Введите название объекта (класса/экземпляра):')
        self.individual_edit12 = QLineEdit()
        self.individual_sub_label12 = QLabel('Введите новое название объекта:')
        self.individual_edit_sub12 = QLineEdit()
        self.individual_button12 = QPushButton('Изменить название объекта')

        # add property 7 strok
        self.delete_property_label12 = QLabel('Введите первый экземпляр:')
        self.delete_property_edit12 = QLineEdit()
        self.delete_property_sub_label12 = QLabel('Введите свойство:')
        self.delete_property_edit_sub12 = QLineEdit()
        self.delete_property_sub_label22 = QLabel('Введите второй экземпляр:')
        self.delete_property_edit_sub22 = QLineEdit()
        self.delete_property_button12 = QPushButton('Удалить связь')

        self.ontology_button = QPushButton('Просмотреть онтологию')
        self.result_label = QLabel('Результат:')
        self.result_browser = QTextBrowser()

        # add property 12 strok
        self.delete_class_label1 = QLabel('Удалить класс:')
        self.delete_class_edit = QLineEdit()
        self.delete_class_button = QPushButton('Удалить')

        self.delete_instance_label1 = QLabel('Удалить экземпляр класса:')
        self.delete_instance_edit = QLineEdit()
        self.delete_instance_button = QPushButton('Удалить')

        self.delete_property_label1 = QLabel('Удалить свойство:')
        self.delete_property_edit = QLineEdit()
        self.delete_property_button = QPushButton('Удалить')

        # Создаем контейнер вертикального слоя и добавляем виджеты в него
        hbox0 = QHBoxLayout()

        vbox = QVBoxLayout()
        vbox_sub = QVBoxLayout()
        hbox0.addLayout(vbox)
        hbox0.addLayout(vbox_sub)
        vbox.addWidget(self.query_label)
        vbox.addWidget(self.query_edit)
        vbox.addWidget(self.query_button)
        vbox.addWidget(self.ontology_button)
        vbox.addWidget(self.result_label)
        vbox.addWidget(self.result_browser)
        hbox = QHBoxLayout()
        vbox.addLayout(hbox)
        vbox1 = QVBoxLayout()
        hbox.addLayout(vbox1)
        vbox2 = QVBoxLayout()
        hbox.addLayout(vbox2)
        vbox3 = QVBoxLayout()
        hbox1 = QHBoxLayout()
        vbox.addLayout(hbox1)
        vbox5 = QVBoxLayout()
        hbox1.addLayout(vbox5)
        vbox6 = QVBoxLayout()
        hbox1.addLayout(vbox6)
        # add class 5 strok
        vbox1.addWidget(self.class_label)
        vbox1.addWidget(self.class_edit)
        vbox1.addWidget(self.class_sub_label)
        vbox1.addWidget(self.class_edit_sub)
        vbox1.addWidget(self.class_button)
        # add individual 5 strok
        vbox2.addWidget(self.individual_label1)
        vbox2.addWidget(self.individual_edit1)
        vbox2.addWidget(self.individual_sub_label1)
        vbox2.addWidget(self.individual_edit_sub1)
        vbox2.addWidget(self.individual_button1)
        # add property 7 strok
        vbox3.addWidget(self.property_label1)
        vbox3.addWidget(self.property_edit1)
        vbox3.addWidget(self.property_sub_label1)
        vbox3.addWidget(self.property_edit_sub1)
        vbox3.addWidget(self.property_sub_label2)
        vbox3.addWidget(self.property_edit_sub2)
        vbox3.addWidget(self.property_button1)
        # add property 7 strok

        # add individual 5 strok
        vbox5.addWidget(self.individual_label12)
        vbox5.addWidget(self.individual_edit12)
        vbox5.addWidget(self.individual_sub_label12)
        vbox5.addWidget(self.individual_edit_sub12)
        vbox5.addWidget(self.individual_button12)
        # add property 7 strok


        vbox_sub1 = QVBoxLayout()
        vbox_sub2 = QVBoxLayout()
        vbox_sub3 = QVBoxLayout()
        vbox_sub4 = QVBoxLayout()
        vbox_sub5 = QVBoxLayout()
        vbox_sub4.addSpacing(20)
        vbox_sub.addLayout(vbox3)
        vbox_sub.addSpacing(20)
        vbox_sub.addLayout(vbox_sub5)
        vbox_sub.addSpacing(20)
        vbox_sub.addLayout(vbox_sub4)

        # vbox_sub.addSpacing(50)

        vbox_sub1.addWidget(self.delete_class_label1)

        vbox_sub1.addWidget(self.delete_class_edit)
        vbox_sub1.addWidget(self.delete_class_button)
        vbox_sub2.addWidget(self.delete_instance_label1)

        vbox_sub2.addWidget(self.delete_instance_edit)
        vbox_sub2.addWidget(self.delete_instance_button)
        vbox_sub3.addWidget(self.delete_property_label1)

        vbox_sub3.addWidget(self.delete_property_edit)
        vbox_sub3.addWidget(self.delete_property_button)

        hbox1.addLayout(vbox_sub1)
        hbox1.addLayout(vbox_sub2)
        vbox_sub.addLayout(vbox_sub3)

        vbox_sub4.addWidget(self.delete_property_label12)
        vbox_sub4.addWidget(self.delete_property_edit12)
        vbox_sub4.addWidget(self.delete_property_sub_label12)
        vbox_sub4.addWidget(self.delete_property_edit_sub12)
        vbox_sub4.addWidget(self.delete_property_sub_label22)
        vbox_sub4.addWidget(self.delete_property_edit_sub22)
        vbox_sub4.addWidget(self.delete_property_button12)

        vbox_sub5.addWidget(self.property_label12)
        vbox_sub5.addWidget(self.property_edit12)
        vbox_sub5.addWidget(self.property_sub_label12)
        vbox_sub5.addWidget(self.property_edit_sub12)
        vbox_sub5.addWidget(self.property_sub_label22)
        vbox_sub5.addWidget(self.property_edit_sub22)
        vbox_sub5.addWidget(self.property_button12)



        # Устанавливаем контейнер вертикального слоя в качестве основного макета виджета
        self.setLayout(hbox0)

        # Устанавливаем обработчики нажатия кнопок
        self.query_button.clicked.connect(self.execute_query)
        # add class 1 stroka
        self.class_button.clicked.connect(self.add_class)
        self.individual_button1.clicked.connect(self.add_individual)
        self.individual_button12.clicked.connect(self.change_individual)
        self.property_button1.clicked.connect(self.add_propety)
        self.property_button12.clicked.connect(self.add_propety_ind)
        self.delete_property_button12.clicked.connect(self.delete_propety_ind)
        self.ontology_button.clicked.connect(self.show_ontology)

        self.delete_class_button.clicked.connect(self.delete_class)
        self.delete_instance_button.clicked.connect(self.delete_instance)
        self.delete_property_button.clicked.connect(self.delete_property)

        # Устанавливаем параметры окна
        self.setWindowTitle('GraphDB GUI')
        self.setGeometry(0, 0, 1200, 813)
        self.show()

    def execute_query(self):
        # Получаем SPARQL запрос из текстового поля
        query1 = self.query_edit.text()
        if query1 == "":
            self.result_browser.clear()
            self.result_browser.insertPlainText("no sparql query inserted")
            return
        query = """
                    PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                    PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                    PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
                    %s
                    """ % query1

        # Создаем объект SPARQLWrapper и устанавливаем адрес сервера GraphDB
        endpoint = SPARQLWrapper('http://PC-Polina:7200/repositories/pbz')

        # Устанавливаем SPARQL запрос
        endpoint.setQuery(query)

        # Устанавливаем формат вывода результатов запроса
        endpoint.setReturnFormat(JSON)

        # Выполняем запрос
        results = endpoint.query().convert()

        # Очищаем поле вывода результатов
        self.result_browser.clear()

        # Выводим результаты запроса в поле вывода
        for result in results['results']['bindings']:
            for var in result:
                a = result[var]['value'][result[var]['value'].find('#') + 1:]
                self.result_browser.insertPlainText(var + ': ' + a + '\n')
            self.result_browser.insertPlainText('\n')

    def show_ontology(self):
        # Получаем онтологию из сервера GraphDB
        endpoint = SPARQLWrapper('http://PC-Polina:7200/repositories/pbz')
        endpoint.setQuery("""
                        SELECT DISTINCT ?class ?subclass
                        WHERE {
                            ?class a owl:Class .
                            OPTIONAL {
                                ?subclass rdfs:subClassOf ?class .
                            }
                        }
                        """)
        endpoint.setReturnFormat(JSON)
        results = endpoint.query().convert()

        # Build a dictionary of classes and their subclasses
        classes = {}
        for result in results['results']['bindings']:
            class_name = result['class']['value'].split('#')[-1]
            subclass_name = result.get('subclass', {}).get('value')
            if class_name not in classes:
                classes[class_name] = {'subclasses': []}
            if subclass_name:
                subclass_name = subclass_name.split('#')[-1]
                classes[class_name]['subclasses'].append(subclass_name)

        # Query all entities
        endpoint.setQuery("""
                       SELECT DISTINCT ?class ?entity
                       WHERE {
                           ?entity a ?class .
                           FILTER (?class != owl:Class && ?class != owl:NamedIndividual && ?class != owl:ObjectProperty)
                       }
                       """)
        endpoint.setReturnFormat(JSON)
        results = endpoint.query().convert()

        # Очищаем поле вывода результатов
        self.result_browser.clear()

        # Выводим результаты запроса в поле вывода
        self.result_browser.insertPlainText("Классы - подклассы(└─) - связанные с ними экземпляры(-):\n")
        for class_name, class_data in classes.items():
            self.result_browser.insertPlainText(class_name + '\n')
            if class_data['subclasses']:
                for subclass_name in class_data['subclasses']:
                    self.result_browser.insertPlainText('  └─ ' + subclass_name + '\n')
            for result in results['results']['bindings']:
                entity_class_name = result['class']['value'].split('#')[-1]
                entity_name = result['entity']['value'].split('#')[-1]
                if entity_class_name == class_name and entity_class_name not in class_data['subclasses']:
                    self.result_browser.insertPlainText('    - ' + entity_name + '\n')
            self.result_browser.insertPlainText('\n')
        endpoint.setQuery(
            'SELECT (strafter(str(?entity), \'#\') AS ?property) WHERE { ?entity rdf:type owl:ObjectProperty}')
        endpoint.setReturnFormat(JSON)
        results = endpoint.query().convert()

        # Выводим результаты запроса в поле вывода
        self.result_browser.insertPlainText("Связи:" + '\n')
        for result in results['results']['bindings']:
            self.result_browser.insertPlainText(result['property']['value'] + ' ' + '\n')
        self.result_browser.insertPlainText('\n')

    def add_class(self):
        # Get user input
        class_name = self.class_edit.text()
        superclass_name = self.class_edit_sub.text()

        query_superclass_exists = f"""
            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

            ASK {{
                :{superclass_name} rdf:type owl:Class .
            }}
            """

        # Set up the request to check if superclass_name exists in the ontology
        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": query_superclass_exists}

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists and superclass_name != "":
            print("Error: superclass_name not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: superclass_name not found")
            return

        # Set up the query to add the class to the ontology
        if superclass_name and superclass_exists:
            query = """
            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
            PREFIX owl: <http://www.w3.org/2002/07/owl#>
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
            INSERT DATA {
                :%s rdf:type owl:Class ;
                      rdfs:subClassOf :%s .
            }
            """ % (class_name, superclass_name)
        else:
            query = """
            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
            PREFIX owl: <http://www.w3.org/2002/07/owl#>
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
            INSERT DATA {
                :%s rdf:type owl:Class .
            }
            """ % class_name

        # Set up the request to add the class to the ontology
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Class added successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Class added successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def add_individual(self):
        # Get user input
        individual_uri = self.individual_edit1.text()
        class_uri = self.individual_edit_sub1.text()
        # Check if class_uri exists in the ontology
        check_query = f"""
            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

            ASK {{
                :{class_uri} rdf:type owl:Class .
            }}
            """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: class_name not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: class_name not found")
            return
        # Set up the query
        query = """
        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
        PREFIX owl: <http://www.w3.org/2002/07/owl#>

        INSERT DATA {
          :%s rdf:type :%s .
          :%s rdf:type owl:NamedIndividual .
        }
        """ % (individual_uri, class_uri, individual_uri)

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Individual added successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Individual added successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def add_propety(self):
        # Get user input
        property_uri = self.property_edit1.text()
        domain_uri = self.property_edit_sub1.text()
        range_uri = self.property_edit_sub2.text()
        # Check if class_uri exists in the ontology
        check_query = f"""
                    PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                    PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                    PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                    ASK {{
                        :{domain_uri} rdf:type owl:Class .
                    }}
                    """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: class_name for domain not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: class_name for domain not found")
            return

        # Check if class_uri exists in the ontology
        check_query1 = f"""
                PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                ASK {{
                    :{range_uri} rdf:type owl:Class .
                }}
                """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query1}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: class_name for range not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: class_name for range not found")
            return
        # Set up the query
        query = """
        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
        PREFIX owl: <http://www.w3.org/2002/07/owl#>

        INSERT DATA {:%s
            rdf:type owl:ObjectProperty ;
            rdfs:domain :%s ;
            rdfs:range :%s .}
        """ % (property_uri, domain_uri, range_uri)

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Property added successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Property added successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def add_propety_ind(self):
        ind_1 = self.property_edit12.text()
        property = self.property_edit_sub12.text()
        ind_2 = self.property_edit_sub22.text()
        if ind_1.__eq__(ind_2):
            print("Error: equal names")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: equal names")
            return

        check_query = f"""
                        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                        ASK {{
                            :{property} rdf:type owl:ObjectProperty .
                        }}
                        """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: property not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: property not found")
            return
        check_query1 = f"""
                PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                ASK {{
                    :{ind_1} rdf:type owl:NamedIndividual .
                }}
                """

        url1 = "http://PC-Polina:7200/repositories/pbz"
        headers1 = {"Accept": "application/sparql-results+json"}
        data1 = {"query": check_query1}

        response = requests.post(url1, headers=headers1, data=data1)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists1 = response.json()['boolean']
        if not superclass_exists1:
            print("Error: first individual not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:first individual not found")
            return
        check_query2 = f"""
                        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                        ASK {{
                            :{ind_2} rdf:type owl:NamedIndividual .
                        }}
                        """
        url2 = "http://PC-Polina:7200/repositories/pbz"
        headers2 = {"Accept": "application/sparql-results+json"}
        data2 = {"query": check_query2}

        response = requests.post(url2, headers=headers2, data=data2)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists2 = response.json()['boolean']
        if not superclass_exists2:
            print("Error: second individual not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:second individual not found")
            return
        query = """
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
            INSERT DATA {{
                :{} :{} :{}
            }}
        """.format(ind_1, property, ind_2)

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Property to individual added successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Property to individual added successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def change_individual(self):
        # Get user input
        individual_uri = "http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#" + \
                         self.individual_edit12.text()
        new_individual_uri = "http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#" + \
                             self.individual_edit_sub12.text()
        check_query = f"""
                    PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                    PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                    PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                    ASK {{
                        <{individual_uri}> rdf:type owl:NamedIndividual .
                    }}
                    """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        check_query1 = f"""
                            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                            ASK {{
                                <{individual_uri}> rdf:type owl:Class .
                            }}
                            """

        url1 = "http://PC-Polina:7200/repositories/pbz"
        headers1 = {"Accept": "application/sparql-results+json"}
        data1 = {"query": check_query1}

        response1 = requests.post(url1, headers=headers1, data=data1)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists1 = response1.json()['boolean']
        if not superclass_exists and not superclass_exists1:
            print("Error: object for change not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: object for change not found")
            return
        query = f"""
                DELETE {{ <{individual_uri}> ?p ?o }}
                INSERT {{ <{new_individual_uri}> ?p ?o }}
                WHERE {{ <{individual_uri}> ?p ?o }}
                """

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("URL of the object updated successfully!")
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)
        query = f"""
                DELETE {{ ?s ?p <{individual_uri}> }}
                INSERT {{ ?s ?p <{new_individual_uri}> }}
                WHERE {{ ?s ?p <{individual_uri}> }}
                """

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("URL of the object and all links updated successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('URL of the object and all links updated successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def delete_propety_ind(self):
        ind_1 = self.delete_property_edit12.text()
        property = self.delete_property_edit_sub12.text()
        ind_2 = self.delete_property_edit_sub22.text()
        if ind_1.__eq__(ind_2):
            print("Error: equal names")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: equal names")
            return
        check_query = f"""
                PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                ASK {{
                    :{property} rdf:type owl:ObjectProperty .
                }}
                """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: property not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: property not found")
            return
        check_query1 = f"""
        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

        ASK {{
            :{ind_1} rdf:type owl:NamedIndividual .
        }}
        """

        url1 = "http://PC-Polina:7200/repositories/pbz"
        headers1 = {"Accept": "application/sparql-results+json"}
        data1 = {"query": check_query1}

        response = requests.post(url1, headers=headers1, data=data1)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists1 = response.json()['boolean']
        if not superclass_exists1:
            print("Error: first individual not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:first individual not found")
            return
        check_query2 = f"""
                PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                ASK {{
                    :{ind_2} rdf:type owl:NamedIndividual .
                }}
                """
        url2 = "http://PC-Polina:7200/repositories/pbz"
        headers2 = {"Accept": "application/sparql-results+json"}
        data2 = {"query": check_query2}

        response = requests.post(url2, headers=headers2, data=data2)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists2 = response.json()['boolean']
        if not superclass_exists2:
            print("Error: second individual not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:second individual not found")
            return
        query = """
            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
            DELETE {
                    :%s :%s :%s .
                    }
            WHERE {
                    :%s :%s :%s .
                    }
        """ % (ind_1, property, ind_2, ind_1, property, ind_2)

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Property to individual deleted successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Property to individual deleted successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def delete_class(self):
        # Get user input
        class_name = self.delete_class_edit.text()
        # Check if class_uri exists in the ontology
        check_query = f"""
                            PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                            PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                            PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

                            ASK {{
                                :{class_name} rdf:type owl:Class .
                            }}
                            """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: class_name not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: class_name not found")
            return
        # Set up the query
        query = """
           PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
           PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
           PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
           PREFIX owl: <http://www.w3.org/2002/07/owl#>

           DELETE WHERE {
                          ?individual a :%s .
                          ?individual ?p ?o .
                        }
           """ % class_name

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Individuals of class removed successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Individuals of class removed successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

        # Set up the query
        query = """
           PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
           PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
           PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
           PREFIX owl: <http://www.w3.org/2002/07/owl#>

           DELETE WHERE {
                          :%s ?p ?o .
                        }
           """ % class_name

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Class removed successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Class removed successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def delete_instance(self):
        ind = self.delete_instance_edit.text()
        # Check if class_uri exists in the ontology
        check_query = f"""
        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

        ASK {{
            :{ind} rdf:type owl:NamedIndividual .
        }}
        """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: individual not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: individual not found")
            return
        # Set up the query
        query = """
           PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
           PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
           PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
           PREFIX owl: <http://www.w3.org/2002/07/owl#>
           DELETE {
                  ?s ?p ?o .
                }
                WHERE {
                  ?s rdf:type owl:NamedIndividual .
                  ?s rdfs:subClassOf* :%s .
                  ?s ?p ?o .
                }
           """ % ind

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Individual removed successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Individual removed successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)

    def delete_property(self):
        property = self.delete_property_edit.text()
        # Check if class_uri exists in the ontology
        check_query = f"""
        PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
        PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
        PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>

        ASK {{
            :{property} rdf:type owl:ObjectProperty .
        }}
        """

        url = "http://PC-Polina:7200/repositories/pbz"
        headers = {"Accept": "application/sparql-results+json"}
        data = {"query": check_query}

        response = requests.post(url, headers=headers, data=data)

        # Check the response to see if superclass_name exists in the ontology
        superclass_exists = response.json()['boolean']
        if not superclass_exists:
            print("Error: property not found")
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error: property not found")
            return
        # Set up the query
        query = """
                   PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                   PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                   PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
                   PREFIX owl: <http://www.w3.org/2002/07/owl#>

                   DELETE { ?s :%s ?o }
                            WHERE {
                              ?s :%s ?o .
                            };
                   """ % (property, property)

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Property removed successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Property removed successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)
        # Set up the query
        query = """
                   PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
                   PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
                   PREFIX : <http://www.semanticweb.org/polina/ontologies/2023/1/untitled-ontology-12#>
                   PREFIX owl: <http://www.w3.org/2002/07/owl#>

                   DELETE {
                              ?s ?p ?o .
                            }
                            WHERE {
                              ?s rdf:type owl:ObjectProperty .
                              ?s rdfs:subClassOf* :%s .
                              ?s ?p ?o .
                            }
                   """ % property

        # Set up the request
        url = "http://PC-Polina:7200/repositories/pbz/statements"
        headers = {"Content-Type": "application/sparql-update"}
        data = query

        # Send the request
        response = requests.post(url, headers=headers, data=data)

        # Check the response
        if response.ok:
            print("Property removed successfully!")
            self.result_browser.clear()
            self.result_browser.insertPlainText('Property removed successfully')
        else:
            print("Error:", response.text)
            self.result_browser.clear()
            self.result_browser.insertPlainText("Error:" + response.text)


if __name__ == '__main__':
    app = QApplication(sys.argv)
    gui = GraphDBGui()
    sys.exit(app.exec_())
