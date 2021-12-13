package Dominio;

public class Eventos {
    private int tipo;
    private String duracao;
    private String local;
    private String descricao;

    //Construtores

    public Eventos(int tipo, String duracao, String local, String descricao ) {
        this.tipo = tipo;
        this.duracao = duracao;
        this.local = local;
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public String getDecricao() {
        return descricao;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }
}
