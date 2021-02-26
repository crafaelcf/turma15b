package exercicios.exercicio05;

import java.util.Scanner;

public class AppRelogio {

    public static void main(String[] args) {
        int hora,minuto,segundo;

        Scanner leitura = new Scanner(System.in);

        

        System.out.println("digite hora minuto e segundo sem :");
        hora=leitura.nextInt();
        minuto=leitura.nextInt();
        segundo=leitura.nextInt();

        Relogio horario = new Relogio(hora,minuto,segundo);

        horario.getHora();

        leitura.close();
    }

    
}
