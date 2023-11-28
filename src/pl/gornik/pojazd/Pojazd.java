package pl.gornik.pojazd;

public class Pojazd {

    String model;
    int liczbaMiejsc;



    public Pojazd(String model, int liczbaMiejsc) {
        this.model = model;
        this.liczbaMiejsc = liczbaMiejsc;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }


    @Override
    public String toString() {
        return "pl.gornik.Pojazd.pl.gornik.Pojazd{" +
                "model='" + model + '\'' +
                ", liczba_miejscc=" + liczbaMiejsc +
                '}';
    }
}
