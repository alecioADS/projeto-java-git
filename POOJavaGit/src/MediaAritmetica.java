import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--CÁLCULO DE MÉDIA ARITMÉTICA--");

        System.out.println();

        System.out.println("INFORME OS NÚMEROS PARA MÉDIA ARITMÉTICA SEPARADOS POR ESPAÇO: ");
        String input = scanner.nextLine();
        String[] numerosTexto = input.split(" " );

        double soma = 0;
        int quantidade = numerosTexto.length;

        for (String num : numerosTexto) {
            soma += Double.parseDouble(num);
        }

        double media = soma / quantidade;

        System.out.println();

        System.out.println("A MÉDIA ARITMÉTICA DOS NÚMEROS INFORMADOS É: " + media);

        scanner.close();
    }
}