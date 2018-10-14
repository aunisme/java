import java.io.*;
public class hitungBangunDatar extends rumusBangunDatar{
    public static void hitungPersegi() throws IOException{
        int s;
        persegi  p = new persegi();
        
        //Buffered
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //Input
        System.out.print("Masukan nilai sisi : ");
        s = Integer.valueOf(in.readLine());
        
        p.inpSisi(s);
        p.hitLuas();
        p.hitKel();
        
        System.out.println("Sisi : " + p.showSisi());
        System.out.println("Luas persegi adalah : " + p.showLuas());
        System.out.println("Keliling persegi adalah :" + p.showKel());
    }
   public static void hitungLingkaran() throws IOException{
       int r;
       double d;
       
       lingkaran l = new lingkaran();
       
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print("Masukan nilai jari-jari : ");
       r = Integer.valueOf(in.readLine());
       System.out.print("Masukan nilai diameter : ");
       d = Double.valueOf(in.readLine());
       
       l.inpJariJari(r);
       l.inpDiameter(d);
       l.hitLuas();
       l.hitKel();
       
       System.out.println("Jari-jari : " + l.showJariJari());
       System.out.println("Luas lingkaran adalah : " + l.showLuas());
       System.out.println("Keliling lingkaran adalah : " + l.showKel());  
    }
  public static void persegiPanjang() throws IOException{
      int p, l;
      
      persegiPanjang pP = new persegiPanjang();
      
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Masukan nilai panjang : ");
      p = Integer.valueOf(in.readLine());
      System.out.println("Masukan nilai lebar : ");
      l = Integer.valueOf(in.readLine());
      
      pP.inpPanjang(p);
      pP.inpLebar(l);
      pP.hitLuas();
      pP.hitKel();
      
      System.out.println("Panjang : " + pP.showPanjang());
      System.out.println("Lebar : " + pP.showLebar());
      System.out.println("Luas Persegi Panjang : " + pP.showLuas());
      System.out.println("Keliling Persegi Panjang : " + pP.showKel());
    }
}
