package com.javarush.test.level10.lesson04.task04;

/* Задача №4 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution
{
    public static void main(String[] args)
    {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println(nine);
        System.out.println((char)nine);
        int a = 57;
        System.out.println(a);
        System.out.println((char) a);
        System.out.println((char) 200);
    }
}
