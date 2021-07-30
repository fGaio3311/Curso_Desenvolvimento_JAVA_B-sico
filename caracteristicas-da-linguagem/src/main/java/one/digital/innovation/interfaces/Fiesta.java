package one.digital.innovation.interfaces;

public class Fiesta implements Carro, Veiculo{
    @Override
    public Double valor() {
        return Double.valueOf(323.343D);
    }

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "AAFLKJ124#@@";
    }

    public void ligar() {
        Carro.super.ligar();

        Veiculo.super.ligar();
    }
}
