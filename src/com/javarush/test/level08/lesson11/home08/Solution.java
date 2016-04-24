package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        Arrays.sort (array);
        int[] arr = new int[array.length];
        for (int i = arr.length - 1, j = 0; i >= 0 ; i--)
        {
            arr[i] = array[j++];
        }
        System.arraycopy(arr, 0, array, 0, arr.length);
    }
    /*
    private static int max(int[] array, int a, int b){
        int max = array[a];
        for (int i = a+1; i < b; i++)
        {
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }
    */
}
