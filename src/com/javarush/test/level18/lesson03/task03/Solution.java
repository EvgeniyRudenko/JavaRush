package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        Map <Integer, Integer> map = new HashMap<>();
        while (inputStream.available()>0){
            int b = inputStream.read();
            if (!map.containsKey(b))
                map.put(b,1);
            else
                map.put(b,map.get(b)+1);
        }
        ArrayList<Integer> c = new ArrayList<>(map.values());
        Collections.sort(c);
        int max = c.get(c.size()-1);
        String output = "";
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue()==max)
                output += entry.getKey() + " ";
        }
        output = output.substring(0, output.length()-1);
        System.out.println(output);
        inputStream.close();
    }
}
