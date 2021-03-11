package Lekcja10;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<String> auta = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        for(int i=0; i<100;i++) {
            if (exit == false) {
                List<String> options = List.of("Dodaj auto", "Dodaj auto po indeksie", "Podmień auto po indeksie", "Usuń auto po indeksie", "Usuń auto po nazwie", "Sprawdzenie czy dane auto jest", "Posortowanie aut", "Wyciądnięcie auta po indeksie i wyświetlenie nazwy", "Wyświetlenie liczby aut", "Usunięcie wszystkich aut", "Wyświetl wszystkie auta", "Wyjście");
                for (int p = 0; p < options.size(); p++) {
                    System.out.println("[" + p + "] " + options.get(p));
                }
                switch (scanner.nextInt()) {
                    case 0:
                        System.out.println("Podaj nazwę nowego auta :");
                        scanner.nextLine();
                        String x = scanner.nextLine();
                        auta.add(x);
                        System.out.println("Dodano nowe auto : " + x);
                        break;
                    case 1:
                        System.out.println("Podaj index dla nowego auta");
                        int z = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Podaj nazwę nowego auta :");
                        String u = scanner.nextLine();
                        auta.add(z, u);
                        System.out.println("Dodano auto " + u + " o indeksie " + z);
                        break;
                    case 2:
                        try {
                            System.out.println(" Na razie masz auta : ");
                            for (int q = 0; q < auta.size(); q++) {
                                System.out.print(auta.get(q) + ", ");
                            }
                            System.out.println("\nPodaj indeks auta które chcesz podmienić (0-nieskończoność)");
                            int w = scanner.nextInt();
                            String l = auta.get(w);
                            System.out.println("Podaj nazwe nowego auta: ");
                            scanner.nextLine();
                            String k = scanner.nextLine();
                            auta.set(w, k);
                            System.out.println("Podmieniłeś auto " + l + " o indeksie " + w + " na " + k);
                        } catch (IndexOutOfBoundsException IndexOutOfBoundsException) {
                            System.out.println("Nie masz auta o danym indeksie na początku je dodaj");
                        }
                        break;
                    case 3:
                        System.out.println(" Na razie masz auta : ");
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        System.out.println("Podaj indeks auta które chcesz usunąć");
                        auta.remove(scanner.nextInt());
                        break;
                    case 4:
                        System.out.println(" Na razie masz auta : ");
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        System.out.println("Podaj nazwe auta które chcesz usunąć");
                        scanner.nextLine();
                        auta.remove(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Podaj nazwe auta które chcesz sprawdzić czy jest: ");
                        scanner.nextLine();
                        String o=scanner.nextLine();
                        for (int j=0;j<auta.size();j++){
                            if(o==auta.get(j)){
                                System.out.println("Auto o podanej nazwie istneiej");
                            }
                        }
                        break;
                    case 6:
                        System.out.println(" Przed sortowaniem : ");
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        Collections.sort(auta);
                        System.out.println(" Po sortowaniu : ");
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        break;
                    case 7:
                        System.out.println(" Na razie masz auta : ");
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        System.out.println("Podaj indeks auta które chcesz wyświetlić");
                        System.out.println(auta.get(scanner.nextInt()));
                        break;
                    case 8:
                        System.out.println("liczba aut to : "+auta.size());
                        break;
                    case 9:
                        System.out.println("Czy na pewno chcesz usunąc wszystkie auta [y/n]");
                        String p = scanner.nextLine();
                        if(p=="y") {
                            auta.clear();
                            System.out.println("auta zostały usuniete");
                        }
                        else if(p=="n"){
                            System.out.println("auta nie zostały usuniete");
                        }
                        else {
                            System.out.println("zla odpowiedz");
                        }
                        break;
                    case 10:
                        for (int q = 0; q < auta.size(); q++) {
                            System.out.print(auta.get(q) + ", ");
                        }
                        System.out.println();
                        break;
                    case 11:
                        exit=true;
                        break;
                }
            }else{
                System.out.println("Dziękuje za skorzystanie naszego Solonu samochodwego");
            }
        }
    }
}
