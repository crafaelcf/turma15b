import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double consumo,media;
        int distPerco;

        distPerco = leitura.nextInt();
        consumo = leitura.nextDouble();

        media = distPerco/consumo;

        System.out.printf("%.3f km/l", media);

        leitura.close();






        leitura.close();
    }
    
}
