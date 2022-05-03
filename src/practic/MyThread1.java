package practic;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MyThread1 extends Thread {
    private int[] mass;
   // private double avgMass;
 //   private int sum;

    public MyThread1() {

    }
    public void setMass(int[] mass) {
        this.mass = mass;
    }

    public int[] getMass() {
        return mass;
    }
    public int[] creatMass() {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 30);
        }
        setMass(mass);
        return mass;
    }
    @Override
    public void run() {
        if ("CREATMASS".equals(Thread.currentThread().getName())) {
            creatMass();
        }
        if ("AVG".equals(Thread.currentThread().getName())) {
            System.out.println("Среднее значение в массиве " + avg(getMass()));

        }if ("SUM".equals(Thread.currentThread().getName())) {
            System.out.println("Cумма чисел в массиве "+sum(getMass()));
        }
    }

    public int sum(int[] mass) {
        return Arrays.stream(mass).sum();
    }

    public OptionalDouble avg(int[] mass) {
        return Arrays.stream(mass).average();
    }
}
