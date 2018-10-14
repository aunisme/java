import java.io.*;

public class perSegi{
   private int sisi, luas, kel;
   public void inputSisi(int s){
       sisi = s;
    }
   public void hitungLuasPersegi(){
      luas = sisi * sisi;
    }
   public void hitungKelPersegi(){
       kel = 4 * sisi;
    }
   public int getSisi(){
       return sisi;
    }
   public int getLuasPersegi(){
       return luas;
    }
   public int getKelPersegi(){
       return kel;
    }
       
}
