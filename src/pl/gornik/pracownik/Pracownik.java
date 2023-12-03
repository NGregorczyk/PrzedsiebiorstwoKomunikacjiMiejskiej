package pl.gornik.pracownik;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int lataPracy;

    public Pracownik(String imie, String nazwisko, int wiek, int lataPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.lataPracy = lataPracy;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getLataPracy() {
        return lataPracy;
    }

    public void setLataPracy(int lataPracy) {
        this.lataPracy = lataPracy;
    }

    @Override
    public String toString() {
        return "pl.gornik.Pracownik.pl.gornik.Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", lataPracy=" + lataPracy +
                '}';
    }
}
