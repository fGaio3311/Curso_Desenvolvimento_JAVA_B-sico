package encadeamentoDeNós;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No(final T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
