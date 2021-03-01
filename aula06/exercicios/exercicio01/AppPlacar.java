package exercicios.exercicio01;

public class AppPlacar {
    
    public static void main(String[] args) {
        
        Placar time = new Placar();

        Placar time1 = new Placar ("Corinthians","Palmeiras" );
        Placar time2 = new Placar ("Corinthians","Palmeiras",3,1 );

        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);


    }
    
}
