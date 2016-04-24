package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int n = 0;
        while (inputStream.available()>0){
            int code = inputStream.read();
            if ((code >= 'a' && code <= 'z') || (code >= 'A' && code <= 'Z'))
                n++;
        }
        inputStream.close();
        System.out.println(n);
    }
}
