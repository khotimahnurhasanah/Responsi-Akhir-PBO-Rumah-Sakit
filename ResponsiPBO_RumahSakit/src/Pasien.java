public class Pasien {
    public static final String NAMA_RUMAH_SAKIT = "RS Sehat Sentosa";
    private final String nomorRekamMedis;
    private String nama;
    private boolean sudahDiperiksa;

    public Pasien(String nomorRekamMedis, String nama) {
        this.nomorRekamMedis = nomorRekamMedis;
        this.nama = nama;
        this.sudahDiperiksa = false;
    }

    public Pasien(String nomorRekamMedis) {
        this(nomorRekamMedis, "Belum diisi");
    }

    public String getNomorRekamMedis() { return nomorRekamMedis; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public boolean isSudahDiperiksa() { return sudahDiperiksa; }
    public void setSudahDiperiksa(boolean sudahDiperiksa) { this.sudahDiperiksa = sudahDiperiksa; }

    public void periksaStatus() {
        if (sudahDiperiksa) {
            System.out.println(nama + " sudah selesai diperiksa.");
        } else {
            System.out.println(nama + " masih menunggu pemeriksaan.");
        }
    }
}
