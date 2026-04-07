package thisword;

public class Cat {
    String imie;
    int wiek;

    //identyczne nazwy, jedna odwoluje sie do pola klasy, druga do parametru kosntruktora (zmiennej lokalnej konstruktora)
    Cat(String imie, int wiek) {
        this.imie = imie; //aby podpowiedziec ze chcemy odniesc sie do pola klasy korzystamy ze slowa kluczowego this
        this.wiek = wiek;
    }

    int obliczLudzkiWiek(){
        return this.wiek*7;
    }

    void pokazInfo(){
        System.out.println("Kot: " + imie + " i ma " + wiek + "lat");
        System.out.println("Ma zatem: " + obliczLudzkiWiek() + " ludzkich lat");
    }
}
