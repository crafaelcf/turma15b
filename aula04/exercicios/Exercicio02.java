package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner (System.in);

        int valor1,valor2,valor3,minimo;

        System.out.println("Digite 3 valores");

        valor1 = leitura.nextInt();
        valor2 = leitura.nextInt();
        valor3 = leitura.nextInt();

        

        System.out.println("o menor valor é: "+ menor(valor1,valor2,valor3));

        leitura.close();
    }


    static int menor(int a,int b,int c){

        if (a <= b && a <= c) {
            
            return a;
        }else{
            if (b <= a &&  b <= c) {

                return b;
                
            }else{
                return c;
            }
        }


    }
    
}
