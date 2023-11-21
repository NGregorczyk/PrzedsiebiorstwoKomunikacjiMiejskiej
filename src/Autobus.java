public class Autobus extends Pojazd {
    String rejestracja;
    String przypisanyKierowca;
    int pojemnoscBaku;


    public Autobus(String model, int liczba_miejscc, int linia) {
        super(model, liczba_miejscc, linia);
    }

    public Autobus(String model, int liczba_miejscc, int linia,String rejestracja, String przypisanyKierowca, int pojemnoscBaku) {
        super(model, liczba_miejscc, linia);
        this.rejestracja=rejestracja;
        this.pojemnoscBaku=pojemnoscBaku;
        this.przypisanyKierowca=przypisanyKierowca;
    }


    public Autobus(String model, int liczba_miejscc, int linia,String rejestracja, int pojemnoscBaku) {
        super(model, liczba_miejscc, linia);
        this.rejestracja=rejestracja;
        this.pojemnoscBaku=pojemnoscBaku;
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

    @Override
    public String toString() {
        return "Pojazd{" +
                "model='" + model + '\'' +
                ", liczba_miejscc=" + liczba_miejscc +
                ", linia=" + linia +
                ", rejestracja='" + rejestracja + '\'' +
                ", przypisanyKierowca='" + przypisanyKierowca + '\'' +
                ", pojemnoscBaku=" + pojemnoscBaku +

                '}';
    }

}
