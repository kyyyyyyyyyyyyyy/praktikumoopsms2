import java.util.Scanner;

public class Prak1_6 {
    public static void main(String[] Args) {
        String nama, jurusan;
        int nim;
        double ipk;

        Scanner input = new Scanner(System.in);

        System.out.println("Pendataan Mahasiswa");

        System.out.print("Nama    : ");
        nama = input.nextLine();

        System.out.print("NIM     : ");
        nim = input.nextInt();
        input.nextLine(); // membersihkan newline

        System.out.print("Jurusan : ");
        jurusan = input.nextLine();

        System.out.print("IPK     : ");
        ipk = input.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }
}

