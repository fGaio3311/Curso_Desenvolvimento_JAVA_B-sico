package Pilha;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(Integer.valueOf(1)));
        minhaPilha.push(new No(Calendar.getInstance()));
        minhaPilha.push(new No(Float.valueOf(4334.34343F)));
        minhaPilha.push(new No(Integer.valueOf(4)));
        minhaPilha.push(new No(Double.valueOf(34.54543D)));
        minhaPilha.push(new No(Integer.valueOf(6)));
        minhaPilha.push(new No(Integer.valueOf(7)));
        minhaPilha.push(new No(String.valueOf("flksçldfkjadf")));
        System.out.println(minhaPilha);
    }
}
