package by.company.task;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
//пройдет ли кирпич через отверстие.

public class task8 {
    public static void main(String[] args) {

        int a = 9;
        int b = 20;

        int x = 4;
        int y = 40;
        int z = 4;

        if (((a >= x) && (b >= y)) || ((a >= y) && (b >= x)) ||
                ((a >= x) && (b >= z)) || ((a >= z) && (b >= x)) ||
                (((a >= z) && (b >= y)) || ((a >= y) && (b >= z)))) {
            System.out.println("пройдет");
        } else {
            System.out.println("не пройдет");
        }


    }
}
