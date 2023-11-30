package pl.gornik;

import pl.gornik.przystanek.Przystanek;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Przystanek> Linia1 = new ArrayList<Przystanek>();
        Linia1.add(new Przystanek("9:20", "ul.Zachodnia 20", 1));
        Linia1.add(new Przystanek("9:35", "ul.Szkolna 10a", 1));
        Linia1.add(new Przystanek("9:40", "ul.Szkolna 3", 1));
        Linia1.add(new Przystanek("10:00", "ul.Partyzantów 15b", 1));

        Linia1.add(new Przystanek("10:15", "ul.Zachodnia 20", 1));
        Linia1.add(new Przystanek("10:30", "ul.Szkolna 10a", 1));
        Linia1.add(new Przystanek("10:35", "ul.Szkolna 3", 1));
        Linia1.add(new Przystanek("10:55", "ul.Partyzantów 15b", 1));

        Linia1.add(new Przystanek("11:10", "ul.Zachodnia 20", 1));
        Linia1.add(new Przystanek("11:25", "ul.Szkolna 10a", 1));
        Linia1.add(new Przystanek("11:30", "ul.Szkolna 3", 1));
        Linia1.add(new Przystanek("11:50", "ul.Partyzantów 15b", 1));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Przystanek> Linia2 = new ArrayList<Przystanek>();
        Linia2.add(new Przystanek("6:00", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("6:10", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("6:15", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("6:30", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("6:35", "ul.Szkolna 10a", 2));

        Linia2.add(new Przystanek("6:50", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("7:00", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("7:05", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("7:20", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("7:25", "ul.Szkolna 10a", 2));

        Linia2.add(new Przystanek("7:40", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("7:50", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("7:55", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("8:10", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("8:10", "ul.Szkolna 10a", 2));


        ;


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Linia2.add(new Przystanek("6:00", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("6:10", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("6:15", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("6:30", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("6:35", "ul.Szkolna 10a", 2));

        Linia2.add(new Przystanek("6:50", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("7:00", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("7:05", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("7:20", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("7:25", "ul.Szkolna 10a", 2));

        Linia2.add(new Przystanek("7:40", "ul.Legionowa 3", 2));
        Linia2.add(new Przystanek("7:50", "ul.Lipińskiego 14", 2));
        Linia2.add(new Przystanek("7:55", "ul.Ulanowskiego 2a", 2));
        Linia2.add(new Przystanek("8:10", "ul.Mickiewicza", 2));
        Linia2.add(new Przystanek("8:10", "ul.Szkolna 10a", 2));


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String password = "xyz";
        boolean hasloWprowadzone = false;

        while (true) {
            System.out.println("1.Pasażer");
            System.out.println("2.Pracownik");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                  //  pasazer(scanner);
                    System.out.println("1.Rozkład jazdy autobusów");
                    System.out.println("2.Rozkład jazdy tramwajów");
                    System.out.println("3.Linie tramwajów przejeżdające przez stacje");
                    System.out.println("4.Linie autobusów przejeżdżające przez przystanki");
                    System.out.println("5.Koszt biletów");
                    System.out.println("6. Wyjście");

                    int choice2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice2) {
                        case 1:
                            System.out.println("Rozkład jazdy autobusów");

                            break;

                        case 2:
                            System.out.println("Rozkład jazdy tramwajów");
                            //wybor linii przez scanner
                            break;
                        case 3:
                            System.out.println("Linie tramwajów przejeżdające przez stacje");
                            //linie przejezdzajace przez stacje, przyrownanie scannera do nazwy stacji
                            break;
                        case 4:
                            System.out.println("Linie autobusów przejeżdżające przez przystanki");
                            System.out.println("Podaj nazwę ulicy: ");
                            String nazwaUlicy = scanner.nextLine();

                            // Wyszukanie przystanków dla obu linii autobusowych
                            wyswietlPrzystanki(Linia1, nazwaUlicy);
                            wyswietlPrzystanki(Linia2, nazwaUlicy);
                            break;
                        case 5:
                            System.out.println("Koszt biletów");
                            //metoda do obliczania kosztu biletow, ulgowe i zwykle w zaleznosci od ilosci przystankow
                            break;
                        case 6:
                            System.out.println("Wyjście");
                            System.exit(0);
                        default:
                            System.out.println("Nieprawidłowy wybór");
                            break;
                    }
                    break;

                case 2:
                    if (!hasloWprowadzone) {
                        System.out.println("Wprowadź hasło: ");
                        String pass = scanner.nextLine();
                        if (pass.equals(password)) {
                            pracownikMenu(scanner);

                        } else {
                            System.out.println("Błędne hasło");
                            break;
                        }
                    }


             //   default:
                //    System.out.println("Nieprawidłowy wybór. Wybierz 1 lub 2.");
                //    break;
            }
        }
    }
/*
    private static void pasazer(Scanner scanner) {
        System.out.println("1.Rozkład jazdy autobusów");
        System.out.println("2.Rozkład jazdy tramwajów");
        System.out.println("3.Linie tramwajów przejeżdające przez stacje");
        System.out.println("4.Linie autobusów przejeżdżające przez przystanki");
        System.out.println("5.Koszt biletów");
        System.out.println("6. Wyjście");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Rozkład jazdy autobusów");
                //wybor linii przez scanner
                break;
            case 2:
                System.out.println("Rozkład jazdy tramwajów");
                //wybor linii przez scanner
                break;
            case 3:
                System.out.println("Linie tramwajów przejeżdające przez stacje");
                //linie przejezdzajace przez stacje, przyrownanie scannera do nazwy stacji
                break;
            case 4:
                System.out.println("Linie autobusów przejeżdżające przez przystanki");

                break;
            case 5:
                System.out.println("Koszt biletów");
                //metoda do obliczania kosztu biletow, ulgowe i zwykle w zaleznosci od ilosci przystankow
                break;
            case 6:
                System.out.println("Wyjście");
                System.exit(0);
            default:
                System.out.println("Nieprawidłowy wybór");
                break;
        }

    }
 */


    private static void pracownikMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("1.Zarządzanie pracownikami");
            System.out.println("2.Zarządzanie pojazdami");
            System.out.println("3.Wynagrodzenie");
            System.out.println("4.Wyjście");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    zarządzaniePracownikiem(scanner);
                    break;
                case 2:
                    zarządzaniePojazdem(scanner);
                    break;
                case 3:
                    System.out.println("Wynagrodzenie");
                    //metoda do obliczania wynagrodzenia
                    break;
                case 4:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
                    break;
            }
        } while (choice != 4);
    }

    private static void zarządzaniePracownikiem(Scanner scanner) {
        int choice;
        do {
            System.out.println("1.Zwolnienie pracowników");
            System.out.println("2.Zatrudnienie pracowników");
            System.out.println("3.Przydzielenie motorniczych do tramwajów");
            System.out.println("4.Przydzielenie kierowców do autobusów");
            System.out.println("5.Powrót");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Zwolnienie pracowników");
                    //metoda do zwalniania pracownikow
                    break;
                case 2:
                    System.out.println("Zatrudnienie pracowników");
                    //metoda do zatrudniania pracownikow
                    break;
                case 3:
                    System.out.println("Przydzielenie motorniczych do tramwajów");
                    //metoda do przydzielania pracownikow do tramwajow, sprawdzajaca czy ma tramwaj ma linie
                    break;
                case 4:
                    System.out.println("Przydzielenie kierowców do autobusów");
                    //metoda do przydzielania pracownikow do autobusow, sprawdzajaca czy ma autobus ma linie
                    break;
                case 5:
                    System.out.println("Powrót");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
                    break;
            }
        } while (choice != 5);

    }

    private static void zarządzaniePojazdem(Scanner scanner) {
        int choice;
        do {
            System.out.println("1.Dodawanie tramwajów");
            System.out.println("2.Usuwanie tramwajów");
            System.out.println("3.Dodawanie autobusów");
            System.out.println("4.Usuwanie autobusów");
            System.out.println("5.Przydzielenie tramwajow do linii");
            System.out.println("6.Przydzielenie autobusow do linii");
            System.out.println("7.Powrót");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1.Dodawanie tramwajów");

                    //metoda do dodawania tramwajow, przypisywaniu do tramwaju pracownika, jesli nie ma pracownika to tramwaj bez linii i pracownika
                    //jesli dodany pracownik dodanie go do liniii.
                    break;
                case 2:
                    System.out.println("2.Usuwanie tramwajów");
                    //metoda do usuwania tramwajow
                    break;
                case 3:
                    System.out.println("3.Dodawanie autobusów");
                    //metoda do dodawania autobusow, przypisywaniu do autobusu pracownika, jesli nie ma pracownika to autobus bez linii i pracownika
                    //jesli dodany pracownik dodanie go do liniii.
                    break;
                case 4:
                    System.out.println("4.Usuwanie autobusów");
                    // //metoda do usuwania tramwajow.
                    break;
                case 5:
                    System.out.println("5.Przydzielenie tramwajow do linii");
                    //metoda dodawanie tramwajow do linii, gdy tramwaj nie ma kierowcy trzeba najpierw przypisac motorniczego
                    break;
                case 6:
                    System.out.println("6.Przydzielenie autobusow do linii");
                    //metoda dodawanie autobusow do linii, gdy autobus nie ma kierowcy trzeba najpierw przypisac kierowce
                    break;
                case 7:
                    System.out.println("Powrót");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
                    break;
            }
        } while (choice != 7);
    }
    private static void wyswietlPrzystanki(ArrayList<Przystanek> linia, String nazwaUlicy) {
        System.out.println("Przystanki na ulicy " + nazwaUlicy + ":");
        for (Przystanek przystanek : linia) {
            if (przystanek.getNazwaUlicy().contains(nazwaUlicy)) {
                System.out.println("Linia: " + przystanek.getLinia() +
                        ", Godzina przyjazdu: " + przystanek.getGodzinaPrzyjazdu() +
                        ", Nazwa ulicy: " + przystanek.getNazwaUlicy());
            }
        }
    }

}