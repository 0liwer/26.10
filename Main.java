import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w prostym kalkulatorze. Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();

        System.out.println("Co chcesz zrobić? Wybierz liczbę:");
        int choice = showOptions(scanner); // Wywołanie metody statycznej, która zwraca wybór użytkownika

        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Wynik dodawania: " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Wynik odejmowania: " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Wynik mnożenia: " + result);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Błąd: Dzielenie przez zero!");
                } else {
                    result = a / b;
                    System.out.println("Wynik dzielenia: " + result);
                }
                break;

            default:
                System.out.println("Nieprawidłowy wybór operacji.");
                break;
        }

        scanner.close();

        System.out.println("Brawo Ja");
    }

    // Metoda statyczna zwracająca wybór użytkownika
    private static int showOptions(Scanner scanner) {
        System.out.println("1: Dodawanie (+)");
        System.out.println("2: Odejmowanie (-)");
        System.out.println("3: Mnożenie (*)");
        System.out.println("4: Dzielenie (/)");
        System.out.println("Wybierz liczbę (1-4):");
        return scanner.nextInt(); // Zwraca wybór użytkownika
    }
}











