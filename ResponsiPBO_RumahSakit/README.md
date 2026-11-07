# RESPONSI AKHIR PBO
## Sistem Manajemen Rumah Sakit Berbasis Java

**Nama:** Khotimah Nurhasanah Saviri  
**NIM:** H1D025146 

**Program Studi:** Informatika  
**Tema:** Rumah Sakit (Digit terakhir NIM 6 atau 7)

## 1. Deskripsi Program

Sistem Manajemen Rumah Sakit merupakan aplikasi berbasis Java Console yang mensimulasikan pengelolaan pasien dan tenaga medis. Sistem ini menyediakan fitur pemeriksaan pasien, pengelolaan informasi dokter dan perawat, serta pembuatan laporan status pemeriksaan pasien.

## 2. Cara Compile dan Run

Pastikan terminal berada di folder utama project.

**Compile:**
```bash
javac -d out src/*.java
```

**Run:**
```bash
java -cp out Main
```

Program juga dapat dijalankan melalui IntelliJ IDEA dengan membuka file `Main.java`, kemudian memilih Run.

## 3. Implementasi 10 Persyaratan PBO

1. **State dan Behavior:** Class `Pasien` memiliki atribut nama dan status pemeriksaan serta method `periksaStatus()`.
2. **Immutability:** Menggunakan konstanta `public static final` pada `NAMA_RUMAH_SAKIT` dan atribut `private final` pada nomor rekam medis.
3. **Enkapsulasi dan Overloading:** Menggunakan atribut `private`, getter, setter, keyword `this`, dan constructor overloading.
4. **Inheritance:** Class `Dokter` dan `Perawat` mewarisi class `TenagaMedis` menggunakan `extends`.
5. **Super Chaining:** Menggunakan `super(id, nama)` dan `super.tampilkanInfo()`.
6. **Method Overriding:** Menggunakan anotasi `@Override` untuk mendefinisikan ulang method superclass.
7. **Abstract Class:** Class `TenagaMedis` merupakan abstract class yang memiliki abstract method `lakukanTugas()`.
8. **Logika State Percabangan:** Menggunakan `if/else` pada pemeriksaan pasien untuk membaca dan mengubah status pemeriksaan.
9. **Polimorfisme Interface:** Menggunakan variabel referensi bertipe `LayananPemeriksaan` untuk objek `Dokter`.
10. **Multiple Interface:** Class `Dokter` mengimplementasikan interface `LayananPemeriksaan` dan `PembuatLaporan`.

## 4. Screenshot Output Program

Screenshot hasil eksekusi program melalui IntelliJ IDEA dilampirkan pada folder `screenshots`.

## 5. Repository GitHub

Seluruh source code, dokumentasi README.md, dan screenshot output program dikumpulkan melalui repository GitHub pribadi.