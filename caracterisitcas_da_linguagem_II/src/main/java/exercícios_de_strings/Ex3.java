package exercícios_de_strings;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Digite um texto em letras maiúsculas: ");
        s = in.nextLine();

        System.out.println(s.toLowerCase(Locale.ROOT));

        System.out.println("Agora, digite um texto em letras minúsculas: ");
        s = in.nextLine();

        System.out.println(s.toUpperCase());
    }
}
