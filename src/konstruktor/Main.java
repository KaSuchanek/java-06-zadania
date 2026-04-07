package konstruktor;

public class Main {
    public static void main(String[] args) {
       // Pies pies = new Pies(); //tworzymu obiekt, rezerwacja miejsca
        //pies.imie = "Nuka"; //tu dopiero przypisujemy wartosci
        //pies.wiek = 6;

        //zeby od razu przy tworzeniu obiektu podac atrybuty uzywamy konstruktorów w klasie Pies
        Pies pies = new Pies("Nuka", 6);

        System.out.println(pies.imie + "  " + pies.wiek);

        Pusty pusty = new Pusty(); //dziala
        Pies pies1 = new Pies(6); //nie dziala bez parametrow, chce abysmy podali parametry
        System.out.println(pies1.wiek);

    }
}
