grammar practicLesson_2;

s : h b;
h : H a;
a : T I a;
b : B c ';';
c : ',' B c;

H: 'h';
T: 't';
I: 'i';
B: 'b';
E: ' ';