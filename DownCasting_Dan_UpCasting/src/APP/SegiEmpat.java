package APP;

/**
 *
 * @author ASUS
 */
public class SegiEmpat extends BangunDatar{
    private double panjang,lebar;

    public SegiEmpat() {
    }

    public SegiEmpat(String warna) {
        super(warna);
    }

    public SegiEmpat(double panjang, double lebar, String warna) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double getKeliling() {
        return (2 * panjang + 2 * lebar);
    }

    @Override
    public double getLuas() {
        return (panjang * lebar);
    }
    
}
