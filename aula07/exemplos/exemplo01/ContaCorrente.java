package exemplos.exemplo01;

public class ContaCorrente extends Conta {

    private final double TAXA_DEPOSITO=0.10;


    double limite,operacao;

    ContaCorrente(int numConta){

        super(numConta);

        

    }    

    ContaCorrente(int numConta, double saldo,double limite){

        super(numConta, saldo);

        this.limite = limite;

    }

    @Override
    public boolean setSaque(double operacao){
        if(operacao < getSaldo()){

            
           return super.setSaque(operacao);

           
                      
        }else{
            return false;
        }
    }

    public boolean setDeposito(double operacao){
        if (operacao>0) {
        super.setDeposito(operacao - TAXA_DEPOSITO);
            return true;
            
        }else{
            return false;
        }
        
    }
        

    
    

    


}
    



    

