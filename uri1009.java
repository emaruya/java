import java.util.Scanner;

public class uri1009 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomeVendedor;
        double salarioFixo, montanteVendas, bonus, total;
        
        nomeVendedor = teclado.next();
        salarioFixo = teclado.nextDouble();
        montanteVendas = teclado.nextDouble();
        bonus = (montanteVendas * 15) / 100;
        total = salarioFixo + bonus;
        
        System.out.printf("TOTAL = R$ %.2F\n", total);
        
    }
}