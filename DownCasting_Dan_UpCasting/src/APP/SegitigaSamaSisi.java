package APP;
/**
 *
 * @author ASUS
 */
public class SegitigaSamaSisi extends Segitiga{
    private double sisiAB;
    private double sisiBC;
    private double sisiCA;
    private String nama = "Segitiga Sama Sisi";
    
    
    public SegitigaSamaSisi() {
    }

    public SegitigaSamaSisi(double sisiAB, double sisiBC, double sisiCA, String warna) {
        super(warna);
        this.sisiAB = sisiAB;
        this.sisiBC = sisiBC;
        this.sisiCA = sisiCA;
    }

    public double getSisiAB() {
        return sisiAB;
    }

    public void setSisiAB(double sisiAB) {
        if (sisiAB < 0 )
            sisiAB = 0;
        else if(sisiAB == 0 || sisiAB == 3)
            sisiAB = 1.0;
        else
            this.sisiAB = sisiAB;
    }

    public double getSisiBC() {
        return sisiBC;
    }

    public void setSisiBC(double sisiBC) {
        if (sisiBC < 0)
            sisiBC = 0;
        else if(sisiBC == 0 || sisiBC == 3)
            sisiBC = 1.0;
        else
            this.sisiBC = sisiBC;
    }

    public double getSisiCA() {
        return sisiCA;
    }

    public String getNama() {
        return nama;
    }

    public void setSisiCA(double sisiCA) {
        if (sisiCA < 0)
            sisiCA = 0;
        else if(sisiCA == 0 || sisiCA == 3)
            sisiCA = 1.0;
        else
            this.sisiCA = sisiCA;
    }
    @Override
    public double getKeliling() {
        if (sisiAB < 0 ){
            sisiAB = 0;
        }else if(sisiAB == 0 || sisiAB == 3){
            sisiAB = 1.0;
        }
        
        if (sisiBC < 0){
            sisiBC = 0;
        }
        else if(sisiBC == 0 || sisiBC == 3){
            sisiBC = 1.0;
        }
        
        if (sisiCA < 0){
            sisiCA = 0;
        }
        else if(sisiCA == 0 || sisiCA == 3){
            sisiCA = 1.0;
        }
        return (sisiAB + sisiBC + sisiCA);
        
    }

    @Override
    public double getLuas() {
        if (sisiAB < 0 ){
            sisiAB = 0;
        }else if(sisiAB == 0 || sisiAB == 3){
            sisiAB = 1.0;
        }
        
        if (sisiBC < 0){
            sisiBC = 0;
        }
        else if(sisiBC == 0 || sisiBC == 3){
            sisiBC = 1.0;
        }
        
        if (sisiCA < 0){
            sisiCA = 0;
        }
        else if(sisiCA == 0 || sisiCA == 3){
            sisiCA = 1.0;
        }
        double tinggi = Math.sqrt(Math.pow(sisiAB, 2)-Math.pow((0.5 * sisiAB), 2));
        return (0.5 * sisiAB * tinggi);
    }
    
}
