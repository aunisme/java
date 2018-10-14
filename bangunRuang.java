import java.io.*;

public class bangunRuang{
    public static void main(String [] args) throws IOException{
        
        BufferedReader opt = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Silahkan pilih operasi bangun ruang yang diinginkan : ");
        String pilihan = opt.readLine();
        
        switch (pilihan){
            case "A":
                System.out.print("Anda akan menghitung luas dan keliling Segitiga");
                break;
            case "B":
                System.out.print("Anda akan menghitung luas dan keliling Lingkaran");
                break;
            case "C":
                System.out.print("Anda akan menghitung luas dan keliling Persegi");
                
                break;
            case "D":
                System.out.print("Anda akan menghitung luas dan keliling Persegi Panjang");
                break;
                
            default:
                 System.out.print("Salah kali mas");
        }
    
    }
    
}
