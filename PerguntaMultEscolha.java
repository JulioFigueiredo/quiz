

package provateste;


public class PerguntaMultEscolha extends Pergunta{
    private String alternativaCorreta;

    public void setAlternativaCorreta(String alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }
    
    
    @Override
    public String getResposta() {
        return "LETRA: " +this.alternativaCorreta;
    }
    
    
}
