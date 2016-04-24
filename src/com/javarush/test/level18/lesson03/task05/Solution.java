package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //FileInputStream inputStream = new FileInputStream("C:\\Users\\Jeka\\Desktop\\999.txt");
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        Set<Integer> set = new HashSet<>();
        while (inputStream.available()>0){
            int b = inputStream.read();
            set.add(b);
        }
        Object[] array = set.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array).replace("[","").replace(",","").replace("]", ""));
        inputStream.close();
    }
}
