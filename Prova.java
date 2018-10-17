
package provateste;

import java.util.ArrayList;


public class Prova {

    private ArrayList<Pergunta> perguntas;
    
    public Prova(){
        this.perguntas = new ArrayList<Pergunta>();
    };

    public ArrayList<Pergunta> getPerguntas() {
        return this.perguntas;
    }

    public void setPerguntas(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }
    public void addPerguntas(Pergunta k){
        this.perguntas.add(k);
        
    }
    public void imprimirQuestoes(){
        int i= 1;
        for (Pergunta p: perguntas){
            System.out.println("QSTS: " +i++ +" " +p.getDescricao());
        }
       }
    public void imprimirGabarito(){
        int a= 1;
        for(Pergunta j : perguntas){
            System.out.println("RESPOSTAS: " +a++ +")"+j.getResposta());
        }
    }    
        
    }
    
    
    
    
