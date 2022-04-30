package practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
/*
При старте приложения запускаются три потока. Пер-
вый поток заполняет массив случайными числами. Два
других потока ожидают заполнения. Когда массив запол-
нен оба потока запускаются. Первый поток находит сумму
элементов массива, второй поток среднеарифметическое
значение в массиве. Полученный массив, сумма и средне-
арифметическое возвращаются в метод main, где должны
быть отображены.
 */
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.setName("CREATMASS");
//        myThread1.start();
//        try {
//            myThread1.join();
//            MyThread1 myThread2 = new MyThread1();
//            MyThread1 myThread3 = new MyThread1();
//            myThread2.setName("AVG");
//            myThread2.start();
//            System.out.println("Среднее значение в массиве " + myThread2.avg(myThread1.getMass()));
//            myThread2.join();
//            myThread3.setName("SUM");
//            myThread3.start();
//            System.out.println("Cумма чисел в массиве " + myThread3.sum(myThread1.getMass()));
//            System.out.println(Arrays.toString(myThread1.getMass()));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
/*
При старте приложения попросите пользователя ввести 2 дроби.
Затем используя интерфейс Runnable запустить 4 потока,
которые используя лямбда-выражения выполнят действия:
Сумма двух дробей;
Разница двух дробей;
Произведение двух дробей;
Деление двух дробей.
Результ операций нужно вывести в консоль.
 */
        Scanner scanner = new Scanner(System.in);
        boolean stop;
        double numX = 0;
        double numY = 0;
        do {
            try {
                stop = false;
                System.out.println("Введи 1 дробь через запятую \" , \": ");
                numX = scanner.nextDouble();
                System.out.println("Введи 2 дробь через запятую \" , \": ");
                numY = scanner.nextDouble();

            } catch (InputMismatchException exception) {
                System.out.println("Не корректный ввод");
                stop = false;
            }
        } while (stop);
        FractionThread fractionThread = new FractionThread();
        fractionThread.setX(numX);
        fractionThread.setY(numY);
        FractionThread fractionThread2 = new FractionThread();
        FractionThread fractionThread3 = new FractionThread();
        FractionThread fractionThread4 = new FractionThread();
        fractionThread2.setX(numX);
        fractionThread2.setY(numY);
        fractionThread3.setX(numX);
        fractionThread3.setY(numY);
        fractionThread4.setX(numX);
        fractionThread4.setY(numY);
        Thread threadRunnable = new Thread(fractionThread);
        Thread threadRunnable2 = new Thread(fractionThread2);
        Thread threadRunnable3 = new Thread(fractionThread3);
        Thread threadRunnable4 = new Thread(fractionThread4);
        threadRunnable4.setName("div");
        threadRunnable3.setName("mult");
        threadRunnable2.setName("diff");
        threadRunnable.setName("sum");
        threadRunnable.start();
    //    threadRunnable.join();
        threadRunnable2.start();
       // threadRunnable2.join();
        threadRunnable3.start();
      //  threadRunnable3.join();
        threadRunnable4.start();
    }
}



