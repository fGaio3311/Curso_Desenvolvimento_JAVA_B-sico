package OOemJava.Funcionarios;

public class Atendente extends Funcionario implements Pagante{
    public Atendente(double salario) {
        super(salario, 0.0001D);
    }

    @Override
    public double pagaSalario() {
        return super.getSalario() * super.getAliquota();
    }
}
