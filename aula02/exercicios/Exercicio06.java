import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        double salario;
        java.util.Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = leitura.nextDouble();

        if (salario <=600) {
            System.out.println("Isento");
            
        }else{
            if (salario<=1200) {
                System.out.println("Desconto 20%");
                
            }else{
                if (salario<=2000) {
                    System.out.println("Desconto 25%");
                    
                }else{
                    
                }
            }
        }

    leitura.close();

        
    }
    
}
