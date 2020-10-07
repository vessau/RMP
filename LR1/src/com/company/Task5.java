package com.company;

import java.util.Scanner;

public class Task5
{
    public void output()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();
        System.out.println("Число Фибоначчи " + fibonacci(N));

    }
    public int fibonacci(int N)
    {
        if (N <= 1)
            return N;
        return fibonacci(N - 1) + fibonacci (N - 2);
    }

}
