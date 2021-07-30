package one.digital.innovation.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 78.232F);

        System.out.println(pessoaFisica.relatorio());
    }
}
