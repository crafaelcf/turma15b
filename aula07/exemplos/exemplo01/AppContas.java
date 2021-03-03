package exemplos.exemplo01;


import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {

        int opcao,numeroConta;
        double limite,valor;
        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupança cp;
        ArrayList<Conta> listaDeContas = new ArrayList<>();
        
    
        cc= null;
        ce=null;
        cp=null;
        opcao = 0;

        
        Scanner entrada = new Scanner(System.in);

        do {
            
        
        
        System.out.println("1 Nova conta Corrente");
        System.out.println("2 Nova conta Especial");
        System.out.println("3 Nova conta Poupança");
        System.out.println("4 Fazer depósito");
        System.out.println("5 Fazer saque");
        System.out.println("6 Verificar saldo");
        System.out.println("7 sair");

        opcao= entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o numero da conta: ");
                numeroConta = entrada.nextInt();
                cc = new ContaCorrente(numeroConta);
                listaDeContas.add(cc);
                
                break;

            case 2:
            System.out.println("Informe o numero da conta: ");
            numeroConta = entrada.nextInt();
            System.out.println("Informe o limite da conta: ");
            limite = entrada.nextDouble();
            ce= new ContaEspecial(numeroConta,limite);

            listaDeContas.add(ce);
                
                break;

            case 3:
            System.out.println("Informe o numero da conta: ");
            numeroConta = entrada.nextInt();
            cp= new ContaPoupança(numeroConta);
            
            listaDeContas.add(cp);
                
            
                
                break;

            case 4:

                System.out.println("Informe o numero da conta");
                numeroConta = entrada.nextInt();

                for (Conta conta : listaDeContas) {

                    if (conta.getNum()==numeroConta) {
                        System.out.println("Informe o valor que deseja depositar: ");
                        valor = entrada.nextInt();
                        
                        if(conta.setDeposito(valor)){
                            System.out.println("Deposito realizado");
                        }else{
                            System.out.println("Falha na operação");
                }

                        
                    }
                    
                }



                
                break;

            case 5:
                
            System.out.println("Informe o numero da conta");
            numeroConta = entrada.nextInt();

            for (Conta conta : listaDeContas) {

                if (conta.getNum()==numeroConta) {
                    System.out.println("Informe o valor que deseja depositar: ");
                    valor = entrada.nextInt();
                    
                    if(conta.setSaque(valor)){
                        System.out.println("Saque realizado");
                    }else{
                        System.out.println("Falha na operação");
            }

                    
                }
                
            }



            
            break;

            case 6:
                System.out.println("Informe o numero da conta");
                numeroConta = entrada.nextInt();

                for (Conta conta : listaDeContas) {

                    if (conta.getNum() == numeroConta) {
                        System.out.println(conta);
                        break;
                        
                    }

                    
                    
                }

                
                
                
                break;

            case 7:
                
                break;
        
            default:
                System.out.println("Opção Invalida");
                break;
        }

    } while (opcao != 7 );
        






        entrada.close();
        

    }
    
}
