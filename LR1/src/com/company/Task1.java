package com.company;

public class Task1
{
    private double[] array = new double[10];
    Task1()
    {
        for (int i = 0; i < array.length; i++)
            array[i] = Math.random()* (100 + 1);
    }
    private double findMax()
    {
        double max = array[0];
        for (double i: array)
        {
           if (i > max)
               max = i;
        }
        return max;
    }
    private double findMin()
    {
        double min = array[0];
        for (double i: array)
        {
            if (i < min)
                min = i;
        }
        return min;
    }
    private double findMean()
    {
        int summ = 0;
        for (double i: array)
            summ += i;
        return (double)(summ / array.length);
    }
    public void output()
    {
        System.out.println("Вывод массива: ");
        for (double i: array)
            System.out.println(i);
        System.out.println("Максимальное значение в массиве: " + findMax());
        System.out.println("Минимальное значение в массиве: " + findMin());
        System.out.println("Среднее значение в массиве: " + findMean());
    }

}
