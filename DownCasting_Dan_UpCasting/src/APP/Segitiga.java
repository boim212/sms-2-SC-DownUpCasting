package APP;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{
    private double tinggi,alas;

    public Segitiga() {
    }

    public Segitiga(String warna) {
        super(warna);
    }


    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    @Override
    public double getKeliling() {
        return 0;
    }

    @Override
    public double getLuas() {
        return 0;
    }
    
    
    
}
