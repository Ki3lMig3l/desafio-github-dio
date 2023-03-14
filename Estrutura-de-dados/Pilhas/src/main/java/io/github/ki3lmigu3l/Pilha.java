package io.github.ki3lmigu3l;

public class Pilha {

    private No referenciaNoEntradaPilha;

    public Pilha(){

        this.referenciaNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setRefNo(referenciaAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return referenciaNoEntradaPilha;
    }

    public boolean isEmpty(){

        return referenciaNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "------------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "------------------------\n";

        No noAuxiliar = referenciaNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
               stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
               noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        return stringRetorno;
    }
}
