package ListaEncadeada;

import java.util.Objects;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(final T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public No(final T conteudo, final No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No<?> no = (No<?>) o;
        return Objects.equals(conteudo, no.conteudo) && Objects.equals(proximoNo, no.proximoNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conteudo, proximoNo);
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        String str = "No{" +
                "conteudo=" + conteudo+
                "}";

        return str;
    }

    public String toStringEncadeado() {
        String str = "No{" +
                "conteudo=" + conteudo+
                "}";

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "->null";
        }

        return str;
    }
}
