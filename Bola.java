package luasBola;
import java.util.*;

public class Bola {
   private int jarijari;
   private final double phi = 3.14;
    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    public int showDiameter(){
        return jarijari * 2;
    }
    public double showLuasPermukaan(){
       return (4 * Math.PI * Math.pow(this.jarijari, 2));
    }
    public double showVolume(){
        return 4 * Math.PI * Math.pow(this.jarijari, 3) / 3;
    }
    public void print(){
        System.out.println("Luas Permukaan = " + showLuasPermukaan());
        System.out.println("Volume = " + showVolume() );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bola bentuk1 = new Bola();
        bentuk1.setJarijari(14);
        bentuk1.showLuasPermukaan();
        bentuk1.showVolume();
        bentuk1.print();
    }
}
