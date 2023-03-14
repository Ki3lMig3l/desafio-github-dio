package io.github.ki3lmigu3l;

public class No {

    private Object object; // Conteúdo do No...
    private No referenciaDeNo;

    public No(){

    }

    public No(Object object){
        this.referenciaDeNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getReferenciaDeNo() {
        return referenciaDeNo;
    }

    public void setReferenciaDeNo(No referenciaDeNo) {
        this.referenciaDeNo = referenciaDeNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
