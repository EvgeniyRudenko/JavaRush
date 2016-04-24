package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
//2
        try
        {
            throw new RuntimeException();
        }
        catch (RuntimeException e)
        {
            exceptions.add(e);
        }
//3
        try
        {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e)
        {
            exceptions.add(e);
        }
//4
        try
        {
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }
//5
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            exceptions.add(e);
        }
//6
        try
        {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e)
        {
            exceptions.add(e);
        }
//7
        try
        {
            throw new NumberFormatException();
        }
        catch (NumberFormatException e)
        {
            exceptions.add(e);
        }
//8
        try
        {
            throw new UnsupportedOperationException();
        }
        catch (UnsupportedOperationException e)
        {
            exceptions.add(e);
        }
//9
        try
        {
            throw new NoSuchMethodException();
        }
        catch (NoSuchMethodException e)
        {
            exceptions.add(e);
        }
//10
        try
        {
            throw new NoSuchFieldException();
        }
        catch (NoSuchFieldException e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
