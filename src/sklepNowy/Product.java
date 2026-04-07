package sklepNowy;

public class Product {
    String nazwa;
    double cena;

    //tworzenie obiektu i przypisanie wartosci
    Product(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = this.cena;
    }
    //metoda pokazujaca produkt
    void pokazProdukt(){
        System.out.println("Produkt to: " + nazwa + ", cena produktu " + cena +" zł.");
    }

}
