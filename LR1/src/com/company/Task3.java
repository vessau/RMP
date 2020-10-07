package com.company;

public class Task3 {
    private double[] array = new double[10];
    private void generateArray()
    {
        for (int i = 0; i < array.length; i++)
            array[i] = Math.random()* (100 + 1);
    }
    private void output()
    {
        for (double i: array)
            System.out.println(i);
    }
    public void bubbleSort()
    {
        System.out.println("Сортировка пузырьком");
        double tmp;
        generateArray();
        System.out.println("Исходный массив: ");
        output();
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] > array[j])
                {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        output();
    }
    public void selectionSort()
    {
        System.out.println("Сортировка выбором");
        double tmp;
        generateArray();
        System.out.println("Исходный массив: ");
        output();
        for (int i = 0; i < array.length; i++)
        {
            int k = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[k])
                        k = j;
            }
            tmp = array[i];
            array[i] = array[k];
            array[k] = tmp;
        }
        System.out.println("Отсортированный массив: ");
        output();
    }

    public void insertionSort()
    {
        System.out.println("Сортировка вставками");
        generateArray();
        System.out.println("Исходный массив: ");
        output();
        for (int i = 1; i < array.length; i++)
        {
            double k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j]> k)
            {
                array[j + 1]= array[j];
                j = j - 1;
            }
            array[j + 1]= k;
        }
        System.out.println("Отсортированный массив: ");
        output();
    }
    public void allSorts()
    {
        bubbleSort();
        insertionSort();
        selectionSort();
    }




}


