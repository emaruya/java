import java.util.Scanner;

public class uri1114 {
    public static void main (String args[]){
        
        Scanner teclado = new Scanner (System.in);
        
        int senha = 0000;
        
        do {
            senha = teclado.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            } 
        
        } while (senha != 2002);
    }
}