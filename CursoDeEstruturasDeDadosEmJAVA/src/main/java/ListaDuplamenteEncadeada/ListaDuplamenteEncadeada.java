package ListaDuplamenteEncadeada;

import ListaEncadeada.No;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(this.ultimoNo);

        if(primeiroNo == null) {
            this.primeiroNo = novoNo;
        }

        if(ultimoNo == null) {
            this.ultimoNo = novoNo;
        }

        this.ultimoNo = novoNo;

        this.tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        }

        else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            if(noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }

            else {
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);

        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }

        else {
            novoNo.setNoPrevio(this.ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        }

        else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public NoDuplo<T> getNo(final int index) {
        NoDuplo<T> noRetorno;

        if (index > tamanhoLista/2 + 1) {
            noRetorno = procuraNo(true, index);
        }

        else {
            noRetorno = this.ultimoNo;
            noRetorno = procuraNo(false, index);
        }

        return noRetorno;
    /*
    *       Noduplo<T> noAuxiliar = primeiroNo;
    *
    *       for( int i = 0 ; (i < index) && (noAuxiliar != null) ; i++ ) {
    *           noAuxiliar = noAuxiliar.getNoproximo();
    *       }
    *       return noAuxiliar;
    * */

    }

    public NoDuplo<T> procuraNo(final boolean sentido, final int index) {
        NoDuplo<T> noRetorno;

        if(sentido) {
            noRetorno = this.primeiroNo;
            int i = 0;

            while( i < index && noRetorno != null) {
                noRetorno = noRetorno.getNoProximo();
                i++;
            }
        }

        else {
            noRetorno = this.ultimoNo;
            int i = this.tamanhoLista - 1;

            while(i >= 0 && noRetorno != null) {
                noRetorno = noRetorno.getNoPrevio();
                i--;
            }
        }

        return noRetorno;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T>noAuxiliar = primeiroNo;

        for(int i = 0 ; i < size(); i++) {
            strRetorno += "[No{conteudo="+ noAuxiliar.getConteudo() +"}]----->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
