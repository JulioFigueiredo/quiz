
package provateste;


public class PerguntaBinaria extends Pergunta{
   private boolean resposta;
   
   public PerguntaBinaria(){};

    @Override
    public String getResposta() {
       if (this.resposta== true){
       return "C";} else{
       return "E";}
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
   
   
}
