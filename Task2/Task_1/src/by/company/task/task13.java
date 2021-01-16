package by.company.task;

// 13. Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа.

public class task13 {
    public static void main(String[] args) {

        int a = 10;
        long sum = 0;

        if (a <= 0) {
            System.out.println("число не положительное");
            return;
        }

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("сумма чисел =" + sum);
    }
}
