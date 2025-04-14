public class PostTest {
    String name, faculty;
    int salary;

    public void welcome() {
        System.out.println("Selamat datang di data dosen");
    }

    public static void main(String[] Args) {
        PostTest dosen = new PostTest();

        dosen.name = "kayu";
        dosen.faculty = "fkom";
        dosen.salary = 10000000;

        dosen.welcome();
        System.out.println("nama: " + dosen.name);
        System.out.println("fakultas: " + dosen.faculty);
        System.out.println("gaji: " + dosen.salary);

    }
}
