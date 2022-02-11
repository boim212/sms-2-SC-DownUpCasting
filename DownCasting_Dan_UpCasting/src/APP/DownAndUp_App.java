package APP;

import java.util.Scanner;

public class DownAndUp_App {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipe,jawab,ulang,jumlah;
        double sisi, panjang,lebar, jejari,d1,d2;
        double sisiAB,sisiBC,sisiCA, tinggi, alas;
        String nama,warna;
        
        do{
            System.out.println("==========================================");
            System.out.println("=Program Membuat Perhitungan Bangun Datar=");
            System.out.println("=Oleh                                    =");
            System.out.println("= Nama : Life For Coding                 =");
            System.out.println("= Build By : Skuy Replay                 =");
            System.out.println("==========================================");
            System.out.println("= Pilihan Tipe Bangun Datar              =");
            System.out.println("= 1. Persegi                             =");
            System.out.println("= 2. Pesegi Panjang                      =");
            System.out.println("= 3. Belah Ketupat                       =");
            System.out.println("= 4. Segitiga Sama Sisi                  =");
            System.out.println("= 5. Segitiga Siku Siku                  =");
            System.out.println("= 6. Lingkaran                           =");
            System.out.println("==========================================");
            
            
            BangunDatar[] bentuk;
            bentuk = new BangunDatar[5];
            
            
            ulang = 1;
            
            for (int i = 0; i < bentuk.length; i++) {
                do{
                    System.out.println("");
                    System.out.println("==========================================");
                    System.out.print  ("Pilih Tipe Bangun Datar : ");
                    tipe = sc.nextInt();
                    System.out.println("==========================================");
                    System.out.println("");
                
                }while(tipe < 1 || tipe > 6);
                
                ulang++;
                
                if (tipe == 1){
                    System.out.println("");
                    bentuk[i] = new Persegi();
                    Persegi persegi = (Persegi) bentuk[i];
                    
                    System.out.println("Bangun Datar ("+persegi.getNama()+")");
                    System.out.print  ("Masukkan Sisi  : ");
                    sisi = sc.nextDouble();
                    System.out.print  ("Masukkan Warna : ");
                    warna = sc.next();
                    
                    persegi.setSisi(sisi);
                    persegi.setWarna(warna);
                    System.out.println("==========================================");
                }
                else if(tipe == 2){
                    System.out.println("");
                    bentuk[i] = new PersegiPanjang();
                    PersegiPanjang persegiPanjang = (PersegiPanjang) bentuk[i];
                    System.out.println("Bangun Datar ("+persegiPanjang.getNama()+")");
                    
                    System.out.print  ("Masukkan Panjang : ");
                    panjang = sc.nextDouble();
                    System.out.print  ("Masukkan Lebar   : ");
                    lebar = sc.nextDouble();
                    System.out.print  ("Masukkan Warna   : ");
                    warna = sc.next();
                    
                    persegiPanjang.setPanjang(panjang);
                    persegiPanjang.setLebar(lebar);
                    persegiPanjang.setWarna(warna);
                    System.out.println("==========================================");
                }
                else if(tipe == 3){
                    System.out.println("");
                    bentuk[i] = new BelahKetupat();
                    BelahKetupat belahKetupat = (BelahKetupat) bentuk[i];
                    System.out.println("Bangun Datar ("+belahKetupat.getNama()+")");
                    
                    System.out.print  ("Masukkan Sisi    : ");
                    sisi = sc.nextDouble();
                    System.out.print  ("Masukkan d 1     : ");
                    d1 = sc.nextDouble();
                    System.out.print  ("Masukkan d 2     : ");
                    d2 = sc.nextDouble();
                    System.out.print  ("Masukkan Warna   : ");
                    warna = sc.next();
                    
                    belahKetupat.setSisi(sisi);
                    belahKetupat.setD1(d1);
                    belahKetupat.setD2(d2);
                    belahKetupat.setWarna(warna);
                    System.out.println("==========================================");
                }
                else if(tipe == 4){
                    System.out.println("");
                    bentuk[i] = new SegitigaSamaSisi();
                    SegitigaSamaSisi segitigaSamaSisi = (SegitigaSamaSisi) bentuk[i];
                    System.out.println("Bangun Datar ("+segitigaSamaSisi.getNama()+")");
                    
                    do{
                        System.out.println("");
                        System.out.print  ("Masukkan Sisi AB : ");
                        sisiAB = sc.nextDouble();
                        System.out.print  ("Masukkan Sisi BC : ");
                        sisiBC = sc.nextDouble();
                        System.out.print  ("Masukkan Sisi CA : ");
                        sisiCA = sc.nextDouble();
                    }while (sisiAB != sisiBC || sisiBC != sisiCA || sisiAB != sisiCA);
                    
                    System.out.print  ("Masukkan Warna   : ");
                    warna = sc.next();
                    
                    segitigaSamaSisi.setSisiAB(sisiAB);
                    segitigaSamaSisi.setSisiBC(sisiBC);
                    segitigaSamaSisi.setSisiCA(sisiCA);
                    segitigaSamaSisi.setWarna(warna);
                    System.out.println("==========================================");
                }
                else if(tipe == 5){
                    System.out.println("");
                    bentuk[i] = new SegitigaSikuSiku();
                    SegitigaSikuSiku segitigaSikuSiku = (SegitigaSikuSiku) bentuk[i];
                    System.out.println("Bangun Datar ("+segitigaSikuSiku.getNama()+")");
                    System.out.print  ("Masukkan Tinggi : ");
                    tinggi = sc.nextDouble();
                    System.out.print  ("Masukkan Alas   : ");
                    alas = sc.nextDouble();
                    System.out.print  ("Masukkan Warna  : ");
                    warna = sc.next();
                    
                    segitigaSikuSiku.setAlas(alas);
                    segitigaSikuSiku.setTinggi(tinggi);
                    segitigaSikuSiku.setWarna(warna);
                    System.out.println("==========================================");
                }
                else if(tipe == 6){
                    System.out.println("");
                    bentuk[i] = new Lingkaran();
                    Lingkaran lingkaran = (Lingkaran) bentuk[i];
                    System.out.println("Bangun Datar ("+lingkaran.getNama()+")");
                    
                    System.out.print  ("Masukkan Jejari : ");
                    jejari = sc.nextDouble();
                    System.out.print  ("Masukkan Warna  : ");
                    warna = sc.next();
                    
                    lingkaran.setJejari(jejari);
                    lingkaran.setWarna(warna);
                    System.out.println("==========================================");
                }
            }
            
            
            System.out.println("");
            System.out.println("");
            int ulang1 = 1;
            System.out.println("========================================================================");
            System.out.println("= No   Nama Bangun Datar    Keliling    Luas      warna     Atributnya =");
            System.out.println("========================================================================");
            for (int i = 0; i < bentuk.length; i++) {
                //1
                if (bentuk[i] instanceof Persegi){
                    Persegi persegi = (Persegi)bentuk[i];
                    System.out.printf ("= %d    %s              %.1f       %.1f      %s      (Sisi)%.1f \n",ulang1,persegi.getNama(),persegi.getKeliling(),persegi.getLuas(),persegi.getWarna(),persegi.getSisi());
                    System.out.println("========================================================================");
                    ulang1++;
                }
                //2
                else if (bentuk[i] instanceof PersegiPanjang){
                    PersegiPanjang persegiPanjang = (PersegiPanjang)bentuk[i];
                    
                    System.out.printf ("= %d   %s      %.1f        %.1f      %s      (Panjang)%.1f \n",ulang1,persegiPanjang.getNama(),persegiPanjang.getKeliling(),persegiPanjang.getLuas(),persegiPanjang.getWarna(),persegiPanjang.getPanjang());
                    System.out.printf ("=                                                          (Lebar)%.1f \n",persegiPanjang.getLebar());
                    System.out.println("========================================================================");
                    ulang1++;
                }
                //3
                else if (bentuk[i] instanceof BelahKetupat){
                    BelahKetupat belahKetupat = (BelahKetupat)bentuk[i];
                    
                    
                    System.out.printf ("= %d   %s        %.1f        %.1f       %s      (Sisi)%.1f \n",ulang1,belahKetupat.getNama(),belahKetupat.getKeliling(),belahKetupat.getLuas(),belahKetupat.getWarna(),belahKetupat.getSisi());
                    System.out.printf ("=                                                          (d1)%.1f \n",belahKetupat.getD1());
                    System.out.printf ("=                                                          (d2)%.1f \n",belahKetupat.getD2());
                    System.out.println("========================================================================");
                    ulang1++;
                    
                }
                //4
                else if (bentuk[i] instanceof SegitigaSamaSisi){
                    SegitigaSamaSisi segitigaSamaSisi = (SegitigaSamaSisi)bentuk[i];
                    System.out.printf ("= %d    %s    %.1f      %.1f      %s      (Sisi)%.1f \n",ulang1,segitigaSamaSisi.getNama(),segitigaSamaSisi.getKeliling(),segitigaSamaSisi.getLuas(),segitigaSamaSisi.getWarna(),segitigaSamaSisi.getSisiAB());
                    System.out.println("========================================================================");
                    ulang1++;
                    
                }
                //5
                else if (bentuk[i] instanceof SegitigaSikuSiku){
                    SegitigaSikuSiku segitigaSikuSiku = (SegitigaSikuSiku)bentuk[i];
                    System.out.printf ("= %d   %s   %.1f        %.1f      %s      (Tinggi)%.1f \n",ulang1,segitigaSikuSiku.getNama(),segitigaSikuSiku.getKeliling(),segitigaSikuSiku.getLuas(),segitigaSikuSiku.getWarna(),segitigaSikuSiku.getTinggi());
                    System.out.printf ("=                                                          (Alas)%.1f \n",segitigaSikuSiku.getAlas());
                    System.out.println("========================================================================");
                    ulang1++;
                    
                }
                //6
                else if (bentuk[i] instanceof Lingkaran){
                    Lingkaran lingkaran = (Lingkaran)bentuk[i];
                    
                    System.out.printf ("= %d   %s            %.1f        %.1f      %s      (Jejari)%.1f \n",ulang1,lingkaran.getNama(),lingkaran.getKeliling(),lingkaran.getLuas(),lingkaran.getWarna(),lingkaran.getJejari());
                    System.out.printf ("=                                                          (PI)%2.2f \n",lingkaran.getPI());
                    System.out.println("========================================================================");
                    ulang1++;
                    
                }
            }
            
            
            System.out.println("");
            System.out.println("========================================================================");
            System.out.println("= Apakah Anda Ingin Menulang Kembali Perhitungan?                      =");
            System.out.print (" (Yes = 1) or (No = 0)? : ");
            jawab = sc.nextInt();
            System.out.println("========================================================================");
            
            System.out.printf("\n "+"\n"+"\n "+"\n"+"\n "+"\n");
        }while(jawab == 1);
        
        
    }
    
}
