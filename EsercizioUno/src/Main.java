import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");

        int result = moltiplica(5, 2);
        System.out.println("Risultato: " + result);

        String risultatoConcatenazione = concatena("Hello", 1029);
        System.out.println("Concatenazione: " + risultatoConcatenazione);

        String[] originalArray = {"A", "E", "I", "O", "U"};
        String[] newArray = inserisciInArray(originalArray, "NewElement");
        System.out.println("Array: " + Arrays.toString(newArray));
    }
    public static int moltiplica (int a, int b){
        return a*b;
    }
    public static String concatena(String str, int num) {
        return str + num;
    }
    public static String[] inserisciInArray(String[] array, String newElement) {
        String[] newArray = new String[6];
        System.arraycopy(array, 0, newArray, 0, 3);
        newArray[3] = newElement;
        newArray[4] = array[3];
        newArray[5] = array[4];
        return newArray;
    }
}