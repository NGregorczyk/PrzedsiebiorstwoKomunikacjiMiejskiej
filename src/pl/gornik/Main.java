package pl.gornik;

import pl.gornik.pojazd.Autobus;
import pl.gornik.pojazd.Tramwaj;
import pl.gornik.pracownik.Kierowca;
import pl.gornik.pracownik.Motorniczy;
import pl.gornik.przystanek.Przystanek;
import pl.gornik.przystanek.Stacja;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Tramwaj> tramwaje = new ArrayList<>();
        Tramwaj t1 = new Tramwaj("116ND", 80, 1, "11", "Kołodziej");
        Tramwaj t2 = new Tramwaj("NGd99", 90, 2, "13", "Wilk");
        Tramwaj t3 = new Tramwaj("FPS118N", 60, 3, "15", "Malinowski");
        Tramwaj t4 = new Tramwaj("NGT6", 75, "25");
        tramwaje.add(t1);
        tramwaje.add(t4);
        tramwaje.add(t3);
        tramwaje.add(t2);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Autobus> autobusy = new ArrayList<>();
        Autobus a1 = new Autobus("10LF", 45, 1, "RTA 5S94", "Kowalski");
        Autobus a2 = new Autobus("12LF", 20, 2, "RTA 7W40", "Nowak");
        Autobus a3 = new Autobus("9LE", 35, 3, "RTA 4M35", "Kraqwczyk");
        Autobus a4 = new Autobus("12LFH", 45);
        autobusy.add(a1);
        autobusy.add(a4);
        autobusy.add(a3);
        autobusy.add(a2);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Stacja> stacja3 = new ArrayList<>();
        stacja3.add(new Stacja("21:30", "ul.Szybowa", 3));
        stacja3.add(new Stacja("21:35", "ul.Krasickiego", 3));
        stacja3.add(new Stacja("21:40", "ul.Słowiańska", 3));
        stacja3.add(new Stacja("21:45", "ul.Rybna", 3));
        stacja3.add(new Stacja("21:50", "ul.Mariacka", 3));
        stacja3.add(new Stacja("22:00", "ul.Graniczna", 3));

        stacja3.add(new Stacja("22:10", "ul.Szybowa", 3));
        stacja3.add(new Stacja("22:15", "ul.Krasickiego", 3));
        stacja3.add(new Stacja("22:20", "ul.Słowiańska", 3));
        stacja3.add(new Stacja("22:25", "ul.Rybna", 3));
        stacja3.add(new Stacja("22:30", "ul.Mariacka", 3));
        stacja3.add(new Stacja("22:40", "ul.Graniczna", 3));


        ArrayList<Stacja> stacja2 = new ArrayList<>();
        stacja2.add(new Stacja("11:00", "ul.Szybowa", 2));
        stacja2.add(new Stacja("11:10", "ul.Krasickiego", 2));
        stacja2.add(new Stacja("11:15", "ul.Słowiańska", 2));
        stacja2.add(new Stacja("11:25", "ul.Rybna", 2));
        stacja2.add(new Stacja("11:40", "ul.Mariacka", 2));
        stacja2.add(new Stacja("11:50", "ul.Graniczna", 2));

        stacja2.add(new Stacja("12:00", "ul.Szybowa", 2));
        stacja2.add(new Stacja("12:10", "ul.Krasickiego", 2));
        stacja2.add(new Stacja("12:15", "ul.Słowiańska", 2));
        stacja2.add(new Stacja("12:25", "ul.Rybna", 2));
        stacja2.add(new Stacja("12:40", "ul.Mariacka", 2));
        stacja2.add(new Stacja("12:50", "ul.Graniczna", 2));

        stacja2.add(new Stacja("13:00", "ul.Szybowa", 2));
        stacja2.add(new Stacja("13:10", "ul.Krasickiego", 2));
        stacja2.add(new Stacja("13:15", "ul.Słowiańska", 2));
        stacja2.add(new Stacja("13:25", "ul.Rybna", 2));
        stacja2.add(new Stacja("13:40", "ul.Mariacka", 2));
        stacja2.add(new Stacja("13:50", "ul.Graniczna", 2));


        ArrayList<Stacja> stacja1 = new ArrayList<>();
        stacja1.add(new Stacja("5:00", "ul.Szybowa", 1));
        stacja1.add(new Stacja("5:05", "ul.Krasickiego", 1));
        stacja1.add(new Stacja("5:10", "ul.Słowiańska", 1));
        stacja1.add(new Stacja("5:15", "ul.Rybna", 1));
        stacja1.add(new Stacja("5:20", "ul.Mariacka", 1));
        stacja1.add(new Stacja("5:25", "ul.Graniczna", 1));

        stacja1.add(new Stacja("5:30", "ul.Szybowa", 1));
        stacja1.add(new Stacja("5:35", "ul.Krasickiego", 1));
        stacja1.add(new Stacja("5:40", "ul.Słowiańska", 1));
        stacja1.add(new Stacja("5:45", "ul.Rybna", 1));
        stacja1.add(new Stacja("5:50", "ul.Mariacka", 1));
        stacja1.add(new Stacja("5:55", "ul.Graniczna", 1));

        stacja1.add(new Stacja("6:00", "ul.Szybowa", 1));
        stacja1.add(new Stacja("6:05", "ul.Krasickiego", 1));
        stacja1.add(new Stacja("6:10", "ul.Słowiańska", 1));
        stacja1.add(new Stacja("6:15", "ul.Rybna", 1));
        stacja1.add(new Stacja("6:20", "ul.Mariacka", 1));
        stacja1.add(new Stacja("6:25", "ul.Graniczna", 1));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Motorniczy> motorniczy = new ArrayList<>();
        Motorniczy m1 = new Motorniczy("Krzysztof", "Kołodziej", 50, 20, "11");
        Motorniczy m2 = new Motorniczy("Wojciech", "Wilk", 30, 5, "13");
        Motorniczy m3 = new Motorniczy("Adam", "Malinowski", 43, 10, "15");
        Motorniczy m4 = new Motorniczy("Marcin", "Doktor", 52, 25);
        motorniczy.add(m1);
        motorniczy.add(m2);
        motorniczy.add(m3);
        motorniczy.add(m4);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Kierowca> kierowcy = new ArrayList<>();
        Kierowca k1 = new Kierowca("Mariusz", "Kowalski", 33, 15, "RTA 5S94");
        Kierowca k2 = new Kierowca("Anna", "Nowak", 45, 20, "RTA 7W40");
        Kierowca k3 = new Kierowca("Adrian", "Krawczyk", 29, 7, "RTA 4M35");
        Kierowca k4 = new Kierowca("Kamil", "Dobrzański", 41, 5);
        kierowcy.add(k1);
        kierowcy.add(k2);
        kierowcy.add(k3);
        kierowcy.add(k4);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Przystanek> linia3 = new ArrayList<Przystanek>();
        linia3.add(new Przystanek("18:20", "ul.Legionowa 20", 3));
        linia3.add(new Przystanek("18:30", "ul.Szkolna 10a", 3));
        linia3.add(new Przystanek("18:35", "ul.Szpitalna 2", 3));
        linia3.add(new Przystanek("18:45", "ul.Marksa 13b", 3));
        linia3.add(new Przystanek("18:50", "ul.Wakacyjna 11", 3));

        linia3.add(new Przystanek("19:00", "ul.Legionowa 20", 3));
        linia3.add(new Przystanek("19:10", "ul.Szkolna 10a", 3));
        linia3.add(new Przystanek("19:15", "ul.Szpitalna 2", 3));
        linia3.add(new Przystanek("19:20", "ul.Marksa 13b", 3));
        linia3.add(new Przystanek("19:30", "ul.Wakacyjna 11", 3));

        linia3.add(new Przystanek("19:40", "ul.Legionowa 20", 3));
        linia3.add(new Przystanek("19:50", "ul.Szkolna 10a", 3));
        linia3.add(new Przystanek("19:55", "ul.Szpitalna 2", 3));
        linia3.add(new Przystanek("20:05", "ul.Marksa 13b", 3));
        linia3.add(new Przystanek("20:10", "ul.Wakacyjna 11", 3));

        linia3.add(new Przystanek("20:20", "ul.Legionowa 20", 3));
        linia3.add(new Przystanek("20:30", "ul.Szkolna 10a", 3));
        linia3.add(new Przystanek("20:35", "ul.Szpitalna 2", 3));
        linia3.add(new Przystanek("20:45", "ul.Marksa 13b", 3));
        linia3.add(new Przystanek("20:50", "ul.Wakacyjna 11", 3));


        ArrayList<Przystanek> linia1 = new ArrayList<Przystanek>();
        linia1.add(new Przystanek("9:20", "ul.Zachodnia 20", 1));
        linia1.add(new Przystanek("9:35", "ul.Szkolna 10a", 1));
        linia1.add(new Przystanek("9:40", "ul.Szkolna 3", 1));
        linia1.add(new Przystanek("10:00", "ul.Partyzantów 15b", 1));

        linia1.add(new Przystanek("10:15", "ul.Zachodnia 20", 1));
        linia1.add(new Przystanek("10:30", "ul.Szkolna 10a", 1));
        linia1.add(new Przystanek("10:35", "ul.Szkolna 3", 1));
        linia1.add(new Przystanek("10:55", "ul.Partyzantów 15b", 1));

        linia1.add(new Przystanek("11:10", "ul.Zachodnia 20", 1));
        linia1.add(new Przystanek("11:25", "ul.Szkolna 10a", 1));
        linia1.add(new Przystanek("11:30", "ul.Szkolna 3", 1));
        linia1.add(new Przystanek("11:50", "ul.Partyzantów 15b", 1));


        ArrayList<Przystanek> linia2 = new ArrayList<Przystanek>();
        linia2.add(new Przystanek("6:00", "ul.Legionowa 3", 2));
        linia2.add(new Przystanek("6:10", "ul.Lipińskiego 14", 2));
        linia2.add(new Przystanek("6:15", "ul.Ulanowskiego 2a", 2));
        linia2.add(new Przystanek("6:30", "ul.Mickiewicza", 2));
        linia2.add(new Przystanek("6:35", "ul.Szkolna 10a", 2));

        linia2.add(new Przystanek("6:50", "ul.Legionowa 3", 2));
        linia2.add(new Przystanek("7:00", "ul.Lipińskiego 14", 2));
        linia2.add(new Przystanek("7:05", "ul.Ulanowskiego 2a", 2));
        linia2.add(new Przystanek("7:20", "ul.Mickiewicza", 2));
        linia2.add(new Przystanek("7:25", "ul.Szkolna 10a", 2));

        linia2.add(new Przystanek("7:40", "ul.Legionowa 3", 2));
        linia2.add(new Przystanek("7:50", "ul.Lipińskiego 14", 2));
        linia2.add(new Przystanek("7:55", "ul.Ulanowskiego 2a", 2));
        linia2.add(new Przystanek("8:10", "ul.Mickiewicza", 2));
        linia2.add(new Przystanek("8:10", "ul.Szkolna 10a", 2));
        ;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        boolean hasloWprowadzone = false;

        System.out.println("1.Pasażer");
        System.out.println("2.Pracownik");
        int choice = scanner.nextInt();
        scanner.nextLine();


        while (true) {

            switch (choice) {
                case 1:

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
                            System.out.println("Wybierz który rozkład jazdy chcesz wyświetlić");
                            System.out.println("1.Linia 1");
                            System.out.println("2.Linia 2");
                            System.out.println("3.Linia 3");
                            System.out.println("4.Wyświetl rozkład jazdy dla każej linii");
                            int wybor = scanner.nextInt();
                            scanner.nextLine();
                            if (wybor == 1) {
                                System.out.println("Rozkład linii 1:");
                                for (int i = 0; i < linia1.toArray().length; i++) {
                                    System.out.println(linia1.get(i).toString());
                                }
                            } else if (wybor == 2) {
                                System.out.println("Rozkład linii 2:");
                                for (int i = 0; i < linia2.toArray().length; i++) {
                                    System.out.println(linia2.get(i).toString());
                                }
                            } else if (wybor == 3) {
                                System.out.println("Rozkład linii 3:");
                                for (int i = 0; i < linia3.toArray().length; i++) {
                                    System.out.println(linia3.get(i).toString());
                                }
                            } else if (wybor == 4) {
                                System.out.println("Rozkład linii 1:");
                                for (int i = 0; i < linia1.toArray().length; i++) {
                                    System.out.println(linia1.get(i).toString());
                                }
                                System.out.println("Rozkład linii 2:");
                                for (int i = 0; i < linia2.toArray().length; i++) {
                                    System.out.println(linia2.get(i).toString());
                                }
                                System.out.println("Rozkład linii 3:");
                                for (int i = 0; i < linia3.toArray().length; i++) {
                                    System.out.println(linia3.get(i).toString());
                                }
                            } else {
                                System.out.println("Błędny wybór)");
                            }


                        case 2:
                            System.out.println("Rozkład jazdy tramwajów");
                            System.out.println("Wybierz który rozkład jazdy chcesz wyświetlić");
                            System.out.println("1.Linia 1");
                            System.out.println("2.Linia 2");
                            System.out.println("3.Linia 3");
                            System.out.println("4.Wyświetl rozkład jazdy dla każej linii");
                            int wybor1 = scanner.nextInt();
                            scanner.nextLine();
                            if (wybor1 == 1) {
                                System.out.println("Rozkład linii 1:");
                                for (int i = 0; i < stacja1.toArray().length; i++) {
                                    System.out.println(stacja1.get(i).toString());
                                }
                            } else if (wybor1 == 2) {
                                System.out.println("Rozkład linii 2:");
                                for (int i = 0; i < stacja2.toArray().length; i++) {
                                    System.out.println(stacja2.get(i).toString());
                                }
                            } else if (wybor1 == 3) {
                                System.out.println("Rozkład linii 3:");
                                for (int i = 0; i < stacja3.toArray().length; i++) {
                                    System.out.println(stacja3.get(i).toString());
                                }
                            } else if (wybor1 == 4) {
                                System.out.println("Rozkład linii 1:");
                                for (int i = 0; i < stacja1.toArray().length; i++) {
                                    System.out.println(stacja1.get(i).toString());
                                }
                                System.out.println("Rozkład linii 2:");
                                for (int i = 0; i < stacja2.toArray().length; i++) {
                                    System.out.println(stacja2.get(i).toString());
                                }
                                System.out.println("Rozkład linii 3:");
                                for (int i = 0; i < stacja3.toArray().length; i++) {
                                    System.out.println(stacja3.get(i).toString());
                                }
                            } else {
                                System.out.println("Błędny wybór)");
                            }

                            break;
                        case 3:
                            System.out.println("Podaj nazwę ulicy: ");
                            String nazwaStacji = scanner.nextLine();

                            wyswietlStacje(stacja1, nazwaStacji);
                            wyswietlStacje(stacja2, nazwaStacji);
                            wyswietlStacje(stacja3, nazwaStacji);
                            break;
                        case 4:
                            System.out.println("Podaj nazwę ulicy: ");
                            String nazwaUlicy = scanner.nextLine();

                            wyswietlPrzystanki(linia1, nazwaUlicy);
                            wyswietlPrzystanki(linia2, nazwaUlicy);
                            wyswietlPrzystanki(linia3, nazwaUlicy);
                            break;
                        case 5:
                            System.out.println("Koszt biletów");
                            System.out.println("Wybierz środek komunikacji");
                            System.out.println("1.Autobus");
                            System.out.println("2.Tramwaj");
                            int wybor2 = scanner.nextInt();
                            scanner.nextLine();
                            if (wybor2 == 1) {

                                System.out.println("Podaj przystanek początkowy: ");
                                String poczatkowyPrzystanek = scanner.nextLine().toLowerCase().replaceAll("^ul\\.", "");

                                System.out.println("Podaj przystanek końcowy: ");
                                String koncowyPrzystanek = scanner.nextLine().toLowerCase().replaceAll("^ul\\.", "");
                                System.out.println("Podaj numer linii (1, 2, 3): ");
                                int numerLinii = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Czy chcesz bilet ulgowy? (true/false): ");
                                boolean ulgowy = scanner.nextBoolean();
                                ArrayList<Przystanek> wybranaLinia;
                                switch (numerLinii) {
                                    case 1:
                                        wybranaLinia = linia1;
                                        break;
                                    case 2:
                                        wybranaLinia = linia2;
                                        break;
                                    case 3:
                                        wybranaLinia = linia3;
                                        break;
                                    default:
                                        System.out.println("Nieprawidłowy numer linii.");
                                        return;
                                }

                                double kosztBiletow = obliczKosztBiletow(wybranaLinia, poczatkowyPrzystanek, koncowyPrzystanek, ulgowy);
                                System.out.println("Koszt biletów: " + kosztBiletow);
                                System.out.println(" ");
                            }


                        case 6:

                            System.exit(0);
                        default:
                            System.out.println("Nieprawidłowy wybór");
                            break;
                    }

                case 2:
                    if (!hasloWprowadzone) {
                        System.out.println("Wprowadź hasło: ");
                        String pass = scanner.nextLine();
                        if (pass.equals("xyz")) {
                            //    pracownikMenu(scanner);
                            do {
                                System.out.println("1.Zarządzanie pracownikami");
                                System.out.println("2.Zarządzanie pojazdami");
                                System.out.println("3.Wynagrodzenie");
                                System.out.println("4.Wyjście");

                                choice = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice) {
                                    case 1:
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
                                                    System.out.println("Podaj nazwisko pracownika do zwolnienia: ");
                                                    String nazwiskoDoZwolnienia = scanner.nextLine();

                                                    // Znajdowanie pracownika w listach
                                                    Kierowca zwalnianyKierowca = Kierowca.znajdzPracownikaPoNazwisku(kierowcy, nazwiskoDoZwolnienia);
                                                    Motorniczy zwalnianyMotorniczy = Motorniczy.znajdzPracownikaPoNazwisku(motorniczy, nazwiskoDoZwolnienia);

                                                    if (zwalnianyKierowca != null) {
                                                        // Wyświetlanie informacji o kierowcy
                                                        System.out.println("Znaleziono kierowcę: ");
                                                        System.out.println(zwalnianyKierowca);
                                                        // Zapytanie o potwierdzenie zwolnienia
                                                        System.out.println("Czy na pewno chcesz zwolnić tego kierowcę? (Tak/Nie)");
                                                        String potwierdzenie = scanner.nextLine();
                                                        if (potwierdzenie.equalsIgnoreCase("Tak")) {
                                                            // Zwolnienie kierowcy
                                                            zwalnianyKierowca.zwolnijPracownika();
                                                            // Usunięcie informacji o kierowcy z autobusu
                                                            for (Autobus autobus : autobusy) {
                                                                autobus.usunKierowce(zwalnianyKierowca.getRejestracja());
                                                            }
                                                        } else {
                                                            System.out.println("Nie zwolniono kierowcy.");
                                                        }
                                                    }

                                                    if (zwalnianyMotorniczy != null) {
                                                        // Wyświetlanie informacji o motorniczym
                                                        System.out.println("Znaleziono motorniczego: ");
                                                        System.out.println(zwalnianyMotorniczy);
                                                        // Zapytanie o potwierdzenie zwolnienia
                                                        System.out.println("Czy na pewno chcesz zwolnić tego motorniczego? (Tak/Nie)");
                                                        String potwierdzenie = scanner.nextLine();
                                                        if (potwierdzenie.equalsIgnoreCase("Tak")) {
                                                            // Zwolnienie motorniczego
                                                            zwalnianyMotorniczy.zwolnijPracownika();
                                                            // Usunięcie informacji o motorniczym z tramwaju
                                                            for (Tramwaj tramwaj : tramwaje) {
                                                                tramwaj.usunMotorniczego(zwalnianyMotorniczy.getNumerPojazdu());
                                                            }
                                                        } else {
                                                            System.out.println("Nie zwolniono motorniczego.");
                                                        }
                                                    }

                                                    // Wyświetlanie zaktualizowanych danych
                                                    System.out.println("\nDane po zwolnieniu pracownika:");
                                                    System.out.println("Kierowcy:");
                                                    for (Kierowca kierowca : kierowcy) {
                                                        System.out.println(kierowca);
                                                    }
                                                    System.out.println("Motorniczy:");
                                                    for (Motorniczy motornicz : motorniczy) {
                                                        System.out.println(motornicz);
                                                    }
                                                    System.out.println("Autobusy:");
                                                    for (Autobus autobus : autobusy) {
                                                        System.out.println(autobus);
                                                    }
                                                    System.out.println("Tramwaje:");
                                                    for (Tramwaj tramwaj : tramwaje) {
                                                        System.out.println(tramwaj);
                                                    }

                                                    break;
                                                ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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


                                        break;
                                    case 2:
                                        zarządzaniePojazdem(scanner);
                                        break;
                                    case 3:
                                        System.out.println("Wynagrodzenie");
                                        System.out.println("Podaj nazwisko pracownika: ");
                                        String nazwiskoDoWyszukania = scanner.nextLine();

                                        Kierowca znalezionyKierowca = Kierowca.znajdzPracownikaPoNazwisku(kierowcy, nazwiskoDoWyszukania);
                                        Motorniczy znalezionyMotorniczy = Motorniczy.znajdzPracownikaPoNazwisku(motorniczy, nazwiskoDoWyszukania);

                                        if (znalezionyKierowca != null) {
                                            double wynagrodzenieKierowcy = znalezionyKierowca.obliczWynagrodzenie();
                                            System.out.println("Wynagrodzenie kierowcy " + znalezionyKierowca.getNazwisko() + ": " + wynagrodzenieKierowcy);
                                        } else {
                                            System.out.println("Nie znaleziono kierowcy o podanym nazwisku.");
                                        }

                                        if (znalezionyMotorniczy != null) {
                                            double wynagrodzenieMotorniczego = znalezionyMotorniczy.obliczWynagrodzenie();
                                            System.out.println("Wynagrodzenie motorniczego " + znalezionyMotorniczy.getNazwisko() + ": " + wynagrodzenieMotorniczego);
                                        } else {
                                            System.out.println("Nie znaleziono motorniczego o podanym nazwisku.");
                                        }

                                        break;
                                    case 4:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Nieprawidłowy wybór");
                                        break;
                                }
                            } while (choice != 4);

                        } else {
                            System.out.println("Błędne hasło");
                            break;
                        }
                    }
            }
        }
    }


    private static void zarządzaniePojazdem(Scanner scanner) {
        int choice;
        do {
            System.out.println("1.Dodawanie tramwajów");
            System.out.println("2.Usuwanie tramwajów");
            System.out.println("3.Wyświetl tramwaj");
            System.out.println("4.Dodawanie autobusów");
            System.out.println("5.Usuwanie autobusów");
            System.out.println("6.Wyświetl autobus");
            System.out.println("7.Przydzielenie tramwajow do linii");
            System.out.println("8.Przydzielenie autobusow do linii");
            System.out.println("9.Powrót");

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
            if (przystanek.getNazwaUlicy().equalsIgnoreCase(nazwaUlicy)) {
                System.out.println("Linia: " + przystanek.getLinia() +
                        ", Godzina przyjazdu: " + przystanek.getGodzinaPrzyjazdu() +
                        ", Nazwa ulicy: " + przystanek.getNazwaUlicy());
            }
        }
    }

    private static void wyswietlStacje(ArrayList<Stacja> linia, String nazwaStacji) {
        System.out.println("Przystanki na ulicy " + nazwaStacji + ":");
        for (Stacja stacja : linia) {
            if (stacja.getNazwaStacji().equalsIgnoreCase(nazwaStacji)) {
                System.out.println("Linia: " + stacja.getStacja() +
                        ", Godzina przyjazdu: " + stacja.getGodzinaPrzyjazdu() +
                        ", Nazwa ulicy: " + stacja.getNazwaStacji());
            }
        }
    }

    private static double obliczKosztBiletow(ArrayList<Przystanek> przystanki, String poczatkowyPrzystanek, String koncowyPrzystanek, boolean ulgowy) {
        poczatkowyPrzystanek = poczatkowyPrzystanek.toLowerCase().replaceAll("^ul\\.", "");
        koncowyPrzystanek = koncowyPrzystanek.toLowerCase().replaceAll("^ul\\.", "");

        int indeksPoczatkowego = -1;
        int indeksKoncowego = -1;

        for (int i = 0; i < przystanki.size(); i++) {
            String nazwa = przystanki.get(i).getNazwaUlicy().toLowerCase().replaceAll("^ul\\.", "");
            if (nazwa.equals(poczatkowyPrzystanek)) {
                indeksPoczatkowego = i;
            } else if (nazwa.equals(koncowyPrzystanek)) {
                indeksKoncowego = i;
            }
        }

        if (indeksPoczatkowego == -1 || indeksKoncowego == -1) {
            System.out.println("Nie znaleziono przystanków.");
            return 0;
        }
        int iloscPrzystankow = Math.abs(indeksPoczatkowego - indeksKoncowego) + 1;
        double kosztBiletow = iloscPrzystankow * 2.5;


        if (ulgowy) {
            kosztBiletow *= 0.8;
        }

        return kosztBiletow;
    }

}
