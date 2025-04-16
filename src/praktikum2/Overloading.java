package praktikum2;

public class Overloading {
    public void show1() {
        System.out.println("Selamat Datang Belajar Jawa");
    }
    public void show1(int i) {
        System.out.println("Method dengan 1parameter yang bernilai: " + i);
    }
    public void show1(int i, int j) {
        System.out.println("method dengan 2 parameter yang bernilai: " + i + " & " + j);
    }

    public static void main(String[] args) {
        Overloading ovr = new Overloading();
        ovr.show1();
        ovr.show1(12);
        ovr.show1(12, 12);
    }
}
