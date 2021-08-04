import java.util.Scanner;

public class uri1017 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int tempoGasto, velMedia, kmRodados;
        double litrosGasolina;
        
        tempoGasto = teclado.nextInt();
        velMedia = teclado.nextInt();
        kmRodados = (tempoGasto * velMedia);
        litrosGasolina = kmRodados / 12;
        
        System.out.printf (litrosGasolina);
    }
}