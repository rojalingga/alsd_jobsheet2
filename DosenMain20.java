public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.tampilInformasi();

        Dosen20 dosen2 = new Dosen20("DS002", "Budi Hariyanto", true, 2015, "Sistem Informasi");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Teknologi Informasi");
        dosen2.tampilInformasi();

        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja Dosen: " + masaKerja + " tahun");
    }
}


