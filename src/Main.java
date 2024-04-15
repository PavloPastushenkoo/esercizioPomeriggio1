import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il primo numero");
        int num1 = scanner.nextInt();
        System.out.println("Digita il secondo numero");
        int num2 = scanner.nextInt();
        int risultato = moltiplica(num1, num2);
        System.out.println("Il risultato e" + risultato);
        scanner.nextLine();
        System.out.println("Scrivi una stringa");
        String stringa = scanner.nextLine();
        System.out.println("Digita il numero");
        int num3 = scanner.nextInt();
        String risultato2 = concatena(stringa, num3);
        System.out.println("Risultato: " + risultato2);
    }

    public static int moltiplica(int num1, int num2) {
        return num1 + num2;
    }

    public static String concatena(String stringa, int num) {
        return stringa + num;
    }
    
}