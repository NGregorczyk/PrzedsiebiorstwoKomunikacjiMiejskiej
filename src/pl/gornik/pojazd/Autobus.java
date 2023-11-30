package pl.gornik.pojazd;

public class Autobus extends Pojazd {
    private String rejestracja;
    private   String przypisanyKierowca;
    private int pojemnoscBaku;
    private int linia;


    public Autobus(String model, int liczbaMiejsc) {
        super(model, liczbaMiejsc);
    }

    public Autobus(String model, int liczbaMiejsc, int linia ,String rejestracja, String przypisanyKierowca, int pojemnoscBaku) {
        super(model, liczbaMiejsc);
        this.rejestracja=rejestracja;
        this.linia=linia;
        this.pojemnoscBaku=pojemnoscBaku;
        this.przypisanyKierowca=przypisanyKierowca;
    }


    public Autobus(String model, int liczbaMiejsc, int linia,String rejestracja, int pojemnoscBaku) {
        super(model, liczbaMiejsc);
        this.rejestracja=rejestracja;
        this.linia=linia;
        this.pojemnoscBaku=pojemnoscBaku;
    }
    public Autobus(String model, int liczbaMiejsc,String rejestracja, int pojemnoscBaku) {
        super(model, liczbaMiejsc);
        this.rejestracja=rejestracja;
        this.pojemnoscBaku=pojemnoscBaku;
    }
    public Autobus(String model, int liczbaMiejsc ,String rejestracja, String przypisanyKierowca, int pojemnoscBaku) {
        super(model, liczbaMiejsc);
        this.rejestracja=rejestracja;
        this.pojemnoscBaku=pojemnoscBaku;
        this.przypisanyKierowca=przypisanyKierowca;
    }


    public double cenaPaliwa(int pojemnoscBaku){
        double cenaZaLitr=6.6;
        return pojemnoscBaku*cenaZaLitr;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public String getPrzypisanyKierowca() {
        return przypisanyKierowca;
    }

    public void setPrzypisanyKierowca(String przypisanyKierowca) {
        this.przypisanyKierowca = przypisanyKierowca;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    @Override
    public String toString() {
        return "pl.gornik.Pojazd.pl.gornik.Pojazd{" +
                "model='" + getModel() + '\'' +
                ", liczba_miejscc=" + getLiczbaMiejsc() +
                ", linia=" + linia +
                ", rejestracja='" + rejestracja + '\'' +
                ", przypisanyKierowca='" + przypisanyKierowca + '\'' +
                ", pojemnoscBaku=" + pojemnoscBaku +

                '}';
    }

}
