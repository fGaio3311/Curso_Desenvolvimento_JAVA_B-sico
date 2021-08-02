package OOemJava.Funcionarios;

public class Supervisor extends Funcionario implements Pagante{

    public Supervisor(double salario) {
        super(salario, 0.0005);
    }

    @Override
    public double pagaSalario() {
        return super.getSalario() * super.getAliquota();
    }
}
