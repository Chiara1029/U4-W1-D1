import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double param1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double param2 = scanner.nextDouble();

        double perimetroRettangolo = perimetroRettangolo(param1, param2);
        System.out.println("Perimetro del rettangolo: " + perimetroRettangolo);

        System.out.println("Inserisci un numero intero:");
        int num = scanner.nextInt();

        int pariDispari = pariDispari(num);
        System.out.println("Risultato Pari/Dispari: " + pariDispari);

        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double paramTr1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double paramTr2 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double paramTr3 = scanner.nextDouble();

        // Calcola e stampa il perimetro del triangolo
        double perimetroTriangolo = perimetroTriangolo(paramTr1, paramTr2, paramTr3);
        System.out.println("Perimetro del triangolo: " + perimetroTriangolo);

    }

    public static double perimetroRettangolo(double param1, double param2) {
        return 2 * (param1 + param2);
    }

    public static int pariDispari(int num) {
        return num % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double paramTr1, double paramTr2, double paramTr3) {
        return paramTr1 + paramTr2 + paramTr3;
    }

}