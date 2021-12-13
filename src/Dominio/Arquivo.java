package Dominio;

public class Arquivo {
    private String data;
    private int tipoArquivo;
    private String dado;

    public Arquivo() {
        this.data = data;
        this.tipoArquivo = tipoArquivo;
        this.dado = dado;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(int tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getDado(String s) {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
}
