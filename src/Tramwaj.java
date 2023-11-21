public class Tramwaj extends Pojazd {
    int numerPojazdu;
    String przypisanyMotorniczy;

    public Tramwaj(String model, int liczba_miejscc, int linia, int numerPojazdu, String przypisanyMotorniczy) {
        super(model, liczba_miejscc, linia);
        this.numerPojazdu = numerPojazdu;
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }
    public Tramwaj(String model, int liczba_miejscc, int linia, int numerPojazdu) {
        super(model, liczba_miejscc, linia);
        this.numerPojazdu = numerPojazdu;

    }


    public int getNumerPojazdu() {
        return numerPojazdu;
    }

    public void setNumerPojazdu(int numerPojazdu) {
        this.numerPojazdu = numerPojazdu;
    }

    public String getPrzypisanyMotorniczy() {
        return przypisanyMotorniczy;
    }

    public void setPrzypisanyMotorniczy(String przypisanyMotorniczy) {
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }




    @Override
    public String toString() {
        return "Tramwaj{" +
                "numerPojazdu=" + numerPojazdu +
                ", przypisanyMotorniczy='" + przypisanyMotorniczy + '\'' +
                ", model='" + model + '\'' +
                ", liczba_miejscc=" + liczba_miejscc +
                ", linia=" + linia +
                '}';
    }
}
