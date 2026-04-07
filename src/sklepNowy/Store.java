package sklepNowy;

public class Store {
    String nazwaSklepu;

    //konstruktor
    Store(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }

    //metoda
    void sprzedajProdukt(Product product) {
        System.out.println("W sklepie " + nazwaSklepu + " sprzedano " + product.nazwa);
    }
}
