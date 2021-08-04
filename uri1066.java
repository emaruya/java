import java.util.Scanner;

public class uri1066 {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero, pares, impares, positivos, negativos;
        pares = 0;
        impares = 0;
        positivos = 0;
        negativos = 0;
        
        for(int cont = 1; cont <= 5; cont++) {
            numero = teclado.nextInt();
            
            if (numero % 2 == 0 && numero > 0) {
                pares++;
                positivos++;
            } else if (numero % 2 == 0 && numero < 0) {
                pares++;
                negativos++;
            } else if (numero % 2 != 0 && numero > 0) {
                impares++;
                positivos++;
            } else if (numero % 2 != 0 && numero < 0) {
                impares++;
                negativos++;
            } else {
                pares++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}