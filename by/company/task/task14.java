package by.company.task;

// 14. Требуется определить факториал числа, которое ввел пользователь.

public class task14 {
    public static void main(String[] args) {

        int a = 4;
        long mul = 1;

        if (a <= 0) {
            System.out.println("число не положительное");
            return;
        }

        for (int i = 1; i <= a; i++) {
            mul *= i;
        }
        System.out.println("факториал числа " + a + " равен " + mul);
    }
}
