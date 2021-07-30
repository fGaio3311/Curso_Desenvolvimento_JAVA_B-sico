package one.digital.innovation.abstracts;

public class Programa {
    public static void main(String[] args) {
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final Quadrado quadrado = new Quadrado("Quadrado", 10D);

        System.out.println(quadrado);

        System.out.println("quadrado.desenha(12, 32)");
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
