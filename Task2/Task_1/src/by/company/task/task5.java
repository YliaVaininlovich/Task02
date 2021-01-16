package by.company.task;

//Составить программу: определения наименьшего из двух чисел а и b

public class task5 {
    public static void main(String[] args) {

        int a = 19;
        int b = 1;

        if (a < b) {
            System.out.println("наименьшее - a");
        } else if (b < a) {
            System.out.println("наименьшее b");
        } else {
            System.out.println("числа равны");
        }

    }
}
