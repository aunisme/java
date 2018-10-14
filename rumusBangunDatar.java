import java.io.*;
public class rumusBangunDatar{
    static class persegi{
       private int sisi, luas, kel;
       public void inpSisi(int s){
           sisi = s;
        }
       public void hitLuas(){
           luas = sisi * sisi;
        }
       public void hitKel(){
           kel = 4 * sisi;
        }
       public int showSisi(){
           return sisi;
        }
       public int showLuas(){
           return luas;
        }
       public int showKel(){
           return kel;
        }
    }
    static class lingkaran{
        private double  luas, kel,diameter;
        private int jariJari;
        public void inpJariJari(int r){
            jariJari = r;
        }
        public void inpDiameter(double d){
            diameter = d;
        }
        public void hitLuas(){
            luas = Math.PI * jariJari * jariJari;
        }
        public void hitKel(){
            kel = Math.PI * diameter;
        }
        public int showJariJari(){
            return jariJari ;
        }
        public double showLuas(){
            return luas;
        }
        public double showKel(){
            return kel;
        }
    }
    static class persegiPanjang{
        private int panjang, lebar, luas, kel;
        public void inpPanjang(int p){
            panjang = p;
        }
        public void inpLebar(int l){
            lebar = l;
        }
        public void hitLuas(){
            luas = panjang * lebar;
        }
        public void hitKel(){
            kel = 2 * (panjang + lebar);
        }
        public int showPanjang(){
            return panjang;
        }
        public int showLebar(){
            return lebar;
        }
        public int showLuas(){
            return luas;
        }
        public int showKel(){
            return kel;
        }
    }
}
