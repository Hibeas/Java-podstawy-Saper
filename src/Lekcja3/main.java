package Lekcja3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowitą dodatnią");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> System.out.println("Wybrałeś drzwi 1. Są to złe drzwi. Spróbój ponownie");
            case 2 -> System.out.println("Wybrałeś drzwi 2. Są to złe drzwi. Spróbój ponownie");
            case 3 -> System.out.println("Wybrałeś drzwi 3. Są to dobre drzwi. Gratulacje");
            case 4 -> System.out.println("Wybrałeś drzwi 4. Są to złe drzwi. Spróbój ponownie");
            case 5 -> System.out.println("Wybrałeś drzwi 5. Są to złe drzwi. Spróbój ponownie");
            default -> System.out.println("Nie wybrałeś drzwi. Spróbój ponownie");
        }


    }
}
