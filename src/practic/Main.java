package practic;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
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
                System.out.println("Введи 1 дробь через запятую \" , \": ");
                numX = Double.parseDouble(scanner.next());
                System.out.println("Введи 2 дробь через запятую \" , \": ");
                numY = Double.parseDouble(scanner.next());
                stop = true;
            } catch (NullPointerException exception) {
                System.out.println("Не корректный ввод");
                stop = false;
            } catch (NumberFormatException exception) {
                System.out.println("Не корректный ввод");
                stop = false;
            }
        } while (!stop);
        double finalNumX = numX;
        double finalNumY = numY;
        Thread threadRunnable = new Thread(() -> System.out.println("Сумма дробей равна: " + (finalNumX + finalNumY)));
        Thread threadRunnable2 = new Thread(() -> System.out.println("Разность дробей равна: " + (finalNumX - finalNumY)));
        Thread threadRunnable3 = new Thread(() -> System.out.println("Произведение дробей равно: " + (finalNumX * finalNumY)));
        Thread threadRunnable4 = new Thread(() -> System.out.println("Разность при делении дробей равна: " + (finalNumX / finalNumY)));
        threadRunnable.start();
        threadRunnable2.start();
        threadRunnable3.start();
        threadRunnable4.start();
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        executorService.submit(threadRunnable);
//        executorService.submit(threadRunnable2);
//        executorService.submit(threadRunnable3);
//        executorService.submit(threadRunnable4);

    }
}



