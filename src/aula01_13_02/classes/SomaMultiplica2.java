package aula01_13_02.classes;

public class SomaMultiplica2 {
    private int a, b;

    public SomaMultiplica2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        return a + b;
    }

    public int multiplica() {
        return a * b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }



}
