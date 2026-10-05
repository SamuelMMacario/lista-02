import java.util.Scanner;
public class ExpressaoAritmetica {
    static void main(String[] args) {
        int contador, num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        contador = input.nextInt();

        num1 = 0;
        for(int i = 1; i <= contador; i++) {
            num1 += Math.pow(i, i);
            System.out.println("Repetição número: " + i + "º: " + num1);
        }

        System.out.println("Fim :)");
        input.close();
    }
}