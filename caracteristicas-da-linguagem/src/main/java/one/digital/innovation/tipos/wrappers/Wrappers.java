package one.digital.innovation.tipos.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        //Autoboxing

        Byte b = 127;      //byte
        Byte b2 = -128;
        Byte nullByte = null;

        Character c = 'A';  //char
        Character c2 = 15;

        Short s = 32767;   //short
        Short s2 = -32768;

        Integer i = 2147483647;   //int
        Integer i2 = -2147483648;

        Long l = 9223372036854775807L;  //long
        Long l2 = -9223372036854775808L;

        Float f = 65f;  //float
        Float f2 = 65.0f;

        Double d = 132.88;  //Double
        Double d2 = 10.232;

        Boolean bo = true;  //boolean
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false"); //OK
        Boolean bo4 = Boolean.valueOf("true"); //OK
    }
}
