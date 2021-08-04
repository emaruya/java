import java.util.Scanner;

public class Leitura {

    public static void main (String args[]) {

        Scanner teclado = new Scanner (System.in);

        int valorInteiro;
        Double valorDouble;
        float valorFloat;

        System.out.println("Digite um valor inteiro: ");
        valorInteiro = teclado.nextInt();
        System.out.println ("Valor digitado = " + valorInteiro);

        System.out.println("Digite um valor double: ");
        valorDouble = teclado.nextDouble();
        System.out.println("Valor digitado = " + valorDouble);
    }
}