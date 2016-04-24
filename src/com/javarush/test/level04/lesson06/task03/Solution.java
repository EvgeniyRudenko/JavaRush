package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = min(min(a, b), c);
        int z = max(max(a, b), c);
        int y = (a>x && a<z) ? a : ((b>x && b<z) ? b : c);
        System.out.println(z +" " + y + " " + x);
    }
}
