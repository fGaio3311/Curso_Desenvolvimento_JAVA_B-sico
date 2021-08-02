package exercícios_de_strings;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, n, r;

        System.out.println(n = "Batatinha quando nasce esparrama pelo chão");
        System.out.println("Escolha uma palavra.");
        s = in.nextLine();

        System.out.println("Nova palavra: ");
        r = in.nextLine();

        System.out.println(n.replace(s, r));
    }
}
