package io.github.ki3lmigu3l;

public class Fila {

    private No referenciaDeEntradaFila;

    public Fila(){
        this.referenciaDeEntradaFila = null;
    }

    public void enqueue(Object obj){
        No novoNo = new No(obj);
        novoNo.setReferenciaDeNo(referenciaDeEntradaFila);
        referenciaDeEntradaFila = novoNo;
    }

    public Object dequeue(){
        if(this.isEmpty()){
            No primeiroNo = referenciaDeEntradaFila;
            No noAuxiliar = referenciaDeEntradaFila;

            while(true) {
                if(primeiroNo.getReferenciaDeNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaDeNo();
                } else {
                    noAuxiliar.setReferenciaDeNo(null);
                    break;
                }
            }

            return primeiroNo.getObject();
        }
        return null;
    }

    public Object fisrt(){
        if(!this.isEmpty()){
            No primeiroNo = referenciaDeEntradaFila;
            while(true) {
                if(primeiroNo.getReferenciaDeNo() != null){
                    primeiroNo = primeiroNo.getReferenciaDeNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){

        return referenciaDeEntradaFila != null;
    }

    @Override
    public String toString(){
        String retorno = "";
        No noAuxiliar = referenciaDeEntradaFila;

        if(referenciaDeEntradaFila != null){
            while(true){
                retorno += "[No {Object: " + noAuxiliar.getObject() + "}] --> ";
                if(noAuxiliar.getReferenciaDeNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaDeNo();
                } else {
                    break;
                }
            }
        } else {
            retorno = "null";
        }

        return retorno;
    }

}
