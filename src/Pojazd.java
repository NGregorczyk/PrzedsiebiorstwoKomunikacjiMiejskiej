public class Pojazd {

    String model;
    int liczba_miejscc;
    int linia;


    public Pojazd(String model, int liczba_miejscc, int linia) {
        this.model = model;
        this.liczba_miejscc = liczba_miejscc;
        this.linia = linia;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLiczba_miejscc() {
        return liczba_miejscc;
    }

    public void setLiczba_miejscc(int liczba_miejscc) {
        this.liczba_miejscc = liczba_miejscc;
    }

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "model='" + model + '\'' +
                ", liczba_miejscc=" + liczba_miejscc +
                ", linia=" + linia +
                '}';
    }
}
