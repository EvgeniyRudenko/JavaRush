package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i)!=' ' && s.charAt(i-1)==' ')
                s = s.substring(0, i) + s.substring(i,i+1).toUpperCase()+s.substring(i+1);

        }
        System.out.println(s);
        //напишите тут ваш код
    }
    /*
    public static String makeCapital(String str){
        String[] words = str.split(" ");
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < words.length; i++)
        {
            ret.append(Character.toUpperCase(words[i].charAt(0)));
            ret.append(words[i].substring(1));
            if (i < words.length - 1)
            {
                ret.append(' ');
            }
        }
        return ret.toString();
    }
    */
}
