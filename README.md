# javaProject

Acest proiect este un vizualizator pentru demonstrarea algoritmului lui Dijkstra, fiind realizat folosind Swing pentru desenarea si afisarea grafurilor( atat rezolvate cat si nerezolvate). 

Aplicatia dispune de 3 butoane principale( play, care rezolva graful curent( distanta minima pana la destinatie sau pana la un nod ales manual), daca are sursa, destinatie si nu este inclus vreun nod izolat; butonul de restart care sterge toate nodurile si muchiile si da repaint la JPanel; butonul de informatii care explica toate combinatiile de taste)

Exista mai multe combinatii de taste, realizate prin implementarea la clasa care se ocupa cu JPanel ul a MouseListener si MouseMotionListener( override), creare nodurilor, a muchiilor, alocarea costurilor pe muchii, mutarea nodurilor, stergerea nodurilor/muchiilor, promovarea unui nod la grad de sursa/ destinatie sau rezolvarea grafului pentru un anume nod ales manual( functioneaza abia dupa ce este apassat butonul de play)

Pentru desenarea pe JPanel a nodurilor, muchiilor, etc. am folosit o variabila declarata ca si Graphics2D( pentru noduri fillOval unde am adunat un radius, variabila creata manual iar pentru muchii setStroke si drawLine).

In legatura cu partea de teorie a grafurilor, clasa DijkstraAlgorithm va avea 2 HashMap uri, una pentru predecesori, care va contoriza practic drumurile cele mai scurte de la noduri la noduri si una pentru distante( de la nod la sursa). la fiecare pas se iau toti vecinii, nodul curent le este atribuit ca precedent si se actualizeaza distantele, dupa care cu un priorityQueue( va avea ca si comparator valoarea din hash map ul cu distante) vom alege cel mai "apropiat" nod.La fiecare pas se vor compara noile distante de la sursa la noduri cu cele vechi si se vor actualiza daca este cazul. La sfarsit toate drumurile( cele mai scurte, pana la oricare nod) vor fi stocate in map ul cu precedenta, cand va fi apelata getPath se va lua din precedenta acel nod apelat si se vor salva nodurile din drumul lui pana la sursa. Cu collection.reverse inversam ordinea si o returnam.

Documentatie:
1. Stack Overflow
2. Programare Avansata UAIC - site 
3. Oracle.com
4. Geeksforgeeks
5. Algoritmica Grafurilor UAIC -site
6. Java GUI: Full Course (FREE) - Bro Code( youtube)
7. + mai multe surse diferite folosite maxim o data
