package exemplos.exemplo01;

public class ContaEspecial extends Conta{

    private double limite;
    final double TAXA_DEPOSITO=0.10;

    ContaEspecial(int numConta, double limite){

        super(numConta);

        this.limite = limite;

    }

    ContaEspecial(int numConta, double saldo,double limite){

        super(numConta,saldo);

        this.limite = limite;

    }
    public boolean setSaque(double operacao) {

        if(operacao <= limite + getSaldo()){
            if (operacao <= getSaldo()){
                

           return super.setSaque(operacao);
                
            }else{

                this.limite = limite + getSaldo() - operacao;
                return super.setSaque(getSaldo());
                
            }
            

           
                      
        }else{

            this.limite = limite + getSaldo() - operacao;
            return false;
        }


        


        }

        public String toString(){

            return "Conta corrente " + getNum() +" saldo: "+getSaldo()+" limite: "+ limite;
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
