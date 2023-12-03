package pl.gornik.pojazd;

public class Tramwaj extends Pojazd {
    private final String numerPojazdu;
    private String przypisanyMotorniczy;
    private int linia;

    public Tramwaj(String model, int liczba_miejscc, int linia, String numerPojazdu, String przypisanyMotorniczy) {
        super(model, liczba_miejscc);
        this.numerPojazdu = numerPojazdu;
        this.linia = linia;
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }

    public Tramwaj(String model, int liczba_miejscc, String numerPojazdu) {
        super(model, liczba_miejscc);
        this.numerPojazdu = numerPojazdu;

    }

    public String getNumerPojazdu() {
        return numerPojazdu != null ? numerPojazdu : "";
    }

    public String getPrzypisanyMotorniczy() {
        return przypisanyMotorniczy != null ? przypisanyMotorniczy : "";
    }

    public void setPrzypisanyMotorniczy(String przypisanyMotorniczy) {
        this.przypisanyMotorniczy = przypisanyMotorniczy;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    public void usunMotorniczego(String numerPojazdu) {
        if (numerPojazdu.equals(this.numerPojazdu)) {
            this.przypisanyMotorniczy = null;
            System.out.println("Usunięto motorniczego z tramwaju " + this.getNumerPojazdu());
        }
    }

    @Override
    public String toString() {
        return "pl.gornik.Pojazd.Tramwaj{" +
                "numerPojazdu=" + numerPojazdu +
                ", przypisanyMotorniczy='" + przypisanyMotorniczy + '\'' +
                ", model='" + getModel() + '\'' +
                ", liczba_miejscc=" + getLiczbaMiejsc() +
                ", linia=" + linia +
                '}';
    }
}
