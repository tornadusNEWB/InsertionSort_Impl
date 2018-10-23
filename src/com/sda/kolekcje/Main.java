package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {
        /*
	 TEORIA
        podzial struktury danych np. tablica na czesc uporzadkowana i nieuporzadkowana
        pobieramy 1 z lewej element z czesci nieuporzadkowanej i wstawiamy go do czesci uporzadkowanej na odpowiadajace mu miescje
        Do zerowej iteracji przystepujemy z elementem spod indeksu 0 czesci uporzadkowanej
        Czyli Pierwszym elementem z czesci nieuporzadkowanej bedzie element spod indeksu n+1

        Na poczatku zapamietujemy element obecy czyli element obecej iteracji (3)
        i tak dlugo jak ten obecny element bedzie mniejszy od elemetow porownywanych bedziemy przesuwac elementy porownywane o 1 w prawo
        a pozniej wstawiamy obecny element na odpowiajace mu miejsce

        1: 3 jest mniejsza od 4, czyli przepisujemy 4 w prawo, a 3 wstawiamy na odpowiednie miesjce. Czesc uporzadkowana wzrosla o 1
        2: Nasz obecny element to element spod indeksu o i+1, powrownujemy 2 z 4. 4 przepisujemy o 1 w prawo. Pozniej porownujemy 3 z 2. 3 jest przepisywana o 1 w prawo
        3: Porownujemy 4 z 5. Element jest na odpowiedniej pozycji, reszta bez zmian
        4: pobieramy element spod indexu o 1 wiekszy czyli 7. Porownujemy 7 z 5.
        5: pobieramy element spod indexu o 1 wiekszy czyli 1. Porownjemy 1 z 7. 1 jest mnijesza od 7. Przepisujemy element wiekszy o 1 w prawo. itd.
        6: pobieramy 9. Powownujemy 9 z 7. 

        0: 4| 3 2 5 7 1 9
        1: 3 4| 2 5 7 1 9
        2: 2 3 4| 5 7 1 9
        3: 2 3 4 5| 7 1 9
        4: 2 3 4 5 7| 1 9
        5: 1 2 3 4 5 7| 9
        6: 1 2 3 4 5 7  9

        Zlozonosc czasowa : O(n^2) lub O(n)
        Zlozonosc pamieciowa: O(1)
        Pozytywny przypadek- Przydatny do wstępnie posortowanych danych O(n)

*/
    }
}
