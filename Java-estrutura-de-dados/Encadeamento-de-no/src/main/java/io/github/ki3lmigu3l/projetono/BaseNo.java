package io.github.ki3lmigu3l.projetono;

public class BaseNo {

    private String conteudo;
    private BaseNo proximoNo;

    public BaseNo() {
    }

    public BaseNo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public BaseNo getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(BaseNo proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return " { " +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}