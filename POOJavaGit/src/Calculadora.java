import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--CALCULADORA SIMPLES--");

        System.out.println();

        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        double num1 = scanner.nextDouble();

        System.out.println();

        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        double num2 = scanner.nextDouble();

        System.out.println();

        System.out.println("ESCOLHA A OPERAÇÃO (+, -, *, /)");
        char operacao = scanner.next().charAt(0);

        double resultado;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("RESULTADO: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("RESULTADO: " + resultado);
                } else {
                    System.out.println("ERRO: DIVISÃO POR ZERO");
                }
                break;
            default:
                System.out.println("OPERAÇÃO INVÁLIDA!");
        }

        scanner.close();



    }
}
