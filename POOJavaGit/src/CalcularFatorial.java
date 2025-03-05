import java.util.Scanner;

public class CalcularFatorial {
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O NÚMERO DEVE SER POSITIVO!");
        }

        long fatorial = 1;
        for (int i= 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--CÁLCULO DE FATORIAl--");

        System.out.println();

        System.out.println("DIGITE UM NÚMERO INTEIRO POSITIVO");
        int numero = scanner.nextInt();

        try {
            long resultado = calcularFatorial(numero);
            System.out.println("O FATORIAL DE " + numero + " É: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        scanner.close();
    }
}