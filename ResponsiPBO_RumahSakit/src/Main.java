public class Main {
    public static void main(String[] args) {
        System.out.println("=== " + Pasien.NAMA_RUMAH_SAKIT + " ===");

        // 1, 2, 3: state, behavior, final, enkapsulasi, constructor overloading
        Pasien pasien = new Pasien("RM001", "Alya");
        Pasien pasienKedua = new Pasien("RM002");
        pasienKedua.setNama("Bima");
        System.out.println("Rekam medis: " + pasien.getNomorRekamMedis());
        System.out.println("Pasien kedua: " + pasienKedua.getNama());
        pasien.periksaStatus();

        // 4, 5, 6, 7: inheritance, super chaining, overriding, abstract class
        Dokter dokter = new Dokter("D01", "Dr. Rina", "Anak");
        Perawat perawat = new Perawat("P01", "Siti", "Malam");
        dokter.tampilkanInfo();
        perawat.tampilkanInfo();
        dokter.lakukanTugas();
        perawat.lakukanTugas();

        // 8, 9, 10: if/else mengubah state, polymorphism, multiple interface
        LayananPemeriksaan pemeriksa = new Dokter("D02", "Dr. Andi");
        pemeriksa.periksaPasien(pasien);
        pasien.periksaStatus();
        pemeriksa.periksaPasien(pasien); // menguji cabang kondisi lain
        PembuatLaporan pelapor = dokter;
        pelapor.buatLaporan(pasien);
        pelapor.buatLaporan(pasienKedua);

        // Polimorfisme superclass: method sama, hasil sesuai objek sebenarnya
        TenagaMedis[] petugas = {dokter, perawat};
        for (TenagaMedis tenaga : petugas) {
            tenaga.lakukanTugas();
        }
    }
}
