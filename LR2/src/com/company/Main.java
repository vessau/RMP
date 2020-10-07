package com.company;

import java.util.Objects;

public class Main
{

    public static void main(String[] args)
    {
        Vector[] v = Vector.createVectorArray(7);
        for (int i = 0; i < Objects.requireNonNull(v).length; i++)
            System.out.println("Вектор " + (i+1) + v[i]);

        System.out.println("Длина v1 " + v[0].calculateLength());
        System.out.println("Длина v2 " + v[1].calculateLength());

        System.out.println("Скалярное произведение " + v[0].calculateScalarMultiplication(v[1]));

        Vector result = v[0].calculateVectorMultiplication(v[1]);
        System.out.println("Векторное произведение v1 на v2 " + result);

        System.out.println("Косинус угла между векторами " + v[0].calculateAngle(v[1]));

        result  = v[0].calculateSumm(v[1]);
        System.out.println("Сумма векторов " + result);

        result  = v[0].calculateDifference(v[1]);
        System.out.println("Разность векторов " + result);
    }
}
