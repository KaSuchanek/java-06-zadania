package sklep;

public class Product {
    String nazwaProduktu;
    double cenaProduktu;

    void ustawDaneProduktu(String nazwa, double cena) {
        nazwaProduktu = nazwa;
        cenaProduktu = cena;
    }

    void pokazProdukt() {
        System.out.println("Produkt: " + nazwaProduktu + ", cena: " + cenaProduktu);
    }
}