package com.company;

import java.util.Scanner;

public class Task2
{

    public int findSumm()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();
        System.out.println("Введите степень k: ");
        int k = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= N; i++)
            summ += Math.pow(i, k);
        return summ;
    }



}
