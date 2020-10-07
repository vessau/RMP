package com.company;

public class Task7
{
    private int[] array = new int[10];
    Task7()
    {
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()* 15);
    }
    public void findUniqueNumber()
    {
        System.out.println("Вывод исходного массива");
        for (int i: array)
            System.out.println(i);
        int unique;
        for (int i = 0; i < array.length; i++)
        {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++)
            {
                if ((i != j)&&(array[i] == array[j]))
                    isUnique = false;
            }
            if (isUnique)
            {
                unique = array[i];
                System.out.println("Первое уникальное число в массиве: " + unique);
                break;
            }
        }
    }

}
