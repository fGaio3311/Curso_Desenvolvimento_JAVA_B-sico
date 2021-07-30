package one.digital.innovation.classes.pessoa;

import one.digital.innovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "2123421&¨*&¨*)&");

        batman.getLogin();

        //batman.getSenha(); //ERRO
        //String nomeDoCliente batman.nome; // NOK
    }
}
