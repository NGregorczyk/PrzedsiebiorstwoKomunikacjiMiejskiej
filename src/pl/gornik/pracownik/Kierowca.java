package pl.gornik.pracownik;

public class Kierowca extends Pracownik {
    private  String rejestracja;

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



    @Override
    public String toString() {
        return "pl.gornik.Pracownik.Kierowca{" +
                "rejestracja='" + rejestracja + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko()+ '\'' +
                ", wiek=" + getWiek() +
                ", lataPracy=" + getLataPracy() +
                '}';
    }
}
