package exemplos.exemplo01;

public class ContaPoupança extends Conta {


    double operacao;
    final double taxa_poup= 1;
   


    ContaPoupança(int numConta, double saldo){

        super(numConta, saldo);
       

    }

    ContaPoupança(int numConta){

        super(numConta);
       

    }


    public boolean setSaque(double operacao){

        if(operacao <= getSaldo()+taxa_poup){


            operacao += taxa_poup;
            
           return super.setSaque(operacao);

           
                      
        }else{
            return false;
        }




    }



    public boolean setDeposito(double operacao){
        if (operacao >0) {
            super.setDeposito(operacao);
            return true;

            
        }else{
            return false;
        }
        
    }
    
}
