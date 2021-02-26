import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        double salario,prestacao,porcenSal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salário");
        salario = entrada.nextDouble();
        System.out.println("Digite a prestação");
        prestacao = entrada.nextDouble();

        porcenSal = salario *0.30;

        //if (prestacao > porcenSal)
        if (prestacao > salario *0.30) 
        {
            System.out.println("Crédito negado");


            
        }else{
            System.out.println("Crédito aprovado");
        }

        entrada.close();
    }
    
}
