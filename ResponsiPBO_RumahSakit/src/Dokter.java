public class Dokter extends TenagaMedis implements LayananPemeriksaan, PembuatLaporan {
    private String spesialisasi;

    public Dokter(String id, String nama, String spesialisasi) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
    }

    public Dokter(String id, String nama) {
        this(id, nama, "Umum");
    }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Spesialisasi: " + spesialisasi);
    }

    @Override
    public void lakukanTugas() {
        System.out.println("Dokter " + getNama() + " bertugas memeriksa pasien.");
    }

    @Override
    public void periksaPasien(Pasien pasien) {
        if (pasien.isSudahDiperiksa()) {
            System.out.println("Pasien " + pasien.getNama() + " sudah pernah diperiksa.");
        } else {
            pasien.setSudahDiperiksa(true);
            System.out.println("Dokter " + getNama() + " memeriksa " + pasien.getNama() + ".");
        }
    }

    @Override
    public void buatLaporan(Pasien pasien) {
        System.out.println("Laporan " + pasien.getNomorRekamMedis() + ": " +
                (pasien.isSudahDiperiksa() ? "Selesai diperiksa" : "Belum diperiksa"));
    }
}
