import java.util.Scanner;

public class uri1060 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        double numero;
        int positivo = 0;
        
        for(int cont = 1;cont <= 6;cont++) {
            numero = teclado.nextDouble();
            if (numero > 0)
                positivo++;
        }
        System.out.println(positivo + " valores positivos");
    }
}