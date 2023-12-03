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

    public static double obliczKosztBiletow(ArrayList<Przystanek> przystanki, String poczatkowyPrzystanek, String koncowyPrzystanek, boolean ulgowy) {
        int indeksPoczatkowego = -1;
        int indeksKoncowego = -1;
        for (int i = 0; i < przystanki.size(); i++) {
            if (przystanki.get(i).getNazwaUlicy().equals(poczatkowyPrzystanek)) {
                indeksPoczatkowego = i;
            }
            if (przystanki.get(i).getNazwaUlicy().equals(koncowyPrzystanek)) {
                indeksKoncowego = i;
            }
        }

        if (indeksPoczatkowego == -1 || indeksKoncowego == -1) {
            System.out.println("Nie znaleziono przystanku początkowego lub końcowego.");
            return -1;
        }

        int liczbaPrzejechanychPrzystankow = Math.abs(indeksKoncowego - indeksPoczatkowego) + 1;

        double koszt = liczbaPrzejechanychPrzystankow * 2.5;

        if (ulgowy) {
            koszt *= 0.8;
        }

        return koszt;
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
