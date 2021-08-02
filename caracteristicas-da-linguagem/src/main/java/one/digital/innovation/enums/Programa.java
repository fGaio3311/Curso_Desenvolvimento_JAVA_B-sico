package one.digital.innovation.enums;

public class Programa {
    public static void main(String[] args) {
        //System.out.println(TipoVeiculo.TERRESTRE);
        //System.out.println(TipoVeiculo.AQUATICO);

        System.out.println(TipoVeiculo.values());

        for (TipoVeiculo tipo: TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Códgio do Status CLOSE: " + Status.CLOSE );
        System.out.println("Código do Status OPEN: " + Status.OPEN);
    }
}
