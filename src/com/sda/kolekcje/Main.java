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

    public static void sort(int[] arr) {
        int n = arr.length;  // okreslamy dlugosc naszej tablicy
        int current;         //
        int otherIndex;

        for (int i = 1; i < n; i++) { // tworzymy petle for, aby przejsc cala tablice.
            // Poczatek petli od miejsca pierwszego, bo pobieramy element do wstawienia w miejsce uporzdkowane z elementu wiekszego o 1 niz obecna iteracja
            // wiec zaczynajac od indexu 1, iteracja bedzie 0, a my zawsze bedziemy o 1 element przed nia
            // Petle kontynuujemy do konca tablicy
            // po zakoczeniu inkrementujemy o 1
            current = arr[i];  // zapamietujemy obecny element, ktory bedzie pobierany z indexu o  1 wiekszego od obecnej iteracji, czyli wartosc spod indexu i
            otherIndex = i;    // index innego elementu. Tworzymy, zeby moc porownywac zmienna current. Wskazuje na poczatku to samo miejsce co nasz licznik
            while (otherIndex > 0 && current < arr[otherIndex - 1]) { // 1 warunek: sprawdzamy czy nie doszlismy do poczatku czesci uporzadkowanej. 2 warunek: Element poprzedzajacy czyli wartosc spod indexu otherIndex ale o 1 mniejsza czyli- mniejszy od wartosci pod indexem otherIndex -1
                arr[otherIndex] = arr[otherIndex - 1]; // jesli warunek jest spelniony, to nadpisujemy element po prawej stronie elementem po lewej stronie
                otherIndex--; // zmniejszamy index
            }
            arr[otherIndex] = current; // nasz obecny element laduje na odpowiadajacej mu pozycji
        }
    }
}
