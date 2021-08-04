import java.util.Scanner;

public class uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero, soma = 0.0;
        int qtdPositivos = 0;

        for (int cont=1 ; cont <=6 ; cont++){
            numero = teclado.nextDouble();
            if (numero > 0){
                qtdPositivos++;
                soma = soma + numero;
            }
        }
        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", (soma / qtdPositivos));
    }
}