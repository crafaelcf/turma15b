package exercicios.exercicio03;

public class AppContas {

    public static void main(String[] args) {


        
        //ContaCorrente cc = new ContaCorrente(12345, 100, 50);
        ContaEspecial cce = new ContaEspecial(12345, 100, 50);
        //*ContaPoupança pp = new ContaPoupança(12345, 100);
        //*ContaPoupança pp = new ContaPoupança(12345, 100);
        //*ContaPoupança pp = new ContaPoupança(12345, 100);
        

        if (cce.setSaque(120)){

            System.out.println("Saque realizado");

        }else{
            System.out.println("Saldo insuficiente");
        }

        
        
        System.out.println(cce);
        

    }
    
}
