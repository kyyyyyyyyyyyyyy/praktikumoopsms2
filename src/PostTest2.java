import java.util.Scanner;

public class PostTest2 {
    public static void main (String[] Args) {
    double x, y, z;
    char o;

    Scanner read = new Scanner(System.in);

    System.out.print("masukan angka: ");
    x = read.nextDouble();

        System.out.print("masukan opretor(+, -, *, /): ");
        o = read.next().charAt(0);

        System.out.print("masukan angka: ");
        y = read.nextDouble();

        if (o == '+') {
            z = x + y;
            System.out.println("Hasil: " + z);
        } else if (o == '-') {
            z = x - y;
            System.out.println("Hasil: " + z);
        } else if (o == '*') {
            z = x * y;
            System.out.println("Hasil: " + z);
        } else if (o == '/') {
            z = x / y;
            System.out.println("Hasil: " + z);
        }
    }


}
