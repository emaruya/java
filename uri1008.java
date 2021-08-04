import java.util.Scanner;

public class uri1008 {
    
    public static void main (String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numFuncionario, horasTrab;
        double valorHora, salario;
        
        numFuncionario = teclado.nextInt();
        horasTrab = teclado.nextInt();
        valorHora = teclado.nextDouble();
        salario = horasTrab * valorHora;
        
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}