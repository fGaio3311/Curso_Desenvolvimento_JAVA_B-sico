package exercícios_de_strings;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a text: ");
        name = in.nextLine();

        System.out.println(String.format("O número de caracteres é: %d", name.length()));
    }
}
