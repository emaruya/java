import java.util.Scanner;

public class uri1041 {
    
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        double X, Y;
        
        X = teclado.nextDouble();
        Y = teclado.nextDouble();
        
        if (X > 0 && Y > 0) {
            
            System.out.println("Q1");
            
        } else if (X > 0 && Y < 0) {
            
            System.out.println("Q4");
            
        } else if (X < 0 && Y < 0) {
            
            System.out.println("Q3");
            
        } else if (X < 0 && Y > 0) {
            
            System.out.println("Q2");
            
        } else if (X != 0 && Y == 0) {
            
            System.out.println("Eixo X");
            
        } else if (X == 0 && Y != 0) {
            
            System.out.println("Eixo Y");
            
        } else {
            
            System.out.println("Origem");
            
        }
    } 
}