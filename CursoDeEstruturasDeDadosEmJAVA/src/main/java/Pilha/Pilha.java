package Pilha;

public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public No top() {
        return this.topo;
    }

    public No pop() {
        No meuNo = topo;

        if (!isEmpty()) {
            topo = topo.getProximoNo();
        }

        else {
            meuNo = null;
        }

        return meuNo;
    }

    public void push(No novoNo) {
        novoNo.setProximoNo(topo);
        topo = novoNo;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------------\n";
        stringRetorno += "             Pilha\n";
        stringRetorno += "-----------------------\n";

        No noAuxiliar = topo;

        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{ dado = " + noAuxiliar.getConteudo()+ "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            } else {
                break;
            }
        }

        stringRetorno += "-----------------------\n";

        return stringRetorno;
    }
}
