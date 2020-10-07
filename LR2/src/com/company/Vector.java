package com.company;

public class Vector
{
    private double x, y, z;
    Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString()
    {
        return " X = " + x + ", Y = " + y + ", Z = " + z;
    }

    public double calculateLength()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public double calculateScalarMultiplication(Vector v)
    {
        return (x * v.x + y * v.y + z * v.z);
    }
    public Vector calculateVectorMultiplication(Vector v)
    {
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }
    public double calculateAngle(Vector v)
    {
        return (calculateScalarMultiplication(v) /  (calculateLength() * v.calculateLength()));
    }
    public Vector calculateSumm(Vector v)
    {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }
    public Vector calculateDifference(Vector v)
    {
        return new Vector(x - v.x, y - v.y, z - v.z);
    }
    public static Vector[] createVectorArray(int length)
    {
        if (length > 0)
        {
            Vector v[] = new Vector[length];
            for (int i = 0; i < length; i++)
                v[i] = new Vector(Math.random() * 100, Math.random() * 100, Math.random() * 100);
            return v;
        }
        return null;

    }
}
