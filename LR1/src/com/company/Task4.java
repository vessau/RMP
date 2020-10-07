package com.company;

import java.util.ArrayList;

public class Task4
{
    private ArrayList<Integer> simpleNumbers = new ArrayList<Integer>();
    public void getSimpleNumbers()
    {
        for (int i = 2; i < 100; i++)
        {
            int countDivisors = 0;
            for (int j = 2; j < 100; j++)
            {
                if (i % j == 0)
                    countDivisors++;
            }
            if (countDivisors < 2)
                simpleNumbers.add(i);
        }
        System.out.println("Простые числа: " + simpleNumbers.toString());

    }


}
