import java.util.Scanner;

public class uri1014 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int X;
        double Y, consMedio;
        
        X = teclado.nextInt();
        Y = teclado.nextDouble();
        consMedio = X / Y;
        
        System.out.printf ("%.3f km/l \n", consMedio);
        
    }
}