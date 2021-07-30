package one.digital.innovation.interfaces;

public class Gol implements Carro{

    @Override
    public Double valor() {
        return Double.valueOf(32.3343D);
    }

    @Override
    public String marca() {
        return "Volksvagen";
    }

    public void ligar() {
        System.out.println("Ligando....");
    }
}
