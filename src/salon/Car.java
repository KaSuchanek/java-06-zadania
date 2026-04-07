package salon;

public class Car {
    String marka;
    String model;
    int rokProdukcji;
    double cena;

//konstruktor z argumentami
    Car(String marka, String model, int rokProdukcji, double cena) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    String pobierzMarka() {
        return marka;
    }

    String pobierzModel() {
        return model;
    }

    int pobierzRok() {
        return rokProdukcji;
    }

    double pobierzCena() {
        return cena;
    }
}
