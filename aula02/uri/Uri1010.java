import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codPeca,numPeca;
    
        double valorPeca,total;

        total=0;

        codPeca = teclado.nextInt();
        numPeca = teclado.nextInt();
        valorPeca = teclado.nextDouble();

        total = total + (valorPeca * numPeca);

        codPeca = teclado.nextInt();
        numPeca = teclado.nextInt();
        valorPeca = teclado.nextDouble();

        total = total + (valorPeca * numPeca);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();


        
    }
    
    




    
}
