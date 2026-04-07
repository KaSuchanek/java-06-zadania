package sklep;

public class Store {
    String nazwaSklepu;

    void ustawNazweSklepu(String nazwa) {
        nazwaSklepu = nazwa; //pole klasy nazwaSklepu i metodę, która przyjmuje wartość nazwa
    }
    void sprzedajProdukt(Product produkt) {
        System.out.println("Sklep " + nazwaSklepu + " sprzedaje produkt: "
                + produkt.nazwaProduktu + " za " + produkt.cenaProduktu + " zł");
    }
}
