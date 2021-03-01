package exemplos.exemplo01;

public class App {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Rafael",5000);
        

        Gerente g = new Gerente("Luiz",5000,10);

    
        System.out.println("Funcionário: " + f);

        
        System.out.println("Gerente: " + g);
        
       

        g.aumentarSalario(5);
        f.aumentarSalario(5);
        
        System.out.println("Funcionário: " + f);

        System.out.println("Gerente: " + g);

    
    }
    
}
