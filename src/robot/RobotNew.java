package robot;

public class RobotNew {
    public static void main(String[] args) {

        String imie = "RoboRock";
        String[] pomieszczenia = {"kuchnia", "łazienka", "salon"};

        wyswietlSystem();
        Robot robot = new Robot();
        robot.przywitajSie(imie);
        // pętla for-each, co tu sie dzieje
        // dla kazdego elelmntu z tablicy [pomieszczenia], pobierz kolejna wartosc zmiennej [miejce]
        // i wykonaj metode
        // konstrukcja ogolna: for (tym zmiennej : tablica) {cialo petli}
        for (String miejsce : pomieszczenia) {
            robot.ideDo(miejsce);
        }

    }

    public static void wyswietlSystem() {
        System.out.println("System Robo v1.0");
    }

    public void przywitajSie(String imie) {
        System.out.println("Cześć, jestem robotot " + imie);
    }

    public void ideDo(String miejsce) {
        System.out.println("Idę do: " + miejsce);
    }
}
