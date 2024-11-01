package one.digital.innovation.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //INTEIROS

        //byte nullByte = null;

        byte b;               // 8 bits
        byte b1 = 127;
        byte b2 = -128;
        // byte b3 = 129;    // too large

        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c2 = 'AA';      // NOK

        short s;              // 16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647;   //32 bits
        int i2 = -2147483648;
        // int i3 = -243948393443; // too large

        long l = 9223372036854775807L; //64 bits
        long l2 = -9223372036854775808L;
        // long l3 = 92233720368547758007L; too large

        //FLUTUANTES

        float f = 65f;
        float f2 = 65.0f; //32 bits  3.402.823,5 E+38
        float f3 = -0.5f; //1.4 E-45

        double d = 1024.99;  // 64 bits 1.797.693.134
        double d2 = 10.2456; // 4.9 E-324

        //Boleano

        boolean bo = true;
        boolean bo2 = false;
        //boolean b03 = "false";   //NOK
        //boolean b04 = 'true';    //NOK

        //void v;                  //palavra reservada

        //System.out.println("byte : " + b); // ERROR
    }
}
