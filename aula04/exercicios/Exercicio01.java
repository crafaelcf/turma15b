package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int num,valida;
        
        num = leitura.nextInt();

        valida =parImpar(num);

        if (valida == 1) {

            System.out.println("Par");
            
        }else{
            System.out.println("Impar");
        }

    leitura.close();

    }

    static int parImpar(int numero){

        if (numero%2==0) {

            return 1;
            
        }else{
            return 0;
        }

        

    }
    
}
