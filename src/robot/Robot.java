package robot;
/*Utwórz klasę Robot, a w niej:
a) metodę statyczną wyswietlSystem(): która wypisuje nazwę systemu,
b) metodę niestatyczną przywitajSie(), która wypisuje komunikat powitania,
c) metodę niestatyczną idzDo(), która wypisuje miejsce.
W metodzie main wywołaj : wyswietlSystem(), przywitajSie(), idzDo()*/

public class Robot {
    public static void main(String[] args) {

        String imie = "RoboRock";
        String miejsce = "kuchni";

        wyswietlSystem();
        Robot robot = new Robot();
        robot.przywitajSie(imie);
        robot.ideDo(miejsce);
    }

    public static void wyswietlSystem() {
        System.out.println("System Robo v1.0");
    }

    public void przywitajSie(String imie) {
        System.out.println("Cześć, jestem robotot " + imie);
    }

    public void ideDo(String miejsce) {
        System.out.println("Idę do " + miejsce);
    }

}
