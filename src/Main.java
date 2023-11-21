import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Klient");
        System.out.println("2.Kierowca autobusu");
        System.out.println("3.Pracownik administracji");
        System.out.println("4. Motorniczy");
        System.out.println("5. Wyjście");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String password_d = "xyz";
        String password_a = "123";
        String password_m = "abc";

        while (true) {
            switch (choice) {
                case 1:

                    System.out.println("1.Rozkład jazdy autobusów");
                    System.out.println("2.Rozkład jazdy tramwajów");
                    System.out.println("3.Linie tramwajów przejeżdające przez stacje");
                    System.out.println("4.Linie autobusów przejeżdżające przez przystanki");
                    System.out.println("5.Koszt biletów");
                    System.out.println("6. Wyjście");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            ;
                        case 2:
                            ;
                        case 3:
                            ;
                        case 4:
                            ;
                        case 5:
                            ;
                        case 6:
                            break;
                    }

                    ;

                case 2:
                    System.out.println("Wprowadź hasło");
                    String pass_d = scanner.nextLine();
                    if (pass_d.equals(password_d)) {
                        System.out.println("1.Rozkład jazdy autobusów");
                        System.out.println("3.Zobacz autobus");
                        System.out.println("4.Wynagrodzenie");
                        System.out.println("5. Wyjście");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                ;
                            case 2:
                                ;
                            case 3:
                                ;
                            case 4:
                                ;
                            case 5:
                                break;
                        }
                    }
                    System.out.println("błędne hasło");
                    ;

                case 3:
                    System.out.println("Wprowadź hasło");
                    String pass_a = scanner.nextLine();
                    if (pass_a.equals(password_a)) {
                        System.out.println("1.Zwolnienie pracowników");
                        System.out.println("2.Zatrudnienie pracowników");
                        System.out.println("3.Przydzielenie motorniczych do tramwajów");
                        System.out.println("4.Przydzielenie kierowców do autobusów");
                        System.out.println("5.Przydzielenie tramwajów do linii");
                        System.out.println("6.Przydzielenie autobusów do linii");
                        System.out.println("7.Dodanie nowych tramwajów");
                        System.out.println("8.Dodanie nowych autobusów");
                        System.out.println("9.Przydzielenie tramwajów do linii");
                        System.out.println("10.Przydzielenie autobusów do linii");
                        System.out.println("11.Zobacz autobus");
                        System.out.println("12.Zobacz tramwaj");
                        System.out.println("13. Wyjście");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                ;
                            case 2:
                                ;
                            case 3:
                                ;
                            case 4:
                                ;
                            case 5:
                                ;
                            case 6:
                                ;
                            case 7:
                                ;
                            case 8:
                                ;
                            case 9:
                                ;
                            case 10:
                                ;
                            case 11:
                                ;
                            case 12:
                                ;
                            case 13:
                                ;
                                break;
                        }
                    }
                    System.out.println("błędne hasło");
                    ;

                case 4:
                    System.out.println("Wprowadź hasło");
                    String pass_m = scanner.nextLine();
                    if (pass_m.equals(password_m)) {
                        System.out.println("1.Rozkład jazdy tramwajów");
                        System.out.println("3.Zobacz tramwaj");
                        System.out.println("4.Wynagrodzenie");
                        System.out.println("5. Wyjście");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                ;
                            case 2:
                                ;
                            case 3:
                                ;
                            case 4:
                                ;
                            case 5:
                                break;
                        }
                    } else System.out.println("błędne hasło");
                    ;

                case 5:
                    break;


            }

        }

    }
}



