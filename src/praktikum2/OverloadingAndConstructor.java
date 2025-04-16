package praktikum2;

public class OverloadingAndConstructor {
    public static void main(String[] args) {
        int a = 5;
        double b = 12.34;

        OverloadingAndConstructor kuadrat = new OverloadingAndConstructor();
        kuadrat.OverloadingAndConstructor(a);
        kuadrat.OverloadingAndConstructor(b);
    }

    public void OverloadingAndConstructor (int x) {
        int amount = x * x;
        System.out.println("Hasil kuadrat " + x + " adalah " + amount);
    }
    public void OverloadingAndConstructor (double y) {
        double amount = y * y;
        System.out.println("Hasil kuadrat " + y + " adalah " + amount);
    }
}
