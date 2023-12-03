package pl.gornik.pracownik;

import java.util.ArrayList;
import java.util.Scanner;

public class Kierowca extends Pracownik {
    private String rejestracja;

    public Kierowca(String imie, String nazwisko, int wiek, int lataPracy, String rejestracja) {
        super(imie, nazwisko, wiek, lataPracy);
        this.rejestracja = rejestracja;
    }

    public Kierowca(String imie, String nazwisko, int wiek, int lataPracy) {
        super(imie, nazwisko, wiek, lataPracy);
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public double obliczWynagrodzenie() {
        double podstawa = 3000;
        double procentLataPracy = 0.02 * getLataPracy();
        return podstawa + (podstawa * procentLataPracy);
    }

    public static Kierowca znajdzPracownikaPoNazwisku(ArrayList<Kierowca> listaPracownikow, String nazwisko) {
        for (Kierowca kierowca : listaPracownikow) {
            if (kierowca.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return kierowca;
            }
        }
        return null;
    }

    public void zwolnijPracownika() {
        System.out.println("Zwolniono kierowcę: " + this);
    }

    public static Kierowca dodajKierowce(Scanner scanner) {
        String imie = wprowadzImie(scanner);
        String nazwisko = wprowadzNazwisko(scanner);
        int wiek = wprowadzWiek(scanner);
        int lataPracy = 0;
        return new Kierowca(imie, nazwisko, wiek, lataPracy);
    }

    @Override
    public String toString() {
        return "pl.gornik.Pracownik.Kierowca{" +
                "rejestracja='" + rejestracja + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", wiek=" + getWiek() +
                ", lataPracy=" + getLataPracy() +
                '}';
    }
}
