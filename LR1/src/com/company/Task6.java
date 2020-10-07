package com.company;


import java.util.Scanner;

public class Task6
{
    private int[] array = new int[10];
    Task6()
    {
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(1 + Math.random()* 6);
    }
    public void deleteNumber()
    {
        System.out.println("Вывод исходного массива");
        for (int i: array)
            System.out.println(i);
        System.out.println("Введите число, которое нужно удалить: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == N)
            {
                for (int j = i; j < array.length - 1; j++)
                    array[j] = array[j+1];
                array[array.length - 1] = 0;
            }



        }
        System.out.println("Итоговый массив: ");
        for (int i: array)
            System.out.println(i);
    }


}
