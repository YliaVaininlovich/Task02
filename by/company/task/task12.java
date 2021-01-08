package by.company.task;

//12. Вывести на экран соответствий между символами и их численными обозначениями в
//памяти компьютера (Таблицу ASCII).

public class task12 {
    public static void main(String[] args) {

        for (int i = 0; i <= 127; i++)
            System.out.println("числовое значение - " + i + " символ - " + (char) i);
    }
}
