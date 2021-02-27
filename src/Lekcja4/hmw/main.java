package Lekcja4.hmw;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Przykład 4
        System.out.println("Przykład 4 \n"+"1 metoda");
        int[] numbers = {12, 655,33,45,55,78,98,-45,12,444,655,-11,73,67,2,5,-45,55,655};
        //1 sposób bez porządkowania - wypisuje się wiele razy dana liczba (tyle ile razy występuje)
        for(int j=0; j<numbers.length;j++) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[j] == numbers[i] && i != j) {
                    System.out.println("Powtarza się : " + numbers[j]);

                }
            }
        }
        //2 metoda -  tylko raz się wypisuje dane liczba (z porządkowaniem tablicy)
        System.out.println("2 metoda \n");
        int z;
        do {
            z = 0;

            for (int q = 1; q < numbers.length; q++) {
                if (numbers[q - 1] > numbers[q]) {
                    int ko = numbers[q - 1];
                    numbers[q - 1] = numbers[q];
                    numbers[q] = ko;
                    z=1;
                }
            }
        }while(z==1);
        for(int j=0; j<numbers.length;j++) {
            int x = 0;
            for (int i = j; i < numbers.length; i++) {
                if (numbers[j] == numbers[i] && i != j) {
                    if (numbers[i] != x) {
                        x = numbers[j];
                        System.out.println("Powtarza się : " + numbers[j]);
                    }
                }
            }
        }
    //3 metoda - bo w 2 z powodu tego że 655 występuje 3 razy, to wypisuje się dwa razy, tutaj stworzymy nową tablicę i będziemy do niej [przypisywać wartości które się nie powtarzają
        int[] unumb={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("3 metoda \n");
        for(int j=0; j<numbers.length;j++) {
            int x = 0;
            for (int i = j; i < numbers.length; i++) {
                if (numbers[j] == numbers[i] && i != j) {

                        if(unumb[i-1]!=numbers[i]) {
                            unumb[i] = numbers[i];
                            if(unumb[i]!=0){
                                System.out.println("Powtarza się : " + unumb[i]);
                            }
                        }
                    }
                }
            }



        //Przykład 5 Zamień liczbe najwyższą z liczbą najmniejszą tablicy
        System.out.println("Przykład 5 \n");
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
        for(int i = 0; i < power.length; i++){
            System.out.println("Power["+i+"] = "+power[i]);
        }
        double min = 9999;
        double max = -9999;
        int kolmin = 0;
        int kolmax = 0;
        //szukanie największej
        for ( int i = 0; i < power.length; i++){
            if (power[i] < min) {
                min = power[i];
                kolmin = i;
            }
            if (power[i] > max){
                max = power[i];
                kolmax = i;
            }
        }
        System.out.println();
        System.out.println("Po zamianie: \n");
        power[kolmin] = max;
        power[kolmax] = min;
        for(int i = 0; i < power.length; i++){
            System.out.println("Power["+i+"] = "+power[i]);
        }
        //Przykład 6 odwrócenie tablicy z przykładu 5
        double[] power6=power;
        int x = power.length-1;
        int h = power.length / 2;
        for(int i=0; i < h; i++){
            double y=power6[i];
            power6[i] = power6[x];
            power6[x] = y;
            x--;

        }
        System.out.println();
        System.out.println("Przykład 6 \n");
        for(int i = 0; i < power6.length; i++){
            System.out.println("Power["+i+"] = "+power6[i]);
        }
        //Przykład 7 Losowanie 2-ów liczb z tanlicy Przykład 5 i porównanie ich na koniec > ++ <
        System.out.println();
        System.out.println("Przykład 7 \n");
        Random random = new Random();
        int wylosowanaliczba;
        //postanowiłem zrobić bez for
            wylosowanaliczba= random.nextInt(power.length);
            double pierwsza=power[wylosowanaliczba];
            System.out.println("Wylosowano : "+pierwsza);
            wylosowanaliczba= random.nextInt(power.length);
            double druga=power[wylosowanaliczba];
        System.out.println("Wylosowano : "+druga);
        if(druga==pierwsza){
            System.out.println(pierwsza+" Jest równa "+druga);
        }
        if(druga>pierwsza){
            System.out.println(druga+" Jest większa od "+pierwsza + "\n Czyli :"+pierwsza+" Jest mniejsza od "+druga);
        }
        if(druga<pierwsza){
            System.out.println(druga+" Jest mniejsza od "+pierwsza+"\nCzyli :"+"\n"+pierwsza+" Jest większa od "+druga);
        }

        //Przykład 8 skaner
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];

        System.out.println("Wybierz Imie :");
        person[0] = scanner.next();

        System.out.println("Wybierz Rasa :");
        person[1] = scanner.next();

        System.out.println("Wybierz Klasa :");
        person[2] = scanner.next();

        System.out.println("Wybierz broń :");
        person[3] = scanner.next();

        System.out.println("Twoja postać to : \n" + person[0] + "\n" + person[1] + "\n" + person[2] + "\n" + person[3]);


    }
}

