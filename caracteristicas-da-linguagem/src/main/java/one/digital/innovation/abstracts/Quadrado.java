package one.digital.innovation.abstracts;

public class Quadrado{
    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double area) {
        this.nome = nome;
        this.area = area;
    }

    //
    public String nome() {return nome;}

    public Double area() {return area;}
}
