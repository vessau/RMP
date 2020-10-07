package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        Task1 task1 = new Task1();
        task1.output();
        System.out.println("Задание 2: ");
        Task2 task2 = new Task2();
        System.out.println("Сумма равна: " + task2.findSumm());
        System.out.println("Задание 3: ");
        Task3 task3 = new Task3();
        task3.allSorts();
        System.out.println("Задание 4: ");
        Task4 task4 = new Task4();
        task4.getSimpleNumbers();
        System.out.println("Задание 5: ");
        Task5 task5 = new Task5();
        task5.output();
        System.out.println("Задание 6: ");
        Task6 task6 = new Task6();
        task6.deleteNumber();
        System.out.println("Задание 7: ");
        Task7 task7 = new Task7();
        task7.findUniqueNumber();
        System.out.println("Задание 7: ");
        Task8 task8 = new Task8();
        task8.findRepeatNumber();

    }

}
