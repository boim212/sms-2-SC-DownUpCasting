package APP;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends SegiEmpat{

    private String nama ="Persegi Panjang";
    public PersegiPanjang() {
    }

    
    public PersegiPanjang(double panjang, double lebar, String warna,String nama) {
        super(panjang, lebar, warna);
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    
    @Override
    public double getKeliling(){
        return (2 * (super.getPanjang() + super.getLebar()) );
    }

    @Override
    public double getLuas() {
        return (super.getPanjang() * super.getLebar());
    }
    
}
