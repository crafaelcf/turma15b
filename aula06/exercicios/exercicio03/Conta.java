package exercicios.exercicio03;

public class Conta {

int numConta;
private double saldo;

Conta(int numConta, double saldo){

    this.numConta=numConta;
    this.saldo=saldo;
}



public void setDeposito(double operacao) {


    if (operacao >0){
    saldo = saldo + operacao;
    }
   
}

public boolean setSaque(double operacao){
    if(operacao >0){
    
        saldo = saldo - operacao;
    return true;
    

    }else{
        return false;
    }
}

@Override
public String toString() {

    return "Numero da conta: "+numConta+" saldo: "+saldo;
}

public double getSaldo(){

    return saldo;
}

public double getNum(){

    return numConta;
}
    
}
