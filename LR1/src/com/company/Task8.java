package com.company;

import java.util.*;

public class Task8
{
    private int[] array = new int[10];
    Task8()
    {
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(1 + Math.random()* 6);
    }
    public void findRepeatNumber()
    {
        System.out.println("Вывод исходного массива");
        for (int i : array)
            System.out.println(i);
        System.out.println("Введите число K: ");
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int uniqueCount = uniqueCount();
        if(K > uniqueCount) {
            K = uniqueCount;
        }
        for(int k = 0; k < K; k++) {
            int max_index = 0, count, max_count = 0;
            for(int i = 0; i < array.length; i++) {
                count = 0;
                for(int j = 0; j < array.length; j++) {
                    if(array[j] == array[i])
                        count++;
                }
                if(count > max_count) {
                    max_count = count;
                    max_index = i;
                }
            }
            System.out.print(array[max_index] + " ");
            for (int j = k; j < array.length - 1; j++)
                array[j] = array[j+1];
            array[array.length - 1] = 0;
        }
    }
    private int uniqueCount()
    {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count;
    }

}

