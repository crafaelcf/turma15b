package exercicios.exercicio03;

public class ContaPoupança extends Conta {


    double operacao;
    final double taxa_poup= 1;
   


    ContaPoupança(int numConta, double saldo){

        super(numConta, saldo);
       

    }


    public boolean setSaque(double operacao){

        if(operacao <= getSaldo()+taxa_poup){


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
