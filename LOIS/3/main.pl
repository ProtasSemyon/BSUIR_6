% Лабораторная работа 3 по дисциплине ЛОИС
% Выполнена студентом группы 021701
% БГУИР Протас С.А.
% Вариант 16 - Задача с ханойской башней. Количество штырей - p. На одном n фишек-колец
% по убыванию их размера. Требуется за как можно меньшее количество шагов переложить на другой штырь
% все фишки, чтобы ни одна фишка большего размера не находилась поверх фишки меньшего размера. Штыри и
% количество фишек указывается произвольным образом.
% 09.03.2023

generateList(1, [1]).

% Генерирует список, содержащий натуральные целые числа в диапазоне [1, Len], записывает в переменную List
generateList(Len, List) :- 
  Len1 is Len - 1, 
  generateList(Len1, List1), 
  append(List1, [Len], List).

slice(Num, Num, _, []).

% Получает "срез" списка - записывает значения списка, начиная с элемента с номером First,
% заканчивая элементом с номером Last в список Sliced. 
slice(First, Last, List, Sliced) :-
  length(List, Len),
  Len >= Last,
  Last >= First,
  First >= 0,
  nth0(First, List, HeadVal),
  First1 is First + 1, 
  slice(First1, Last, List, TailVal),
  append([HeadVal], TailVal, Sliced).


% Выводит перемещение 1 диска со штыря с номером A на штырь с номером Z
move(1, A, _, Z, [[A,Z]]) :-
  write(A),
  write('->'), 
  writeln(Z). 

move(N, A, [H|T], Z, P) :-
  length([H|T], L),

  L =< N - 2,
  Height is N - L,
  
  append(T, [Z], NewTail),
  append([A], T, NewHead),

  move(Height, A, NewTail, H, P1),
  move(L, A, T, Z, P2),
  move(Height, H, NewHead, Z, P3),

  append(P1, P2, Q),
  append(Q, P3, P).

% Перемещение N дисков со штыря с номером A на штырь с номером Z, запись результата в список P, свободные штыри - [H|T]
move(N, A, [H|T], Z, P) :-
  length([H|T], L),
  L > N - 2,
  N > 1,
  M1 is N - 1,

  move(1, A, _, H, P1),
  move(M1, A, T, Z, P2),
  move(1, H, _, Z, P3),
  
  append(P1, P2, Q),
  append(Q, P3, P).

% Обработка ситуации, которая не вошла в общий алгоритм
hanoi(1, 2) :- 
  writeln('1->2'),
  writeln('Количество перемещений: 1').

% Выводит процесс перемещения N дисков с первого штыря на последний, используя P штырей
hanoi(N, P) :- 
  N > 0,
  P > 2,
  generateList(P, Pin),
  nth0(0, Pin, Head),
  P1 is P - 1,
  nth0(P1, Pin, End),
  slice(1, P1, Pin, L),
  move(N, Head, L, End, Res),
  length(Res, Len),
  write('Количество перемещений: '),
  writeln(Len).

% Точка входа
main :- 
  writeln("Введите N - количество дисков: "),
  read(N),
  write("\nВведите P - количество штырей: \n"),
  read(P),
  (
    is_of_type(positive_integer, N),
    is_of_type(positive_integer, P),

    hanoi(N, P);
    writeln("Нельзя перемещать")
  );
  (
    writeln("Некорректный ввод")
  ).

:- initialization(main).

