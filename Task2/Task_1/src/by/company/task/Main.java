package by.company.task;

//Вычислить значение выражения по формуле (все переменные принимают действительные
//значения)
public class Main {

    public static void main(String[] args) {

        double a = 2;
        double b = 8;
        double c = -3;

        double y;

        y = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(y);
    }
}
