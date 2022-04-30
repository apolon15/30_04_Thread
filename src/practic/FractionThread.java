package practic;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FractionThread implements Runnable {
   double x;
    double y;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public FractionThread() {
        this.x = getX();
        this.y = getY();

    }

    @Override
    public void run() {
        if ("sum".equals(Thread.currentThread().getName())) {
            sum();
        }
        if ("diff".equals(Thread.currentThread().getName())) {
            diff();
        }
        if ("mult".equals(Thread.currentThread().getName())) {
            mult();
        }
        if ("div".equals(Thread.currentThread().getName())) {
            div();
        }
    }


    public void sum() {
        double z=this.x + this.y;
        System.out.println("Сумма дробей равна: " + z);
    }

    public void diff() {
        System.out.println("Разность дробей равна: " + (this.x - this.y));
    }

    public void mult() {
        System.out.println("Произведение дробей равно: " + (this.x * this.y));
    }

    public void div() {
        System.out.println("Разноссть при делении дробей равна: " + (this.x / this.y));
    }

}
