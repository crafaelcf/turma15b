package exercicios;

import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        
        double primeiraNota,segundaNota,resultado;
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
            primeiraNota = entrada1.nextDouble();
        
        System.out.println("Digite a segunda nota");
            segundaNota= entrada2.nextDouble();
        
        resultado= (primeiraNota + segundaNota)/2;

        System.out.println("A média do aluno é: " + resultado);
        
        entrada1.close();
        entrada2.close();
    }
    
}
