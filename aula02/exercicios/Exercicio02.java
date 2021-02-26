import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        double nota1,nota2,media;

        System.out.println("Digite primeira nota");
        nota1= leitura.nextDouble();

        System.out.println("Digite segunda nota");
        nota2= leitura.nextDouble();

        media = (nota1 * 0.40 + nota2 * 0.60);

        if (media >=6) {
            System.out.println("Aprovado");
            
        }else{

            System.out.println("Reprovado");
        }
        leitura.close();

    }
    
}
