package APP;

/**
 *
 * @author ASUS
 */
public class BelahKetupat extends SegiEmpat{
    private double d1,d2,sisi;
    private String nama = "Belah Ketupat";

    public BelahKetupat() {
    }


    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }


    @Override
    public double getKeliling() {
        return (4 * sisi);
    }

    @Override
    public double getLuas() {
        return (0.5 *(this.d1 * this.d2));
    }
    
    
    
    
}
