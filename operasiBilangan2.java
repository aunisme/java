
public class operasiBilangan2
{
    public static void main(String [] args){
        //instantisasi objek op1
        operasiBilangan op1 = new operasiBilangan();
        
        op1.bilangan1 = 10;
        op1.bilangan2 = 20;
        op1.jumlah();
        
        //instantisasi objek op2
        operasiBilangan op2 = new operasiBilangan();
        
        op2.bilangan1 = 30;
        op2.bilangan2 = 25;
        op2.jumlah();
        op2.showHasil();
        
    }
}
