package exercicios;

//realizar tabuada

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int a,cont,multiplica;

        Scanner leitura = new Scanner(System.in);
        cont=0;
        a= leitura.nextInt();

        while (cont<=10) {
            multiplica=a * cont;

            System.out.printf("%d x %d = %d\n", a, cont, multiplica);
            //System.out.print(a + "x" +cont+ "=" +multiplica + "\n");
            cont++;
            
        }
        
        leitura.close();
    }
    
}
