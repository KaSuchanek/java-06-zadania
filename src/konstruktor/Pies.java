package konstruktor;

public class Pies {
    String imie;
    int wiek; //mamy kalse ktora zawiera dwa pola

    //konstruktor - Posiada nazwe taka sam jak nazwa klasy, w () podajemy parametry, w {} przypisujemy wartosci
    Pies(String i, int w) {
        imie = i;
        wiek = w;
    }

    Pies(int w) {
        wiek = w;
    }
}