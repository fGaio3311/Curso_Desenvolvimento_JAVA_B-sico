package Fila;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    public void enqueue(No novoNo) {
        novoNo.setProximoNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;

            while(true) {
                if (primeiroNo.getProximoNo() != null) {
                    primeiroNo = primeiroNo.getProximoNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }

        return null;
    }

//    public No dequeue() {
//        No noAnterior = ;
//        No noProximo = ;
//        primeiro.setProximoNo(null);
//
//        return primeiro;
//    }

    @Override
    public String toString() {
        String stringRetorno = "";

        stringRetorno += "-------------------\n";
        stringRetorno += "        Fila        \n";
        stringRetorno += "-------------------\n";

        if (!isEmpty()) {
            No noAuxiliar = refNoEntradaFila;

            while(true) {
                if (noAuxiliar != null) {
                    stringRetorno += noAuxiliar.toString();
                    stringRetorno += "------>";
                    noAuxiliar = noAuxiliar.getProximoNo();
                } else {
                    break;
                }
            }
        }

        return stringRetorno;
    }
}
