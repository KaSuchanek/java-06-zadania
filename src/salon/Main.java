/*Utwórz klasę o nazwie Car, a w niej:
a) pola: marka, model, rokProdukcji, cena;
b) metody: pobierzMarke(), pobierzModel(), pobierzRok(), pobierzCene(), które będą zwracać dane z odpowiednich pól;
c) konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami.
Utwórz klasę Main, a w niej
a) minimum cztery równe obiekty klasy Car,
b) wyświetlisz dane samochodów, wywołując stworzone metody,
c) dodaj prostą logikę sprawdzającą czy cena przekracza zaplanowany budżet.*/

package salon;

public class Main {
    public static void main(String[] args) {

        ///tworzymy kilka obiektów z różnymi parametrami, każdy obiekt ma unikalna nazwę
        Car car1 = new Car("Mercedes", "GLS", 2024, 500000);
        Car car2 = new Car("Skoda", "Octavia", 2019, 85000);
        Car car3 = new Car("Tesla", "Model 3", 2023, 195000);
        Car car4 = new Car("VW", "Golf", 2010, 15000);

        double budzet = 130000;

        // chemy wyswietlic wszytkie auta w salonie, stworzymy tablice, a pozniej petla
        //przejedziemy przez wszytkie elelemnty
        Car[] salon = {car1, car2, car3, car4};

        System.out.println("\n--- Oferta salonu ---");
// petla for-each: for (Typ nazwaZmiennej : nazwaTablicy) { ... }
        for (Car car : salon) {
            //rownoznaczne z klasyczna wersja dla przechodzenia przez elementy tablicy
            //for (int i = 0; i < salon.length; i++) {
            System.out.println("----------------------------");
            System.out.println("MARKA:  " + car.pobierzMarka());
            System.out.println("MODEL:  " + car.pobierzModel());
            System.out.println("ROCZNIK: " + car.pobierzRok());
            System.out.println("CENA:   " + car.pobierzCena() + " PLN");
// i jeszcze czy budzet jest wystarczajacy
            if (car.pobierzCena() <= budzet) {
                System.out.println("Dostepne");
            } else {
                System.out.println("Powyżej budżetu.");
            }
        }
    }
}