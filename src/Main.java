import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "xyz";
        boolean hasloWprowadzone = false;

        while (true) {
            System.out.println("1.Pasażer");
            System.out.println("2.Pracownik");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    pasażer(scanner);
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


                default:
                    System.out.println("Nieprawidłowy wybór. Wybierz 1 lub 2.");
                    break;
            }
        }
    }

    private static void pasażer(Scanner scanner) {
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
                //wybor linii przez
                break;
            case 2:
                System.out.println("Rozkład jazdy tramwajów");
                break;
            case 3:
                System.out.println("Linie tramwajów przejeżdające przez stacje");
                break;
            case 4:
                System.out.println("Linie autobusów przejeżdżające przez przystanki");
                break;
            case 5:
                System.out.println("Koszt biletów");
                break;
            case 6:
                System.out.println("Wyjście");
                System.exit(0);
            default:
                System.out.println("Nieprawidłowy wybór");
                break;
        }
    }

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
                    break;
                case 2:
                    System.out.println("Zatrudnienie pracowników");
                    break;
                case 3:
                    System.out.println("Przydzielenie motorniczych do tramwajów");
                    break;
                case 4:
                    System.out.println("Przydzielenie kierowców do autobusów");
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
                    break;
                case 2:
                    System.out.println("Zatrudnienie pracowników");
                    break;
                case 3:
                    System.out.println("Przydzielenie motorniczych do tramwajów");
                    break;
                case 4:
                    System.out.println("Przydzielenie kierowców do autobusów");
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
}