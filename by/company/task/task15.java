package by.company.task;

// 15. Найти НОД двух целых положительных чисел.

public class task15 {
    public static void main(String[] args) {

        int a = 90;
        int b = 25;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else if (b > a) {
                b = b - a;
            }
        }
        System.out.println("РќРћР” = " + b);
    }
}
