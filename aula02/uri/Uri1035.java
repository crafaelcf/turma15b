import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        
        double a,b,c,d;

        Scanner leitura = new Scanner(System.in);


        
        a=leitura.nextInt();
        b=leitura.nextInt();
        c=leitura.nextInt();
        d=leitura.nextInt();

        if (b > c && d > a && (c+d) > (a+b) && c >0 && d>0 && a%2==0) {
            System.out.println("Valores Aceitos");
            
        }else{

            System.out.println("Valores nao aceitos");
        }




        leitura.close();
    }
}
