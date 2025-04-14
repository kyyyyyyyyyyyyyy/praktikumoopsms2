public class prak1_3 {
    String jenis, brand;
    int year;

    public void Berjalan() {
        System.out.println("wihh jalan");
    }

    public static void main(String[] Args) {
        prak1_3 kendaraan = new prak1_3();

        kendaraan.jenis = "Motor";
        kendaraan.brand = "Honda";
        kendaraan.year = 5;

        System.out.println("Jenis Kendaraan: " + kendaraan.jenis);
        System.out.println("merek kendaraan: " + kendaraan.brand);
        System.out.println("tahun kendaraan: " + kendaraan.year);
        kendaraan.Berjalan();

    }
}
