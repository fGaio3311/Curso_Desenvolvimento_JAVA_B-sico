package OOemJava.Funcionarios;

public class Gerente extends Funcionario implements Pagante{
    public Gerente(double salario) {
        super(salario, 0.001D);

    }

    @Override
    public double pagaSalario() {
        return super.getSalario() * super.getAliquota();
    }
}
