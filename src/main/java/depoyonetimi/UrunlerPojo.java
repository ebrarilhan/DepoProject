package depoyonetimi;

public class UrunlerPojo {



    private String urunAdi;

    private String uretici;

    private String birim;

    private int miktar;

    private String raf;

    public UrunlerPojo() {

    }

    public UrunlerPojo(String urunAdi, String uretici, String birim, int miktar, String raf) {

        this.urunAdi = urunAdi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = miktar;
        this.raf = raf;
    }



    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "\t\t\t" +
                urunAdi + "\t\t\t" +
                uretici + "\t\t\t" +
                birim + "\t\t\t" +
                miktar + "\t\t\t" +
                raf + "\n";
    }
}
