package exercicios.exercicio03;

public class ContaEspecial extends Conta{

    private double limite;
    final double TAXA_DEPOSITO=0.10;

    ContaEspecial(int numConta, double saldo,double limite){

        super(numConta,saldo);

        this.limite = limite;

    }
    public boolean setSaque(double operacao) {

        if(operacao <= limite + getSaldo()){

            limite = limite- (getSaldo()-operacao)  ;

           return super.setSaque(operacao);

           
                      
        }else{

            this.limite = limite + getSaldo() - operacao;
            return false;
        }


        


        }

        public String toString(){

            return getNum() +" saldo: "+getSaldo()+" limite: "+ limite;
        }

        
    


    public void setDeposito(double operacao){

        super.setDeposito(operacao - TAXA_DEPOSITO);
    }
        
}
