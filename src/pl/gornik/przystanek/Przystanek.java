package pl.gornik.przystanek;

public class Przystanek {
    String godzinaPrzyjazdu;

private static int id=1;
int temp;
    String nazwaUlicy;

    int linia;

    public Przystanek(String godzinaPrzyjazdu, String nazwaUlicy, int linia) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
        this.nazwaUlicy = nazwaUlicy;
        this.linia = linia;
        this.temp=id++;

    }
//dorobic gettery i settery i dolozyc do tostringa i do obiektow id i zrobic enkapsulacje//////////////////////////////////////////////////////////
    public Przystanek() {
    }

    @Override
    public String toString() {
        return "pl.gornik.Przystanek.pl.gornik.Przystanek{" +

                "godzinaPrzyjazdu='" + godzinaPrzyjazdu + '\'' +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                '}';
    }
}
