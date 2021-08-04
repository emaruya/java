import java.util.Scanner;

public class uri1038 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int codigo, qtdItem;
        double valor;
        
        codigo = teclado.nextInt();
        qtdItem = teclado.nextInt();
        
        if (codigo == 1) {
            
            valor = qtdItem * 4.00;
            System.out.printf("Total: R$ %.2f\n", valor);
            
        } else if (codigo == 2) {
            
            valor = qtdItem * 4.50;
            System.out.printf("Total: R$ %.2f\n", valor);
            
        } else if (codigo == 3) {
            
            valor = qtdItem * 5.00;
            System.out.printf("Total: R$ %.2f\n", valor);
            
        } else if (codigo == 4) {
            
            valor = qtdItem * 2.00;
            System.out.printf("Total: R$ %.2f\n", valor);
            
        } else {
            
            valor = qtdItem * 1.50;
            System.out.printf("Total: R$ %.2f\n", valor);
            
        }
    }
}