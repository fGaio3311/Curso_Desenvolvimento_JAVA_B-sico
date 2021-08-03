package ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<String>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");
        minhaListaEncadeada.add("teste6");
        minhaListaEncadeada.add("teste7");
        minhaListaEncadeada.add("teste8");

        System.out.println(minhaListaEncadeada.toString());
    }
}
