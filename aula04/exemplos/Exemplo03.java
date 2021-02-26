package exemplos;

// Mesmo exemplo do exercicio01, porém retornando booleano

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num;
        boolean valida;
        
        num = leitura.nextInt();

        valida =parImpar(num);

        if (valida) {

            System.out.println("Par");
            
        }else{
            System.out.println("Impar");
        }

    leitura.close();

    }

    static boolean parImpar(int numero){

        if (numero%2==0) {

            return true;
            
        }else{
            return false;
        }

        
    }
    
}
