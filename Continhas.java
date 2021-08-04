public class Continhas {
    public static void main (String args[]) {

        int a, b, c;

        a = 86399;
        b = 3600;

        c = a + b;

        System.out.println ("Valor da soma = " + c);

        c = a - b;

        System.out.println("Valor da subtracao = " + c);

        c = a * b;

        System.out.println ("Valor da multiplicacao = " + c);

        c = a / b;

        System.out.println("Valor da divisao = " + c);

        c = a % b;

        System.out.println("Valor do resto = " + c);

        System.out.println("---------- Agora continhas quebradas! ----------");

        float x, y, z;

        x = 23.0f;
        y = 3.0f;

        z = x / y;

        System.out.println ("Valor da divisao quebrada =" + z);

        System.out.printf("Valor agora com 2 casas decimais %.2f \n", z); //%.2f para formatar impressão com duas casas decimais
        // \n para pular linha, print f não pula linha
        
        System.out.printf("Valor agora com 3 casas decimais %.3f", z);
    }
}