import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        int a,b,soma;

        Scanner teclado = new Scanner(System.in);

        a= teclado.nextInt();

        b= teclado.nextInt();

        soma=a+b;

        System.out.println("SOMA = "+ soma);

        teclado.close();
    }
}