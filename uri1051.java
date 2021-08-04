import java.util.Scanner;

public class uri1051 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        double salario, impRenda28, impRenda18, impRenda8, rendaTaxada, impTotal;

        salario = teclado.nextDouble();
        
        if (salario >= 2000.01 && salario <= 3000) {
            
            rendaTaxada = salario - 2000.01;
            impRenda8 = rendaTaxada * 0.08;
            System.out.printf("R$ %.2f\n", impRenda8);
            
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            
            rendaTaxada = salario - 3000.01;
            impRenda18 = (rendaTaxada * 0.18) + (1000.00 * 0.08);
            System.out.printf("R$ %.2f\n", impRenda18);
            
        } else if (salario > 4500.00) {
            
            rendaTaxada = salario - 4500.00;
            impRenda28 = (rendaTaxada * 0.28) + (1499.99 * 0.18) + (1000.00 * 0.08);
            System.out.printf("R$ %.2f\n", impRenda28);
            
        } else {

            System.out.println("Isento");

        }


    }
}