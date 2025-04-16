package praktikum2;

public class PostTest {
    public static void main(String[] args) {
    kelas kls = new kelas("ti", "fkom");
    kls.location();
    System.out.println("denagn kode pos: " + kls.location(45556));
    }
}

class kelas {
    kelas (String prodi, String fakultas) {
        System.out.println("hai saya dari prodi: " + prodi + " fakultas " + fakultas);
    }

    public void location() {
        System.out.println("Kabupaten Kuningan");
    }

    public int location(int kdp) {
        return kdp;
    }
}
