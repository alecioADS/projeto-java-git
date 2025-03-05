import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--CONTADOR DE LETRAS--");
        System.out.println();

        System.out.println("INFORME UMA PALAVRA OU FRASE: ");
        String input = scanner.nextLine();

        int vogais = 0, consoantes = 0;
        String vogaisStr = "aeiouáéíóúãõâêîôûAEIOUÁÉÍÓÚÃÕÂÊÎÔÛ";

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vogaisStr.indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        int totalLetras = vogais + consoantes;

        System.out.println("NÚMERO DE VOGAIS: " + vogais);
        System.out.println("NÚMERO DE CONSOANTES: " + consoantes);
        System.out.println("TOTAL DE LETRAS: " + totalLetras);

        scanner.close();
    }
}