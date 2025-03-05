import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--IDENTIFICADOR DE NÚMERO PAR OU ÍMPAR--");

        System.out.println();

        System.out.println("DIGITE UM NÚMERO INTEIRO: ");
        int numero = scanner.nextInt();

        System.out.println(ehPar(numero));

        scanner.close();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}