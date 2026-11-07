public class Perawat extends TenagaMedis {
    private String shift;

    public Perawat(String id, String nama, String shift) {
        super(id, nama);
        this.shift = shift;
    }

    public Perawat(String id, String nama) {
        this(id, nama, "Pagi");
    }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Shift: " + shift);
    }

    @Override
    public void lakukanTugas() {
        System.out.println("Perawat " + getNama() + " membantu pelayanan pasien.");
    }
}
