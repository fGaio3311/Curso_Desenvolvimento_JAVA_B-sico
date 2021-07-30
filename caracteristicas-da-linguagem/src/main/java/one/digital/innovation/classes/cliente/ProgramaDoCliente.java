package one.digital.innovation.classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18, 23.442F);

        cliente.getIdade();

        cliente.getPeso();

        System.out.println(cliente);
    }
}
