import java.util.Scanner;

public class uri1047 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);

        //  -------------armaz incio/fim---------------   ----------calculo minutos----------------   ------conversao horas/min-----
        int horaInicial, minInicial, horaFinal, minFinal, duracaoInicial, duracaoFinal, duracaoTotal, duracaoHoras, duracaoMinutos;
        
        horaInicial = teclado.nextInt();
        minInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minFinal = teclado.nextInt();

        duracaoInicial = horaInicial * 60 + minInicial;
        duracaoFinal = horaFinal * 60 + minFinal;
        duracaoTotal = duracaoFinal - duracaoInicial;
        
        if (duracaoTotal <= 0) {

            duracaoTotal = duracaoTotal + 1440;

        }

        duracaoHoras = duracaoTotal / 60;
        duracaoMinutos = duracaoTotal % 60;
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        
        
    }
}