package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double salario;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
            salario = entrada.nextDouble();
                salario = salario +(salario *0.25);
        
     

        System.out.println("Salário atualizado: " + salario);
       


        
        
        entrada.close();        
        
    }
    


    
}
