package Lekcja2.hmw;

public class main {
    public static void main(String[] args) {
        /*zad1-nieudany sposób

        char firstletter = 'A';//97
        for ( int i=0; i < 26; i++){
            System.out.print(firstletter);
            firstletter = (char) (firstletter + 2);

        }*/
        //zad1-poprawny sposób,  Napisz pętle, która wypisze znaki (A-Z) z tabeli ASCII. Wynikiem mają być wypisane znaki co drugi

        char letterA = 'A';

        for (int i=0; i<26; i++){
            if( i % 2 ==0)
                System.out.print(letterA + "\t");
            letterA++;
        }
        //zad2 Napisz pętle która wypisze ciąg fibonacciego o długości X(gdzie x jest zdefiniowaną zmienną)
        int x=7;
        int inta=0;
        int intb=1;
        for (int i=0; i <7; i++){
            System.out.println('1' + intb + " ");
            intb += inta;
            inta = intb-inta;
        }

    }

}
