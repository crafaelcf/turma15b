package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int cont,cont1;

        cont1 = leitura.nextInt();
        cont=1;
        while (cont <= cont1) {

            if (cont*2 <= cont1) {
                System.out.printf("%d,", cont);    
            }else{
                System.out.printf("%d", cont);
            }
                        
            cont = cont*2 ;


            
        }
        leitura.close();
    
    }
    
}
