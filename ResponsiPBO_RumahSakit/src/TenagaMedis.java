public abstract class TenagaMedis {
    private String id;
    private String nama;

    public TenagaMedis(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public void tampilkanInfo() {
        System.out.println("ID: " + id + " | Nama: " + nama);
    }

    public abstract void lakukanTugas();
}
