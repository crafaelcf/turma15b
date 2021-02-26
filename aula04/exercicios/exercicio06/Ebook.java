package exercicios.exercicio06;

import java.util.Set;

public class Ebook {

    int totalPaginas,paginaAtual,numPagina,exibirPagina;
    String autor,titulo;
    

    //construtor

    Ebook(String autor, String titulo,int totalPaginas,int paginaAtual){

        this.totalPaginas =totalPaginas;
        this.autor =autor;
        this.titulo=titulo;
        this.paginaAtual=0;
    }
    
    void getAtual(paginaAtual){

        return paginaAtual;              
        }

    void setAtual(int paginaAtual){
        if (paginaAtual) {
            
        }
        this.paginaAtual = paginaAtual;
    }
 
    void avancarPagina(int i, int atualiza){

        i = getAtual();
        
        atualiza= i +1;

        setAtual(atualiza);
            
    }

    void retrocederPagina(int i, int paginaAtual){

        this.paginaAtual = paginaAtual -1;     
    }

    void irParaPagina(int irParaPagina){

        this.paginaAtual = irParaPagina;
    }




    void exibirPagina(exibirPagina){

        System.out.println("Pagina exibida: " + paginaAtual);
    }



    


    
    
}
