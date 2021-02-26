import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        

        //validação de senha


        Scanner leitura = new Scanner (System.in);
        String senha,validacao;

        validacao ="R10p5";
        
        System.out.println("Digite sua senha: ");
        senha= leitura.nextLine();
        
        
        //if (senha.equals("R10p5")==true){
        //if (senha.equalsIgnoreCase(validacao)){        //Ignorando case sensitive
        if (senha.equals(validacao)) {
        
            System.out.println("Bem vindo");
            
        }else{
            System.out.println("Senha invalida");
        }

        leitura.close();



    }
    
}
