package Lekcja1;

public class main {
    //tutaj stworzymy sobie metode main (czyli metodę głowną)
    public static void main(String[] args) {
        //Zad 1 Wypisz text, który zwiera wszytkie dzisiajn poznane zmienne (bez boolean).
        int intA = 5;
        double doubleB = 5.87;
        char charC = 'C';
        String stingD = "Szymon Skarbek";

        System.out.println(intA + " " + doubleB + " " + charC + " " + stingD);

        //Zad 2 Napisz program, który oblicza sume : a^2 + b^2. Wypisz sam wwynik(a i b są to dowolne liczby typy int).
        int intB = 5;
        int intC = 8;
        int suma = intB*intB+intC*intC;
        System.out.println("Wynik = " + suma);

        //Zad 3 Oblicz pole trójkąta równobocznego. Bok ma długość 7
        int intD = 7;
        double sqrt = Math.sqrt(3);
        double pole = intD * intD * sqrt / 4;
        System.out.println("Pole = " + pole);

        //Zad 4 Wypisz imie i nazwisko za pomocą string -ów.
        String imie = "Imie : Szymon";
        String nazwisko = "Nazwisko : Skarbek";
        System.out.println(imie + "\n" + nazwisko);

    }
}
