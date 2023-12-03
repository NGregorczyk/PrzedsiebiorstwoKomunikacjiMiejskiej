package pl.gornik.przystanek;

import java.util.ArrayList;

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
    public String getNazwaUlicy() {
        return nazwaUlicy;
    }
    public int getLinia() {
        return linia;
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
