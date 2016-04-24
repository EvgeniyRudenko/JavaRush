package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] strings = url.substring(url.indexOf("?")+1).split("&");
        String output = "";
        for (String s: strings){
            output+=s.substring(0,s.indexOf("=")>0 ? s.indexOf("=") : s.length()) + " ";
        }
        output=output.substring(0,output.length()-1);
        System.out.println(output);
        for (String s: strings){
            String parametr = s.substring(0,s.indexOf("=")>0 ? s.indexOf("=") : s.length());
            if (parametr.equals("obj")){
                try
                {
                   double value = Double.parseDouble(s.substring(s.indexOf("=")+1,s.length()));
                    alert(value);
                }
                catch (NumberFormatException e)
                {
                    alert(s.substring(s.indexOf("=")+1,s.length()));
                }
                return;
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
