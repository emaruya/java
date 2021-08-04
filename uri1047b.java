import java.util.Scanner;

public class uri1047b {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int horaInicial, minInicial, horaFinal, minFinal, horasJogo, minJogo, minTotal, horasTotal, horas, minutos;
        
        horaInicial = teclado.nextInt();
        minInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minFinal = teclado.nextInt();

        horasJogo = horaFinal - horaInicial;
        minJogo = minFinal - minInicial;
        minTotal = horasJogo * 60 + minJogo;
        
        if (minTotal <= 0) {

            horasJogo = minTotal / 60;
            minJogo = minTotal % 60;
            System.out.println("O JOGO DUROU " + horasJogo + " HORA(S) E " + minJogo + " MINUTO(S)");

        } else {

            System.out.println("O JOGO DUROU " + horasJogo + " HORA(S) E " + minJogo + " MINUTO(S)");

        } 
    }
}