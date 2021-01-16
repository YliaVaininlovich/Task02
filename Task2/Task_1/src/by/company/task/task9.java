package by.company.task;

//#9 Вычислить значение функции:

public class task9 {
    public static void main(String[] args) {

        double x = 2;
        double f;

        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(f);
    }
}
