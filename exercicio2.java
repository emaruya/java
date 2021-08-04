import java.util.Scanner;

public class exercicio2 {

    public static void main (String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        double lado, area;

        lado = teclado.nextDouble();
        area = lado * lado;

        System.out.println("A área do triangulo eh: " + area);
    }
}