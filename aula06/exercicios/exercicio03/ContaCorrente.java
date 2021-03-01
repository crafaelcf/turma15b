package exercicios.exercicio03;

public class ContaCorrente extends Conta {

    private final double TAXA_DEPOSITO=0.10;


    double limite,operacao;

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

    public void setDeposito(double operacao){

        super.setDeposito(operacao - TAXA_DEPOSITO);
    }
        

    
    

    


}
    



    

