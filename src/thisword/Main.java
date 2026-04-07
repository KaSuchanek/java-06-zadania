package thisword;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kicia", 12);
        Cat cat2 = new Cat("Mruczek", 4);
        // System.out.println(cat1); //tak nie da sie wywolac parametrow konstruktora, mamy jakis adres obiektu w pamięci
        System.out.println(cat1.imie + "  " + cat1.wiek);

        cat1.pokazInfo();
        cat2.pokazInfo();
        System.out.println(cat2.imie + " " + cat2.obliczLudzkiWiek());
    }
}
