import java.util.Scanner;

public class Prak1_4 {
    public static void main(String[] Args) {
        String name;
        int age, salary;

        Scanner read = new Scanner(System.in);
        System.out.println("Pendataan Karyawan");
        System.out.print("Nama Karyawan: ");
        name = read.nextLine();

        System.out.print("Usia: ");
        age = read.nextInt();

        System.out.print("Gaji: ");
        salary = read.nextInt();

        System.out.println("----------------------------");
        System.out.println("Name: " + name);
        System.out.println("Usia: " + age);
        System.out.println("Gaji: " + salary);

    }
}
