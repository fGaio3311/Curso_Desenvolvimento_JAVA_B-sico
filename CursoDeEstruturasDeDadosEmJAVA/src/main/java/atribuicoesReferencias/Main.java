package atribuicoesReferencias;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("A : "+ a + " B : " + b );
        a = 2;
        System.out.println("A : "+ a + " B : " + b );

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("ObjA: " + objA.toString() + "\nObjB: " + objB.toString());
        objA.setNum(2);
        System.out.println("ObjA: " + objA.toString() + "\nObjB: " + objB.toString());

    }
}
