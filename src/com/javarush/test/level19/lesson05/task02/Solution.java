package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new File(reader.readLine()));
        reader.close();
        int count = 0;
        while (scanner.hasNextLine()){
            String s  = scanner.nextLine();
            String[] words = s.split(" ");
            for (String word : words)
            {
                if (word.replaceAll("\\p{Punct}", "").toLowerCase().equals("world"))
                    count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
