import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First String:");
        String string1 = scanner.nextLine();

        System.out.println("Second String:");
        String string2 = scanner.nextLine();

        System.out.println("Third String:");
        String string3 = scanner.nextLine();

        String regularOrder = string1 + string2 + string3;
        System.out.println("Ordine di inserimento: " + regularOrder);

        String reverseOrder = string3 + string2 + string1;
        System.out.println("Ordine inverso: " + reverseOrder);
    }

}


