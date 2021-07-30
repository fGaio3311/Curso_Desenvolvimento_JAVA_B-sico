package one.digital.innovation.interfaces;

public interface Carro {
    default String codigoDeRenavam() {
        return "43234#(93323kjlFAJD";
    }

    Double valor();

    String marca();

    default void ligar() {
        System.out.println("Ligando o carro!");
    }
}
