package exercícios_de_strings;

import java.lang.String;

public class Ex2 {
    public static void main(String[] args) {
        String ifmg = "Ifmg";

        System.out.println(ifmg.charAt(0));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)).append(ifmg.charAt(1)));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)).append(ifmg.charAt(1)).append(ifmg.charAt(2)));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)).append(ifmg.charAt(1)).append(ifmg.charAt(2)).append(ifmg.charAt(3)));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)).append(ifmg.charAt(1)).append(ifmg.charAt(2)));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)).append(ifmg.charAt(1)));
        System.out.println((new StringBuilder()).append(ifmg.charAt(0)));
    }
}
