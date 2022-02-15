package praktikum1;

import java.util.Scanner;

public class busPraktik {
    private double penumpang, counter;

    public void addPenumpang(int penumpang) {
        this.penumpang += penumpang;
    }

    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.counter += penumpang;
    }

    public double getAverage() {
        return this.counter / this.penumpang;
    }
    public void printer(){
        System.out.println(getAverage());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        busPraktik scania = new busPraktik();
        scania.addPenumpang(input.nextInt());
        for (int i = 0; i < scania.getPenumpang(); i++) {
            double temp = input.nextDouble();
            scania.setPenumpang(temp);
        }
        scania.getAverage();
        scania.printer();
    }
}
