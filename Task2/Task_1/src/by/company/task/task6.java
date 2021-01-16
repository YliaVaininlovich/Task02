package by.company.task;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
//если да, то будет ли он прямоугольным.

public class task6 {
    public static void main(String[] args) {

        int a = 45;
        int b = 90;

        if (a <= 0 || b <= 0 || a + b >= 180) {
            System.out.println("треугольника с такими углами не существует");
        } else if (180 - (a + b) == 90 || a == 90 || b == 90) {
            System.out.println("треугольник прямоугольный");
        } else {
            System.out.println("треугольник не прямоугольный");
        }

    }
}
