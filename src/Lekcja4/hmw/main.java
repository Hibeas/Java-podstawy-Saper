package Lekcja4.hmw;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
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
        int x = power6.length-1;
        for(int i=0; i < x; i++){
            double y=power6[i];
            power6[i] = power6[x];
            power6[x] = power6[ i];
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
        for(int i=0; i<2;i++){
            wylosowanaliczba= random.nextInt(power.length);//0-2
            double pierwsza=power[wylosowanaliczba];
            System.out.println("Wylosowano  ["+i+"] : "+pierwsza);
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

