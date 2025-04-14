public class Tugas1 {
    String name, room;
    public void schedule() {
        System.out.println("matkul " + name + " akan di lakasanakn di ruangan  " + room);
    }

    public void onGoing() {
        System.out.println("matkul" + name + " sedang berjalan di ruangan " + room);
    }

    public static void main(String[] Args) {
        Tugas1 me = new Tugas1();
        me.name = "pBO";
        me.room = "A";
        me.schedule();
        me.onGoing();
    }
}
