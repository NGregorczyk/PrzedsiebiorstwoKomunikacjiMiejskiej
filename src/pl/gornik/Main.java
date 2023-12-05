package pl.gornik;

import pl.gornik.pojazd.Autobus;
import pl.gornik.pojazd.Tramwaj;
import pl.gornik.pracownik.Kierowca;
import pl.gornik.pracownik.Motorniczy;
import pl.gornik.pracownik.Pracownik;
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

        ArrayList<Autobus> autobusy = new ArrayList<>();
        Autobus a1 = new Autobus("10LF", 45, 1, "RTA 5S94", "Kowalski");
        Autobus a2 = new Autobus("12LF", 20, 2, "RTA 7W40", "Nowak");
        Autobus a3 = new Autobus("9LE", 35, 3, "RTA 4M35", "Kraqwczyk");
        Autobus a4 = new Autobus("12LFH", 45, "RTA 4G89");
        autobusy.add(a1);
        autobusy.add(a4);
        autobusy.add(a3);
        autobusy.add(a2);

        ArrayList<Motorniczy> motorniczy = new ArrayList<>();
        Motorniczy m1 = new Motorniczy("Krzysztof", "Kołodziej", 50, 20, "11");
        Motorniczy m2 = new Motorniczy("Wojciech", "Wilk", 30, 5, "13");
        Motorniczy m3 = new Motorniczy("Adam", "Malinowski", 43, 10, "15");
        Motorniczy m4 = new Motorniczy("Marcin", "Doktor", 52, 25);
        motorniczy.add(m1);
        motorniczy.add(m2);
        motorniczy.add(m3);
        motorniczy.add(m4);

        ArrayList<Kierowca> kierowcy = new ArrayList<>();
        Kierowca k1 = new Kierowca("Mariusz", "Kowalski", 33, 15, "RTA 5S94");
        Kierowca k2 = new Kierowca("Anna", "Nowak", 45, 20, "RTA 7W40");
        Kierowca k3 = new Kierowca("Adrian", "Krawczyk", 29, 7, "RTA 4M35");
        Kierowca k4 = new Kierowca("Kamil", "Dobrzański", 41, 5);
        kierowcy.add(k1);
        kierowcy.add(k2);
        kierowcy.add(k3);
        kierowcy.add(k4);

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

        ArrayList<Przystanek> linia1 = new ArrayList<>();
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

        ArrayList<Przystanek> linia2 = new ArrayList<>();
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

        ArrayList<Przystanek> linia3 = new ArrayList<>();
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
                            hasloWprowadzone=true;
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
                            }break;

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
                            ;

                            wyswietlStacje(stacja1, nazwaStacji);
                            wyswietlStacje(stacja2, nazwaStacji);
                            wyswietlStacje(stacja3, nazwaStacji);
                            break;
                        case 4:
                            hasloWprowadzone=true;
                            System.out.println("Podaj nazwę ulicy: ");
                            String nazwaUlicy = scanner.nextLine();

                            wyswietlPrzystanki(linia1, nazwaUlicy);
                            wyswietlPrzystanki(linia2, nazwaUlicy);
                            wyswietlPrzystanki(linia3, nazwaUlicy);
                            System.out.println("");
                            break;
                        case 5:
                            hasloWprowadzone=true;
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

                            } else if (wybor2==2) {
                                System.out.println("Podaj staję początkową: ");
                                String poczatkowyPrzystanek = scanner.nextLine().toLowerCase().replaceAll("^ul\\.", "");
                                System.out.println("Podaj stację końcową: ");
                                String koncowyPrzystanek = scanner.nextLine().toLowerCase().replaceAll("^ul\\.", "");
                                System.out.println("Podaj numer linii (1, 2, 3): ");
                                int numerLinii = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Czy chcesz bilet ulgowy? (true/false): ");
                                boolean ulgowy = scanner.nextBoolean();
                                ArrayList<Stacja> wybranaLinia;
                                switch (numerLinii) {
                                    case 1:
                                        wybranaLinia = stacja1;
                                        break;
                                    case 2:
                                        wybranaLinia = stacja2;
                                        break;
                                    case 3:
                                        wybranaLinia = stacja3;
                                        break;
                                    default:
                                        System.out.println("Nieprawidłowy numer linii.");
                                        return;
                                }

                                double kosztBiletow = obliczKosztBiletowT(wybranaLinia, poczatkowyPrzystanek, koncowyPrzystanek, ulgowy);
                                System.out.println("Koszt biletów: " + kosztBiletow);
                                System.out.println(" ");
                            } break;

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
                            do {
                                System.out.println("1.Zarządzanie pracownikami");
                                System.out.println("2.Zarządzanie pojazdami");
                                System.out.println("3.Wyjście");

                                choice = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice) {
                                    case 1:
                                        do {
                                            System.out.println("1.Zwolnienie pracowników");
                                            System.out.println("2.Zatrudnienie pracowników");
                                            System.out.println("3.Przydzielenie motorniczych do tramwajów");
                                            System.out.println("4.Przydzielenie kierowców do autobusów");
                                            System.out.println("5.Zobacz wszystkich pracowników");
                                            System.out.println("6.Zobacz wynagrodzenie");
                                            System.out.println("7.Powrót");

                                            choice = scanner.nextInt();
                                            scanner.nextLine();

                                            switch (choice) {
                                                case 1:
                                                    System.out.println("Podaj nazwisko pracownika do zwolnienia: ");
                                                    String nazwiskoDoZwolnienia = scanner.nextLine();

                                                    Kierowca zwalnianyKierowca = Kierowca.znajdzPracownikaPoNazwisku(kierowcy, nazwiskoDoZwolnienia);
                                                    Motorniczy zwalnianyMotorniczy = Motorniczy.znajdzPracownikaPoNazwisku(motorniczy, nazwiskoDoZwolnienia);

                                                    if (zwalnianyKierowca != null) {
                                                        System.out.println("Znaleziono kierowcę: ");
                                                        System.out.println(zwalnianyKierowca);
                                                        System.out.println("Czy na pewno chcesz zwolnić tego kierowcę? (Tak/Nie)");
                                                        String potwierdzenie = scanner.nextLine();

                                                        if (potwierdzenie.equalsIgnoreCase("Tak")) {
                                                            zwalnianyKierowca.zwolnijPracownika();
                                                            for (Autobus autobus : autobusy) {
                                                                autobus.usunKierowce(zwalnianyKierowca.getRejestracja());
                                                            }
                                                        } else {
                                                            System.out.println("Nie zwolniono kierowcy.");
                                                        }
                                                    }

                                                    if (zwalnianyMotorniczy != null) {
                                                        System.out.println("Znaleziono motorniczego: ");
                                                        System.out.println(zwalnianyMotorniczy);
                                                        System.out.println("Czy na pewno chcesz zwolnić tego motorniczego? (Tak/Nie)");
                                                        String potwierdzenie = scanner.nextLine();
                                                        if (potwierdzenie.equalsIgnoreCase("Tak")) {
                                                            zwalnianyMotorniczy.zwolnijPracownika();
                                                            for (Tramwaj tramwaj : tramwaje) {
                                                                tramwaj.usunMotorniczego(zwalnianyMotorniczy.getNumerPojazdu());
                                                            }
                                                        } else {
                                                            System.out.println("Nie zwolniono motorniczego.");
                                                        }
                                                    }

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
                                                case 2:

                                                    System.out.println("Kogo chcesz zatrudnić? Wybierz opcję:");
                                                    System.out.println("1. Kierowca");
                                                    System.out.println("2. Motorniczy");

                                                    int wybor = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Pracownik pracownik = null;

                                                    switch (wybor) {
                                                        case 1:
                                                            pracownik = Kierowca.dodajKierowce(scanner);
                                                            kierowcy.add((Kierowca) pracownik);
                                                            break;
                                                        case 2:
                                                            pracownik = Motorniczy.dodajMotorniczego(scanner);
                                                            motorniczy.add((Motorniczy) pracownik);
                                                            break;
                                                        default:
                                                            System.out.println("Nieprawidłowy wybór.");
                                                    }

                                                    if (pracownik != null) {
                                                        System.out.println("Zatrudniono pracownika:");
                                                        System.out.println(pracownik);
                                                    }

                                                    System.out.println("Stan listy kierowców:");
                                                    for (Kierowca k : kierowcy) {
                                                        System.out.println(k);
                                                    }

                                                    System.out.println("Stan listy motorniczych:");
                                                    for (Motorniczy m : motorniczy) {
                                                        System.out.println(m);
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Przydzielenie motorniczych do tramwajów");
                                                    System.out.println("Podaj nazwisko motorniczego:");
                                                    String szukaneNazwisko = scanner.nextLine();

                                                    Motorniczy znalezionyMotorniczy = znajdzMotorniczegoPoNazwisku(motorniczy, szukaneNazwisko);

                                                    if (znalezionyMotorniczy != null) {
                                                        if (!znalezionyMotorniczy.getNumerPojazdu().isEmpty()) {
                                                            System.out.println("Motorniczy ma już przypisany numer pojazdu: " + znalezionyMotorniczy.getNumerPojazdu());
                                                        } else {
                                                            System.out.println("Motorniczy nie ma przypisanego numeru pojazdu.");
                                                            wyswietlTramwajeBezMotorniczego(tramwaje);

                                                            System.out.println("Podaj numer pojazdu do przypisania do motorniczego:");
                                                            String nowyNumerPojazdu = scanner.nextLine().trim();

                                                            znalezionyMotorniczy.setNumerPojazdu(nowyNumerPojazdu);

                                                            System.out.println("Do której linii chcesz przypisać tramwaj? (1, 2, 3)");
                                                            int wybranaLinia = scanner.nextInt();

                                                            Tramwaj tramwajDoPrzypisania = znajdzTramwajBezMotorniczego(tramwaje);
                                                            tramwajDoPrzypisania.setPrzypisanyMotorniczy(szukaneNazwisko);
                                                            tramwajDoPrzypisania.setLinia(wybranaLinia);

                                                            System.out.println("Tramwaj został przypisany do motorniczego.");
                                                        }
                                                    } else {
                                                        System.out.println("Nie znaleziono motorniczego o podanym nazwisku.");
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("Podaj nazwisko kierowcy:");
                                                    String nazwiskoKierowcy = scanner.nextLine().trim();

                                                    Kierowca znalezionyKierowca = znajdzKierowcePoNazwisku(kierowcy, nazwiskoKierowcy);

                                                    if (znalezionyKierowca != null) {
                                                        if (znalezionyKierowca.getRejestracja() == null || znalezionyKierowca.getRejestracja().isEmpty()) {
                                                            System.out.println("Kierowca nie ma przypisanej rejestracji. Podaj rejestrację pojazdu:");

                                                            System.out.println("Dostępne autobusy bez kierowcy:");
                                                            wyswietlAutobusyBezKierowcy(autobusy);

                                                            String nowaRejestracja = scanner.nextLine().trim();
                                                            znalezionyKierowca.setRejestracja(nowaRejestracja);

                                                            System.out.println("Podaj numer linii (1, 2, 3):");
                                                            int linia = scanner.nextInt();
                                                            scanner.nextLine();
                                                            Autobus autobus = znajdzAutobusBezKierowcy(autobusy);

                                                            if (autobus != null) {
                                                                autobus.setPrzypisanyKierowca(nazwiskoKierowcy);
                                                                autobus.setRejestracja(nowaRejestracja);
                                                                autobus.setLinia(linia);
                                                                System.out.println("Autobus przypisany pomyślnie.");
                                                            } else {
                                                                System.out.println("Brak dostępnych autobusów do przypisania.");
                                                            }
                                                        } else {
                                                            System.out.println("Kierowca ma już przypisaną rejestrację: " + znalezionyKierowca.getRejestracja());
                                                        }
                                                    } else {
                                                        System.out.println("Kierowca o podanym nazwisku nie został znaleziony.");
                                                    }

                                                    break;
                                                case 6:
                                                    System.out.println("Podaj nazwisko pracownika: ");
                                                    String nazwiskoDoWyszukania = scanner.nextLine();

                                                    Kierowca znalezionyKierowca1 = Kierowca.znajdzPracownikaPoNazwisku(kierowcy, nazwiskoDoWyszukania);
                                                    Motorniczy znalezionyMotorniczy1 = Motorniczy.znajdzPracownikaPoNazwisku(motorniczy, nazwiskoDoWyszukania);

                                                    if (znalezionyKierowca1 != null) {
                                                        double wynagrodzenieKierowcy = znalezionyKierowca1.obliczWynagrodzenie();
                                                        System.out.println("Wynagrodzenie kierowcy " + znalezionyKierowca1.getNazwisko() + ": " + wynagrodzenieKierowcy);
                                                    } else {
                                                        System.out.println("Nie znaleziono kierowcy o podanym nazwisku.");
                                                    }

                                                    if (znalezionyMotorniczy1 != null) {
                                                        double wynagrodzenieMotorniczego = znalezionyMotorniczy1.obliczWynagrodzenie();
                                                        System.out.println("Wynagrodzenie motorniczego " + znalezionyMotorniczy1.getNazwisko() + ": " + wynagrodzenieMotorniczego);
                                                    } else {
                                                        System.out.println("Nie znaleziono motorniczego o podanym nazwisku.");
                                                    }

                                                    break;
                                                case 5:
                                                    System.out.println("Motorniczy:");
                                                    for (Motorniczy motorniczyItem : motorniczy) {
                                                        System.out.println(motorniczyItem);
                                                    }

                                                    System.out.println("\nKierowcy:");
                                                    for (Kierowca kierowca : kierowcy) {
                                                        System.out.println(kierowca);
                                                    }

                                                case 7:
                                                    System.out.println("Powrót");
                                                    break;
                                                default:
                                                    System.out.println("Nieprawidłowy wybór");
                                                    break;
                                            }
                                        } while (choice != 7);
                                        break;
                                    case 2:

                                        do {
                                            System.out.println("1.Dodawanie tramwajów");
                                            System.out.println("2.Usuwanie tramwajów");
                                            System.out.println("3.Dodawanie autobusów");
                                            System.out.println("4.Usuwanie autobusów");
                                            System.out.println("5.Wyświetl pojazdy");
                                            System.out.println("6.Powrót");

                                            choice = scanner.nextInt();
                                            scanner.nextLine();

                                            switch (choice) {
                                                case 1:
                                                    System.out.print("Podaj model tramwaju: ");
                                                    String model = scanner.nextLine();

                                                    System.out.print("Podaj liczbę miejsc (minimum 20): ");
                                                    int liczbaMiejsc = Integer.parseInt(scanner.nextLine());

                                                    while (liczbaMiejsc < 20) {
                                                        System.out.println("Liczba miejsc nie może być mniejsza niż 20. Podaj ponownie:");
                                                        liczbaMiejsc = Integer.parseInt(scanner.nextLine());
                                                    }

                                                    System.out.print("Podaj numer pojazdu (unikalny): ");
                                                    String numerPojazdu = scanner.nextLine();

                                                    while (czyNumerPojazduIstnieje(tramwaje, numerPojazdu)) {
                                                        System.out.println("Numer pojazdu już istnieje. Podaj inny:");
                                                        numerPojazdu = scanner.nextLine();
                                                    }

                                                    Tramwaj newTramwaj = new Tramwaj(model, liczbaMiejsc, numerPojazdu);
                                                    tramwaje.add(newTramwaj);

                                                    System.out.println("\nLista tramwajów po dodaniu:");
                                                    for (Tramwaj tramwaj : tramwaje) {
                                                        System.out.println(tramwaj);
                                                    }

                                                    break;
                                                case 2:
                                                    System.out.print("\nPodaj numer tramwaju który chcesz usunąć: ");
                                                    String numerPojazduDoUsuniecia = scanner.nextLine().trim();

                                                    boolean tramwajUsuniety = false;
                                                    for (int i = 0; i < tramwaje.size(); i++) {
                                                        Tramwaj tramwaj = tramwaje.get(i);
                                                        if (tramwaj.getNumerPojazdu().equals(numerPojazduDoUsuniecia)) {
                                                            tramwaje.remove(i);
                                                            tramwajUsuniety = true;

                                                            for (Motorniczy mot : motorniczy) {
                                                                if (mot.getNumerPojazdu() != null &&
                                                                        mot.getNumerPojazdu().equals(numerPojazduDoUsuniecia)) {
                                                                    mot.setNumerPojazdu(null);
                                                                    break;
                                                                }
                                                            }

                                                            System.out.println("Tramwaj został usunięty.");
                                                            break;
                                                        }
                                                    }

                                                    if (!tramwajUsuniety) {
                                                        System.out.println("Tramwaj o numerze " + numerPojazduDoUsuniecia + " nie znaleziony");
                                                    }

                                                    System.out.println("\nTramwaje (Po usunięciu):");
                                                    for (Tramwaj tramwaj : tramwaje) {
                                                        System.out.println(tramwaj);
                                                    }

                                                    System.out.println("\nMotorniczy (Po usunięciu):");
                                                    for (Motorniczy mot : motorniczy) {
                                                        System.out.println(mot);
                                                    }


                                                    break;
                                                case 3:
                                                    System.out.print("Podaj model: ");
                                                    String model1 = scanner.nextLine();

                                                    System.out.print("Podaj liczbę miejsc (minimum 20): ");
                                                    int liczbaMiejsc1 = Integer.parseInt(scanner.nextLine());

                                                    while (liczbaMiejsc1 < 20) {
                                                        System.out.println("Liczba miejsc nie może być mniejsza niż 20. Podaj ponownie:");
                                                        liczbaMiejsc1 = Integer.parseInt(scanner.nextLine());
                                                    }

                                                    System.out.print("Podaj numer rejestracyjny (unikalny): ");
                                                    String rejestracja = scanner.nextLine();

                                                    while (isRejestracjaExists(autobusy, rejestracja)) {
                                                        System.out.println("Numer rejestracyjny już istnieje. Podaj inny:");
                                                        rejestracja = scanner.nextLine();
                                                    }

                                                    Autobus newAutobus = new Autobus(model1, liczbaMiejsc1, rejestracja);
                                                    autobusy.add(newAutobus);

                                                    System.out.println("\nLista autobusów po dodaniu:");
                                                    for (Autobus autobus : autobusy) {
                                                        System.out.println(autobus);
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("4.Usuwanie autobusów");
                                                    System.out.print("\nEnter the rejestracja of the Autobus to remove: ");
                                                    String rejestracjaDoUsuniecia = scanner.nextLine().trim();

                                                    boolean autobusUsuniety = false;
                                                    for (int i = 0; i < autobusy.size(); i++) {
                                                        Autobus autobus = autobusy.get(i);
                                                        if (autobus.getRejestracja().equals(rejestracjaDoUsuniecia)) {
                                                            autobusy.remove(i);
                                                            autobusUsuniety = true;

                                                            for (Kierowca kierowca : kierowcy) {
                                                                if (kierowca.getRejestracja() != null &&
                                                                        kierowca.getRejestracja().equals(rejestracjaDoUsuniecia)) {
                                                                    kierowca.setRejestracja("");
                                                                    break;
                                                                }
                                                            }

                                                            System.out.println("Autobus removed successfully.");
                                                            break;
                                                        }
                                                    }

                                                    if (!autobusUsuniety) {
                                                        System.out.println("Autobus with rejestracja " + rejestracjaDoUsuniecia + " not found.");
                                                    }

                                                    System.out.println("\nAutobusy (After Removal):");
                                                    for (Autobus autobus : autobusy) {
                                                        System.out.println(autobus);
                                                    }

                                                    System.out.println("\nKierowcy (After Removal):");
                                                    for (Kierowca kierowca : kierowcy) {
                                                        System.out.println(kierowca);
                                                    }


                                                    break;
                                                case 5:
                                                    System.out.println("Tramwaje:");
                                                    for (Tramwaj tramwaj : tramwaje) {
                                                        System.out.println(tramwaj);
                                                    }

                                                    System.out.println("\nAutobusy:");
                                                    for (Autobus autobus : autobusy) {
                                                        System.out.println(autobus);
                                                    }

                                                    break;
                                                case 6:
                                                    System.out.println("Powrót");
                                                    break;
                                                default:
                                                    System.out.println("Nieprawidłowy wybór");
                                                    break;
                                            }
                                        } while (choice != 6);
                                        break;

                                    case 3:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Nieprawidłowy wybór");
                                        break;
                                }
                            } while (true);

                        } else {
                            System.out.println("Błędne hasło");
                            break;
                        }
                    }
            }
        }
    }

    private static void wyswietlPrzystanki(ArrayList<Przystanek> linia, String nazwaUlicy) {
        System.out.println("Przystanki na ulicy " + nazwaUlicy + ":");
        for (Przystanek przystanek : linia) {
            if (przystanek.getNazwaUlicy().toLowerCase().startsWith("ul.") &&
                    przystanek.getNazwaUlicy().substring(3).equalsIgnoreCase(nazwaUlicy.toLowerCase())) {
                System.out.println("Linia: " + przystanek.getLinia() +
                        ", Godzina przyjazdu: " + przystanek.getGodzinaPrzyjazdu() +
                        ", Nazwa ulicy: " + przystanek.getNazwaUlicy());
            }
        }
    }

    private static void wyswietlStacje(ArrayList<Stacja> linia, String nazwaStacji) {
        System.out.println("Przystanki na ulicy " + nazwaStacji + ":");
        for (Stacja stacja : linia) {
            if (stacja.getNazwaStacji().toLowerCase().startsWith("ul.") &&
                    stacja.getNazwaStacji().substring(3).equalsIgnoreCase(nazwaStacji.toLowerCase())){
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

    private static double obliczKosztBiletowT(ArrayList<Stacja> stacje, String poczatkowyPrzystanek, String koncowyPrzystanek, boolean ulgowy) {
        poczatkowyPrzystanek = poczatkowyPrzystanek.toLowerCase().replaceAll("^ul\\.", "");
        koncowyPrzystanek = koncowyPrzystanek.toLowerCase().replaceAll("^ul\\.", "");

        int indeksPoczatkowego = -1;
        int indeksKoncowego = -1;

        for (int i = 0; i < stacje.size(); i++) {
            String nazwa = stacje.get(i).getNazwaStacji().toLowerCase().replaceAll("^ul\\.", "");
            if (nazwa.equals(poczatkowyPrzystanek)) {
                indeksPoczatkowego = i;
            } else if (nazwa.equals(koncowyPrzystanek)) {
                indeksKoncowego = i;
            }
        }

        if (indeksPoczatkowego == -1 || indeksKoncowego == -1) {
            System.out.println("Nie znaleziono stacji.");
            return 0;
        }
        int iloscPrzystankow = Math.abs(indeksPoczatkowego - indeksKoncowego) + 1;
        double kosztBiletow = iloscPrzystankow * 2.5;


        if (ulgowy) {
            kosztBiletow *= 0.8;
        }

        return kosztBiletow;
    }


    public static Motorniczy znajdzMotorniczegoPoNazwisku(ArrayList<Motorniczy> motorniczy, String nazwisko) {
        for (Motorniczy motorniczyItem : motorniczy) {
            if (motorniczyItem.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return motorniczyItem;
            }
        }
        return null;
    }

    public static Tramwaj znajdzTramwajBezMotorniczego(ArrayList<Tramwaj> tramwaje) {
        for (Tramwaj tramwaj : tramwaje) {
            if (tramwaj.getPrzypisanyMotorniczy().isEmpty()) {
                return tramwaj;
            }
        }
        return null;
    }

    public static void wyswietlTramwajeBezMotorniczego(ArrayList<Tramwaj> tramwaje) {
        System.out.println("Tramwaje bez przypisanego motorniczego:");
        for (Tramwaj tramwaj : tramwaje) {
            if (tramwaj.getPrzypisanyMotorniczy().isEmpty()) {
                System.out.println(tramwaj);
            }
        }
    }

    public static Kierowca znajdzKierowcePoNazwisku(ArrayList<Kierowca> kierowcy, String nazwisko) {
        for (Kierowca kierowca : kierowcy) {
            if (kierowca.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return kierowca;
            }
        }
        return null;
    }

    public static Autobus znajdzAutobusBezKierowcy(ArrayList<Autobus> autobusy) {
        for (Autobus autobus : autobusy) {
            if (autobus.getPrzypisanyKierowca() == null || autobus.getPrzypisanyKierowca().isEmpty()) {
                return autobus;
            }
        }
        return null;
    }

    public static void wyswietlAutobusyBezKierowcy(ArrayList<Autobus> autobusy) {
        for (Autobus autobus : autobusy) {
            if (autobus.getPrzypisanyKierowca() == null || autobus.getPrzypisanyKierowca().isEmpty()) {
                System.out.println(autobus);
            }
        }
    }

    private static boolean czyNumerPojazduIstnieje(ArrayList<Tramwaj> tramwaje, String numerPojazdu) {
        for (Tramwaj tramwaj : tramwaje) {
            if (tramwaj.getNumerPojazdu().equalsIgnoreCase(numerPojazdu)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRejestracjaExists(ArrayList<Autobus> autobusy, String rejestracja) {
        for (Autobus autobus : autobusy) {
            if (autobus.getRejestracja().equalsIgnoreCase(rejestracja)) {
                return true;
            }
        }
        return false;
    }
}
