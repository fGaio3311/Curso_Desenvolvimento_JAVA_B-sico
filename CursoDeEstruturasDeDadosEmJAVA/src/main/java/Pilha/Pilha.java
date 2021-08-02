package Pilha;

public class Pilha {
    private No topo;

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
}
