package by.company.task;

// Вычислить значения функции на отрезке [а,b] c шагом h:

public class task11 {
    public static void main(String[] args) {
        double a = -10;
        double b = 10;
        double h = 0.5;

        double y;
        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x= " + x + " y= " + y);
        }
    }
}
