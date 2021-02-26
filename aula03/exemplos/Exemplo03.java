package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int valor;
        char nome;
        Scanner entrada = new Scanner(System.in);

        valor = Integer.parseInt(entrada.nextLine()); //converter string em numero 
        nome = entrada.nextLine().charAt(0);

        System.out.println(valor);
        System.out.println(nome);

        entrada.close();

    }
}
