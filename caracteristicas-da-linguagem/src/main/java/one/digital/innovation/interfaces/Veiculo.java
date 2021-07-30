package one.digital.innovation.interfaces;

public interface Veiculo {
    String registro();

    default void ligar() {
        System.out.println("Ligando o veiculo");
    }
}
