public class Tramwaj extends Pojazd {
    String numerPojazdu;
    String przypisanyMotorniczy;
    int linia;

    public Tramwaj(String model, int liczba_miejscc, int linia, String numerPojazdu, String przypisanyMotorniczy) {
        super(model, liczba_miejscc);
        this.numerPojazdu = numerPojazdu;
        this.linia = linia;
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }

    public Tramwaj(String model, int liczba_miejscc, int linia, String numerPojazdu) {
        super(model, liczba_miejscc);
        this.linia = linia;
        this.numerPojazdu = numerPojazdu;

    }

    public String getNumerPojazdu() {
        return numerPojazdu;
    }

    public void setNumerPojazdu(String numerPojazdu) {
        this.numerPojazdu = numerPojazdu;
    }

    public String getPrzypisanyMotorniczy() {
        return przypisanyMotorniczy;
    }

    public void setPrzypisanyMotorniczy(String przypisanyMotorniczy) {
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "numerPojazdu=" + numerPojazdu +
                ", przypisanyMotorniczy='" + przypisanyMotorniczy + '\'' +
                ", model='" + model + '\'' +
                ", liczba_miejscc=" + liczbaMiejsc +
                ", linia=" + linia +
                '}';
    }
}
