package APP;
/**
 *
 * @author ASUS
 */
public class SegitigaSikuSiku extends Segitiga{
    private double tinggi,alas;
    private String nama = "Segitiga Siku-Siku";
    
    public SegitigaSikuSiku() {
    }

    public SegitigaSikuSiku(double tinggi, double alas, String warna) {
        super(warna);
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void setAlas(double alas) {
        this.alas = alas;
    }

    @Override
    public double getAlas() {
        return alas;
    }

    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }


    @Override
    public double getKeliling() {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (alas + tinggi + miring);
    }

    @Override
    public double getLuas() {
        return ((alas * tinggi) / 2);
    }
    
}
