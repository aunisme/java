
/**
 * @author (Muhammad Syahrul)
 */
import java.io.*;
public class menu{
    public static void main(String [] args)throws IOException{
        System.out.print("Hitung Bangun Datar");
        
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        hitungBangunDatar h = new hitungBangunDatar();
        
        String pilihan;
        int p = 4;
        while(p!=0){
            System.out.println("MENU");
            System.out.println("[1] Persegi");
            System.out.println("[2] Persegi Panjang");
            System.out.println("[3] Lingkaran");
            System.out.println("Masukan pilihan");
            p = Integer.valueOf(m.readLine());
                switch(p){
                    case 1 : h.hitungPersegi(); break;
                    case 2 : h.hitungLingkaran(); break;
                    case 3 : h.persegiPanjang(); break;
                    default: System.out.print("Salah mas");
                }
            System.out.println("Lanjut? 0 = keluar");
            p = Integer.valueOf(m.readLine());
        }
    }
}
