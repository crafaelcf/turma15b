package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double custoFabrica,porcentagemDist,impostos,custoFinal;

        

        System.out.println("Digite custo de Fabrica: ");
        custoFabrica = entrada.nextDouble();
        
        porcentagemDist = custoFabrica * 0.28;
        impostos =custoFabrica * 0.45;
        custoFinal = custoFabrica + porcentagemDist + impostos;
        
        
        System.out.println("Custo total do Carro: " + custoFinal);
        System.out.println("Imposto pago: " + impostos);


        entrada.close();




    }
    
}
