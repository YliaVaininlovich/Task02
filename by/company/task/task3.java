package by.company.task;

//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные
//единицы измерения информации.

public class task3 {
    public static void main(String[] args) {
        int a = 10_000_000;
        double kb;
        double mb;
        double gb;

        kb = a / 1024.0;
        System.out.println("Kb=" + kb);
        mb = a / 1048576.0;
        System.out.println("Mb=" + mb);
        gb = a / 1073741824.0;
        System.out.println("Gb=" + gb);
    }
}
