package APP;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Persegi extends SegiEmpat{
    Scanner sc = new Scanner(System.in);
    double sisi;
    String nama = "Persegi";

    public Persegi() {
    }

    public Persegi(double sisi, String warna,String nama) {
        super(warna);
        this.sisi = sisi;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public double getSisi() {
        return sisi;
    }

    public String getNama() {
        return nama;
    }

    public void setSisi(double sisi) {
        if(sisi > 0){
            this.sisi = sisi;
        }else{
            this.sisi = 1.0;
            System.out.println("Sisi Tidak boleh negatif dan sisi tidak berubah");
        }
    }
    
    @Override
    public double getLuas() {
        return (sisi * sisi);
    }

    @Override
    public double getKeliling() {
        return (4 * sisi);
    }
    
    
}
