package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private int a;
        private char b;
        private boolean c;
        private String d;
        private short e;
        private byte f;

        public Human(int a)
        {
            this.a = a;
        }

        public Human(char b)
        {
            this.b = b;
        }

        public Human(boolean c)
        {
            this.c = c;
        }

        public Human(String d)
        {
            this.d = d;
        }

        public Human(short e)
        {
            this.e = e;
        }

        public Human(byte f)
        {
            this.f = f;
        }

        public Human(int a, char b, boolean c, String d, short e, byte f)
        {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public Human(int a, char b)
        {
            this.a = a;
            this.b = b;
        }

        public Human(boolean c, String d)
        {
            this.c = c;
            this.d = d;
        }

        public Human(short e, byte f)
        {
            this.e = e;
            this.f = f;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
