package sklepNowy;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("jabłka", 15);
        Store store = new Store("Żabka");
        product1.pokazProdukt();
        store.sprzedajProdukt(product1);

    }
}
