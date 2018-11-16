

public class operasiBilangan
{
    public int bilangan1, bilangan2;
    private int hasil;
    
    //method
    public void jumlah(){
        this.hasil = this.bilangan1 + this.bilangan2;
    }
    
    //method tampil hasil
    public void showHasil() {
        System.out.print("Hasil operasi bilangan : "+this.hasil);
    }
}
