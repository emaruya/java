import java.util.Scanner;

public class uri1019 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int N, horas, minutos, segundos;
        
        N = teclado.nextInt();
        
        horas = N / 3600;
        minutos = (N % 3600) / 60;
        segundos = (N % 3600) % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}