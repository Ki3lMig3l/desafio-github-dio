package io.github.ki3lmigu3l.projetono;

public class BaseNo<T> {

    private T conteudo;
    private BaseNo<T> proximoNo;

    public BaseNo() {
    }

    public BaseNo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BaseNo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(BaseNo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return " { " +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}