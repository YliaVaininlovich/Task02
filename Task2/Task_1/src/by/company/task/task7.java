package by.company.task;

//Подсчитать количество отрицательных среди чисел а, b, с.

public class task7 {
    public static void main(String[] args) {

        int a = 9;
        int b = -2;
        int c = -4;

        int count = 0;

        if (a < 0) {
            count++;
        }
        if (b < 0) {
            count++;
        }
        if (c < 0) {
            count++;
        }
        System.out.println("количество отрицателных чисел = " + count);

    }
}
