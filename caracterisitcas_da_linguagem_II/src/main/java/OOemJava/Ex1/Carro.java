package OOemJava.Ex1;

public class Carro {
    private Integer pessoas = Integer.valueOf(0);

    public void adciona(Integer adcionadas) {
        this.pessoas += adcionadas;
    }

    public void remover(Integer removidas) {
        this.pessoas -= removidas;
    }
}
