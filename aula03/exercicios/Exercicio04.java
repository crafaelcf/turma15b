package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner leitura  = new Scanner(System.in);

        int valida,soma,cont;
        soma=0;
        valida=1;
        cont=1;

        
        
        System.out.println("Digite 0 para sair e exibir a soma");
        
        while (valida != 0) {
            System.out.printf("Digite o %d º numero: ",cont);
            valida = leitura.nextInt();
            soma += valida;
            cont++;
            
        }
        System.out.println("A soma dos valores é: " +soma);
        System.out.println("FIM");
        leitura.close();


    }
    
}
