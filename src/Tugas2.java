import java.util.Scanner;

public class Tugas2 {
    String name, room;
    public void schedule() {
        System.out.println("matkul " + name + " akan di lakasanakn di ruangan  " + room);
    }

    public void onGoing() {
        System.out.println("matkul" + name + " sedang berjalan di ruangan " + room);
    }

    public static void main(String[] Args) {
        Scanner read = new Scanner(System.in);
        Tugas2 me = new Tugas2();

        System.out.print("Masukan Nama Matkul: ");
        me.name = read.nextLine();
        System.out.print("Masukan Ruangan: ");
        me.room = read.nextLine();
        me.schedule();
        me.onGoing();
    }
}
