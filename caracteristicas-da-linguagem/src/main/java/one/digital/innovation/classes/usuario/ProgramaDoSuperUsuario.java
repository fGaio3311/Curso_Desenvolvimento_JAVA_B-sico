package one.digital.innovation.classes.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "123452303");

        superUsuario.getLogin();
        superUsuario.getSenha();

        String root = superUsuario.nome;
    }
}
