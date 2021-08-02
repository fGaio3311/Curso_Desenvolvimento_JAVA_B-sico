package exercícios_de_strings;

public class Ex4 {
    public static void main(String[] args) {
        String string = "Ifmg";

        for (int i = 0 ; i <= 4 ; i++) {
            System.out.println(string.substring(0,i));
        }

        for (int i = 3 ; i >= 0 ; i--) {
            System.out.println(string.substring(0, i));
        }
    }
}
