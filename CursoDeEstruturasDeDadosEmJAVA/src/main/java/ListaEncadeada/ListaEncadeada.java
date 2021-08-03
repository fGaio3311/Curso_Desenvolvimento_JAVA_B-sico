package ListaEncadeada;

public class ListaEncadeada<T> {
    private No<T> lista;

    public ListaEncadeada(){
        this.lista = null;
    }

    public boolean isEmpty() {
        return lista == null ? true : false;
    }

    public int size() {
        int tam;
        No noAuxiliar = lista;

        for ( tam = 0; noAuxiliar != null ; tam++) {
                noAuxiliar.getProximoNo();
        }

        return tam;
    }

    public No<T> getLista() {
        return this.lista;
    }

    public void add(T conteudo) {
        No novoNo = new No<T>(conteudo);
        No noAuxiliar;

        if (lista != null) {
            for (noAuxiliar = lista;
                 noAuxiliar.getProximoNo() != null;
                 noAuxiliar = noAuxiliar.getProximoNo()) {}

            noAuxiliar.setProximoNo(novoNo);

        }else {
            lista = novoNo;
        }
    }

    public T remove(No removido) {
        No noAuxiliar;
        No noAnterior;
        if (lista != null) {
            for (noAuxiliar = lista; noAuxiliar.getProximoNo() != null; noAuxiliar = noAuxiliar.getProximoNo()) {
                noAnterior = noAuxiliar;
                noAuxiliar.getProximoNo();

                if (noAuxiliar != null && noAuxiliar.equals(removido)) {
                    noAnterior.setProximoNo(noAuxiliar.getProximoNo());
                    removido.setProximoNo(null);
                    break;
                }
            }
        }

        return (T) removido.getConteudo();
    }

    public No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = lista;
        No<T> noRetorno = null;

        for(int i = 0 ; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
        //        No noAuxiliar = null;
//        int j = 0;
//
//        if (lista != null) {
//            for (noAuxiliar = lista;
//                 noAuxiliar.getProximoNo() != null;
//                 noAuxiliar = noAuxiliar.getProximoNo()) {
//                if (j == i) {
//                    return noAuxiliar;
//                }
//                else{
//                    j++;
//                }
//            }
//        }
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private void validaIndice(int indice) {
        if(indice >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "+ indice + " desta lista." +
                    "\n Esta lista só vai até o índice " + ultimoIndice+".");
        }
    }

    @Override
    public String toString() {
        String str = "";

        str += "------------------------------\n";
        str += "        Lista encadeada       \n";
        str += "------------------------------\n";

        No<T> noAuxiliar = lista;

        for( int i = 0 ; i < this.size() ; i++ ) {
            str += "[No{conteudo="+noAuxiliar.getConteudo() + "}]----->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        str += "null";
        return str;
    }


}
