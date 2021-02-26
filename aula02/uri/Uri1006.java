import java.util.Scanner;


/**
 * Uri1006
 */
public class Uri1006 {
    public static void main(String[] args) {

        double a,b,c,media;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextDouble();
        b= teclado.nextDouble();
        c= teclado.nextDouble();


        a = a * 0.20;
        b = b * 0.30;
        c = c * 0.50;

        media = a+b+c;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();

        
        

       


    }
    
}