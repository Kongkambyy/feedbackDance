import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dancer[] dancers = {new ElectricBoogieDancer(), new Breakdancer(), new Hiphopper()};

        String brugerValg;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Vælg en af de følgende muligheder:");
            System.out.println("1. Se en Electric Boogie Dancer");
            System.out.println("2. Se en Breakdancer");
            System.out.println("3. Se en Hiphopper");
            System.out.println("4. Se alle dansere");
            System.out.println("5. Luk programmet");

            brugerValg = scanner.nextLine().toLowerCase();

            switch (brugerValg) {
                case "1":
                    dancers[0].dancer();
                    break;
                case "2":
                    dancers[1].dancer();
                    break;
                case "3":
                    dancers[2].dancer();
                    break;
                case "4":
                    for (Dancer dancer : dancers) {
                        dancer.dancer();
                    }
                    break;
                case "Exit":
                    System.out.println("Afslutter programmet");
                    break;
                default:
                    System.out.println("Ugyldigt tal, indtast venligst et korrekt tal");
                    break;
            }
        } while (!brugerValg.equals("Exit"));

        scanner.close();
    }
}