package OOemJava.Funcionarios;

public class Funcionario{
    private double salario;
    private double aliquota;

    public Funcionario(final double salario, final double aliquota) {
        this.salario = salario;
        this.aliquota = aliquota;
    }

    public double getSalario() {return this.salario;}
    public double getAliquota() {return this.aliquota;}
}
