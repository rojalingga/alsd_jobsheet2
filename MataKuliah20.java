public class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah20() {
        this.kodeMK = "MK001";
        this.nama = "Algoritma";
        this.sks = 4;
        this.jumlahJam = 8;
    }

    public MataKuliah20(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diperbarui menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam bertambah. Sekarang: " + jumlahJam + " jam.");
    }

    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Sekarang: " + jumlahJam + " jam.");
        }
    }
}
