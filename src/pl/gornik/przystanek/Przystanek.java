package pl.gornik.przystanek;

public class Przystanek {
    private String godzinaPrzyjazdu;

    private static int id = 1;
  int temp;
    private String nazwaUlicy;

    private int linia;

    public Przystanek(String godzinaPrzyjazdu, String nazwaUlicy, int linia) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
        this.nazwaUlicy = nazwaUlicy;
        this.linia = linia;
        this.temp = id++;

    }

    public String getGodzinaPrzyjazdu() {
        return godzinaPrzyjazdu;
    }

    public void setGodzinaPrzyjazdu(String godzinaPrzyjazdu) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
    }



    public String getNazwaUlicy() {
        return nazwaUlicy;
    }

    public void setNazwaUlicy(String nazwaUlicy) {
        this.nazwaUlicy = nazwaUlicy;
    }

    public int getLinia() {
        return linia;
    }

    public void setLinia(int linia) {
        this.linia = linia;
    }

    //dorobic gettery i settery i dolozyc do tostringa i do obiektow id i zrobic enkapsulacje//////////////////////////////////////////////////////////
    public Przystanek() {
    }

    @Override
    public String toString() {
        return "Przystanek{" +
                "godzinaPrzyjazdu='" + godzinaPrzyjazdu + '\'' +
                ", id=" + temp +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                ", linia=" + linia +
                '}';
    }
}
