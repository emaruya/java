import java.util.Scanner;

public class uri1046 {
    
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int horaInicial, horaFinal, horasJogo;
        
        horaInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        
        if (horaInicial == horaFinal) {
            
            System.out.println("O JOGO DUROU 24 HORA(S)");
            
        } else if (horaInicial < horaFinal) {
            
            horasJogo = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + horasJogo + " HORA(S)");
            
        } else {
            
            horasJogo = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + horasJogo + " HORA(S)");
        }
    }

}