public class Prak1_5 {
    double panjang, lebar, tinggi;

    void inputData( double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double calculate() {
        return (panjang * lebar * tinggi);
    }

    public static void main(String[] Args) {
        Prak1_5 balok = new Prak1_5();
        balok.inputData(2, 2, 2);
        System.out.println("Volume balok = " + balok.calculate());
    }
}
