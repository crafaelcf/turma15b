package exercicios;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int a,par,impar,mediaPar,soma,total;
        double porcen;
        Scanner leitura = new Scanner(System.in);
        par=0;
        impar=0;
        soma=0;

        for (int i = 1; i <= 10; i++) {

            System.out.printf("Digite o %d º número\n", i);
            a=leitura.nextInt();
            
            if (a%2==0) {
                par+= 1;
                soma+=a;
               
            }else{
                impar+=1;
            
        }   }
        
        total = par+impar;
        mediaPar= soma /par;
        porcen = (impar / total;


        System.out.println("média é: "+ mediaPar);
        System.out.printf("Porcentagem Impares: %f2", porcen);
        System.out.println("o total é " +total);

        leitura.close();
    }
    
}
