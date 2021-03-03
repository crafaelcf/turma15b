package exercicios.exercicio03;

public class ContaPoupança extends Conta {


    double operacao;
    private static double taxa_poup= 1;
   


    ContaPoupança(int numConta, double saldo){

        super(numConta, saldo);
       

    }


    public boolean setSaque(double operacao){

        if(operacao+taxa_poup <= getSaldo()){


            operacao += taxa_poup;
            
           return super.setSaque(operacao);

           
                      
        }else{
            return false;
        }




    }



    public void setDeposito(double operacao){

        super.setDeposito(operacao);
    }
    
}
