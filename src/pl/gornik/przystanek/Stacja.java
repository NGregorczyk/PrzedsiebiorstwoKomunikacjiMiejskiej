package pl.gornik.przystanek;

public class Stacja {
    private String godzinaPrzyjazdu;
    private static int id = 1;
    int temp;
    private String nazwaStacji;

    private int stacja;

    public Stacja(String godzinaPrzyjazdu, String nazwaStacji, int stacja) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
        this.nazwaStacji = nazwaStacji;
        this.stacja = stacja;
        this.temp = id++;

    }

    public String getGodzinaPrzyjazdu() {
        return godzinaPrzyjazdu;
    }

    public void setGodzinaPrzyjazdu(String godzinaPrzyjazdu) {
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
    }


    public String getNazwaStacji() {
        return nazwaStacji;
    }

    public void setNazwaStacji(String nazwaStacji) {
        this.nazwaStacji = nazwaStacji;
    }

    public int getStacja() {
        return stacja;
    }

    public void setStacja(int stacja) {
        this.stacja = stacja;
    }


    @Override
    public String toString() {
        return "Przystanek{" +
                "godzinaPrzyjazdu='" + godzinaPrzyjazdu + '\'' +
                ", id=" + temp +
                ", nazwaUlicy='" + nazwaStacji + '\'' +
                ", linia=" + stacja +
                '}';
    }
}

