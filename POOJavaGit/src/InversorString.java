import java.util.Scanner;

public class InversorString {
    public static String inverter(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--INVERSOR DE TEXTO--");
        System.out.println();

        System.out.println("DIGITE UMA PALAVRA OU FRASE: ");
        String entrada = scanner.nextLine();

        System.out.println();

        System.out.println("INVERTIDA: " + inverter(entrada));

        scanner.close();
    }
}