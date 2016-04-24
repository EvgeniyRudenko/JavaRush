package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November", "December"));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
            map.put(list.get(i), i + 1);
        }
        int n = map.get(month);
        System.out.println(month + " is " + n + " month");
    }

}
