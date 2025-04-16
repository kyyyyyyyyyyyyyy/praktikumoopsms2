package praktikum2;

public class Student {
    int nim;
    String name;

    Student (int nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    void Show() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student mahasiswa = new Student(2024100, "esa");
        Student mahasiswa1 = new Student(2024100, "gentar");

        mahasiswa.Show();
        mahasiswa1.Show();
    }
}
