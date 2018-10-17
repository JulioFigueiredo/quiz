
package provateste;


public abstract class Pergunta {
    private String descricao;
    
    public Pergunta(){};

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public abstract String getResposta();
    
    
}
