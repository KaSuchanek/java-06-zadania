package sklep;
/*Stwórz trzy klasy: Product, Store i Main.
Product przechowuje nazwę i cenę produktu, ma metody ustawDaneProduktu() do ustawienia ceny i nazwy oraz pokazProdukt() do wyświetlania informacji.
Store przechowuje produkty, ma metody ustawNazweSklepu(), sprzedajProdukt().
Main tworzy obiekty Product i Store, ustawia dane produktu i nazwy sklepu i wyświetla informacje.*/

public class Main {
    public static void main(String[] args) {
        Product jablko = new Product();
        jablko.ustawDaneProduktu("jabłko", 5.0);

        Store market = new Store();
        market.ustawNazweSklepu("Żabka");

        jablko.pokazProdukt();
        market.sprzedajProdukt(jablko);
    }
}
