import java.util.Scanner;

public class uri1017 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int tempoGasto, velMedia;
        float litrosGasolina;
        
        tempoGasto = teclado.nextInt();
        velMedia = teclado.nextInt();
        litrosGasolina = (tempoGasto * velMedia) / 12;
        
        System.out.printf ("%.3f\n", litrosGasolina);
    }
}