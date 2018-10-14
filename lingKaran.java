
public class lingKaran{
    private double  luas, kel,diameter;
    private int jariJari;
    public void inputJariJari(int r){
        jariJari = r;
    }
    public void inputDiameter(double d){
        diameter = d;
    }
    public void hitungLuasLingkaran(){
        luas = Math.PI * jariJari * jariJari;
    }
    public void hitungKelLingkaran(){
        kel = Math.PI * diameter;
    }
    public int getJariJari(){
        return jariJari ;
    }
}
