public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20();
        System.out.println("Mata Kuliah 1 : ");
        mk1.tampilInformasi();

        MataKuliah20 mk2 = new MataKuliah20("MK002", "Algoritma dan Struktur Data", 3, 6);
        System.out.println("Mata Kuliah 2 : ");
        mk2.tampilInformasi();

        System.out.println("\nUpdate Mata Kuliah 2:");
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        System.out.println("\nInformasi Mata Kuliah 2 setelah update:");
        mk2.tampilInformasi();
    }
}
