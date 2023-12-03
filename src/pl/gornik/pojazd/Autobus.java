package pl.gornik.pojazd;

public class Autobus extends Pojazd {
    private String rejestracja;
    private String przypisanyKierowca;

    private int linia;

    public Autobus(String model, int liczbaMiejsc) {
        super(model, liczbaMiejsc);
    }

    public Autobus(String model, int liczbaMiejsc, int linia, String rejestracja, String przypisanyKierowca) {
        super(model, liczbaMiejsc);
        this.rejestracja = rejestracja;
        this.linia = linia;
        ;
        this.przypisanyKierowca = przypisanyKierowca;
    }

    public Autobus(String model, int liczbaMiejsc, int linia, String rejestracja) {
        super(model, liczbaMiejsc);
        this.rejestracja = rejestracja;
        this.linia = linia;
    }

    public Autobus(String model, int liczbaMiejsc, String rejestracja) {
        super(model, liczbaMiejsc);
        this.rejestracja = rejestracja;

    }

    public Autobus(String model, int liczbaMiejsc, String rejestracja, String przypisanyKierowca) {
        super(model, liczbaMiejsc);
        this.rejestracja = rejestracja;
        this.przypisanyKierowca = przypisanyKierowca;
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

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    public void usunKierowce(String rejestracja) {
        if (rejestracja.equals(this.rejestracja)) {
            this.przypisanyKierowca = null;
            System.out.println("Usunięto kierowcę z autobusu " + this.getRejestracja());
        }
    }

    @Override
    public String toString() {
        return "pl.gornik.Pojazd.pl.gornik.Pojazd{" +
                "model='" + getModel() + '\'' +
                ", liczba_miejscc=" + getLiczbaMiejsc() +
                ", linia=" + linia +
                ", rejestracja='" + rejestracja + '\'' +
                ", przypisanyKierowca='" + przypisanyKierowca +

                '}';
    }

}
