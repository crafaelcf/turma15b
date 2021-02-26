import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int num;
        double result;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        num = leitura.nextInt();

        if (num>20){

            result = num/2.0;
            System.out.printf("A metade de %d é %.2f", num,result);


        } 
        


        leitura.close();
    }
}
