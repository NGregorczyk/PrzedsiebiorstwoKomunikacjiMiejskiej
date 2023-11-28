public class Przystanek {
    String godzinaPrzyjazdu;


    String nazwaUlicy;

    int linia;

    public Przystanek(String godzinaPrzyjazdu, String nazwaUlicy, int linia) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
        this.nazwaUlicy = nazwaUlicy;
        this.linia = linia;


    }

    public Przystanek() {
    }

    @Override
    public String toString() {
        return "Przystanek{" +
                "godzinaPrzyjazdu='" + godzinaPrzyjazdu + '\'' +
                ", nazwaUlicy='" + nazwaUlicy + '\'' +
                '}';
    }
}
