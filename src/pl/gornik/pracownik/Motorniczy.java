package pl.gornik.pracownik;

import java.util.ArrayList;

public class Motorniczy extends Pracownik {
    private String numerPojazdu;

    public Motorniczy(String imie, String nazwisko, int wiek, int lataPracy, String numerPojazdu) {
        super(imie, nazwisko, wiek, lataPracy);
        this.numerPojazdu = numerPojazdu;
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

    public double obliczWynagrodzenie() {
        double podstawa = 3500;
        double procentLataPracy = 0.02 * getLataPracy();
        return podstawa + (podstawa * procentLataPracy);

    }

    public static Motorniczy znajdzPracownikaPoNazwisku(ArrayList<Motorniczy> listaPracownikow, String nazwisko) {
        for (Motorniczy motorniczy : listaPracownikow) {
            if (motorniczy.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return motorniczy;
            }
        }
        return null;
    }

    public void zwolnijPracownika() {
        System.out.println("Zwolniono motorniczego: " + this);
    }

    @Override
    public String toString() {
        return "pl.gornik.Pracownik.Kierowca{" +
                "NumerPojazdu='" + numerPojazdu + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", wiek=" + getWiek() +
                ", lataPracy=" + getLataPracy() +
                '}';
    }
}