package Lekcja4;

public class main {
    public static void main(String[] args) {
        //Deklaracja tablic na 2 formy
        int[] array = {1,45,56,-23};
        int array2[] = {-3,5,77,892,99};
        System.out.println("Element pierwszy tablicy [0]" + array[0]);
        System.out.println("Długość tablicy to" + array.length);
        System.out.println("Element pierwszy tablicy 2" + array2[0]);
        System.out.println("Długość tablicy 2 to" + array2.length);

        for(int i = 0; i < array.length; i++){
            System.out.println("Array["+i+"] = "+array[i]);
        }
        System.out.println();
        //string w tablicy
        String word=" Mam dużo kotów";
        String[] symbol;
        //ustalenien wielkości tablicy
        symbol = new String[word.length()];
        //wypisywanie symboli do tablicy
        symbol = word.split(" ");
          //System.out.println(symbol[8]);
        for(int i=0; i<symbol.length;i++){
            System.out.println("Symbol["+i+"] "+ symbol[i]);
        }
        //tablica Stringów gotowa
        String[] words = {"one", "two", "thre", " house", "spidr"};

        for(String element : words){
            if(element.length() > 3){
                System.out.println("Word = " + element);
            }
        }
    }
}
