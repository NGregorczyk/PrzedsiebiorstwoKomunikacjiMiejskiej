package pl.gornik.pracownik;

public class Motorniczy extends Pracownik {
    String numerPojazdu;

    public Motorniczy(String imie, String nazwisko, int wiek, int lataPracy, String numerPojazdu) {
        super(imie, nazwisko, wiek, lataPracy);
    this.numerPojazdu=numerPojazdu;
    }
    public Motorniczy(String imie, String nazwisko, int wiek, int lataPracy) {
        super(imie, nazwisko, wiek, lataPracy);
    }

    public String getNumerPojazdu() {
        return numerPojazdu;
    }

    public void setNumerPojazdu(String numerPojazdu) {
        this.numerPojazdu = numerPojazdu;
    }

    @Override
    public String toString() {
        return "pl.gornik.Pracownik.Kierowca{" +
                "NumerPojazdu='" + numerPojazdu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", lataPracy=" + lataPracy +
                '}';
    }
}