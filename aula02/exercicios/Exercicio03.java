import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite um numero");
        num1 = leitura.nextDouble();
        System.out.println("Digite outro numero");
        num2 = leitura.nextDouble();

        if (num1 > num2) {
            System.out.println(num1);
            System.out.println(num2);

        } else {

            System.out.println(num2);
            System.out.println(num1);
        }

        leitura.close();

    }
}
