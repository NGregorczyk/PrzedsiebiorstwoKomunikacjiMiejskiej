package pl.gornik.pracownik;

import java.util.Scanner;

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
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public int getLataPracy() {
        return lataPracy;
    }

    public static String wprowadzImie(Scanner scanner) {
        String imie;
        do {
            System.out.println("Podaj imię pracownika:");
            imie = scanner.nextLine();
            if (imie.isEmpty()) {
                System.out.println("Imię nie może być puste. Wprowadź ponownie.");
            }
        } while (imie.isEmpty());
        return imie;
    }

    public static String wprowadzNazwisko(Scanner scanner) {
        String nazwisko;
        do {
            System.out.println("Podaj nazwisko pracownika:");
            nazwisko = scanner.nextLine();
            if (nazwisko.isEmpty()) {
                System.out.println("Nazwisko nie może być puste. Wprowadź ponownie.");
            }
        } while (nazwisko.isEmpty());
        return nazwisko;
    }

    public static int wprowadzWiek(Scanner scanner) {
        int wiek;
        do {
            System.out.println("Podaj wiek pracownika:");
            while (!scanner.hasNextInt()) {
                System.out.println("Wiek musi być liczbą całkowitą. Wprowadź ponownie.");
                scanner.next();
            }
            wiek = scanner.nextInt();
            scanner.nextLine();
            if (wiek < 18) {
                System.out.println("Wiek pracownika nie może być poniżej 18 lat. Wprowadź ponownie.");
            }
        } while (wiek < 18);
        return wiek;
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
