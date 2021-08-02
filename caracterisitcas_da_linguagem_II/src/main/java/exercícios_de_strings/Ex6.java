package exercícios_de_strings;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = in.nextLine();

        System.out.println((palavra.toLowerCase())
                .replace("a", "1")
                .replace("b", "2")
                .replace("c", "3")
                .replace("d", "4")
                .replace("e", "5")
                .replace("f", "6")
                .replace("g", "7")
                .replace("h", "8")
                .replace("i", "9")
                .replace("j", "10")
                .replace("k", "11")
                .replace("l", "12")
                .replace("m", "13")
                .replace("n", "14")
                .replace("o", "15")
                .replace("p", "16")
                .replace("q", "17")
                .replace("r", "18")
                .replace("s", "19")
                .replace("t", "20"));
    }
}
