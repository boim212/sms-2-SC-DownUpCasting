package APP;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar{
    private double jejari;
    private final double PI=3.14;
    private String nama ="Lingkaran";

    public double getJejari() {
        return jejari;
    }

    public Lingkaran() {
    }

    public void setJejari(double jejari) {
        if (jejari > 0){
            this.jejari = jejari;
        }
        else{
            this.jejari = 1.0;
        }
    }

    public Lingkaran(double jejari, String warna, String nama) {
        super(warna);
        if (jejari > 0){
            this.jejari = jejari;
        }
        else{
            this.jejari = 1.0;
         }
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double getKeliling() {
        return (PI * jejari * jejari);
    }

    @Override
    public double getLuas() {
        return (PI * 2 * jejari);
    }

    
}
