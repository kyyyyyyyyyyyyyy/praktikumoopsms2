import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prak1_2 {
    public static void main(String[] Args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String name, fakultas;

        System.out.print("Masukan Nama: ");
        name = read.readLine();

        System.out.print("Masukan Nama Fakultas: ");
        fakultas = read.readLine();

        System.out.println("salam kenal " + name + " selamaat belajar di " + fakultas);
    }
}
