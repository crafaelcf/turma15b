package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double kw,valorReaisKw,salario,qtd,valorConta,desconto;

        kw= 1.0/500;
        
        System.out.println("Digite o salário mínimo: ");
        salario = entrada.nextDouble();
        
        System.out.println("Digite quantidade de Kw consumido: ");
        qtd= entrada.nextDouble();

        
        valorReaisKw = salario * kw;
        valorConta = qtd * valorReaisKw;
        desconto = valorConta * 0.85;

        System.out.println("Valor de cada KW: " + valorReaisKw);
        System.out.println("Valor da conta: " + valorConta);
        System.out.println("Valor com desconto: " + desconto);
       
        // System.out.println("Digite quantidade de kw: ");
        //qtd = entrada.nextFloat();

        //valorReaisKw = salario*kw;

        //System.out.println("Valor de cada KW: " + valorReaisKw);

        entrada.close();


    }
    
}
