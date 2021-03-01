package exercicios.exercicio02;

public class AppFaculdade {

    public static void main(String[] args) {
        
        
        Estudante p2 = new Estudante("Rafael","989365757","Pedagogia");
        Professor p3= new Professor("Emerson", "989895858", 3000);


     
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p2.exibir());



    }
    
}
