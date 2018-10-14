import java.io.*;
public class testBuff{
   public static void main(String [] args) throws IOException{
       // Turunan class
       BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Berapa harga barang?");
       int a = Integer.parseInt(s.readLine());
       
       System.out.println("Berapa jumlah barang yang diambil");
       int b = Integer.parseInt(s.readLine());
       
       int total = a*b;
       
       System.out.print("Total belanja anda adalah " + total);
    }
}
