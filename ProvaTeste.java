
package provateste;


public class ProvaTeste {

   
    public static void main(String[] args) {
        
        PerguntaBinaria u = new PerguntaBinaria();
        
        u.setResposta(false);
        u.setDescricao("PASCAL É OO");
        
        Prova n = new Prova();
        
        n.addPerguntas(u);
       
        
        PerguntaMultEscolha h = new PerguntaMultEscolha();
        
        h.setAlternativaCorreta("B");
        h.setDescricao("PERGUNTA JAVA ");
                
        n.addPerguntas(h);
       
        
        PerguntaBinaria f = new PerguntaBinaria();
        f.setDescricao("JAVA É MAIS FÁCIL QUE PYTHON");
        f.setResposta(true);
        
        n.addPerguntas(f);
        n.imprimirQuestoes();
        n.imprimirGabarito();

    }
    
}
