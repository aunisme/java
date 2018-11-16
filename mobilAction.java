

public class mobilAction{
    public static void main(String [] args){
        //creating objek
        mobil myMobil = new mobil();
        
        //memanggil atribut dan memberi nilai
        myMobil.warna = "Hitam";
        myMobil.tahunProd = 2006;
        
        System.out.println("Warna : "+myMobil.warna);
        System.out.println("Tahun Produksi : "+myMobil.tahunProd);
        
        
    }
    
}
