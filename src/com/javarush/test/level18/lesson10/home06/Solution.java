package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(args[0]);
//        FileInputStream inputStream = new FileInputStream("C:\\Users\\Jeka\\Desktop\\999.txt");
        Map<Integer, Integer> map = new TreeMap<>();
        while (inputStream.available()>0){
            int ch = inputStream.read();
            if (!map.containsKey(ch))
                map.put(ch,1);
            else
                map.put(ch, map.get(ch)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(Character.toChars(entry.getKey())[0] + " " + entry.getValue());
        }
        inputStream.close();
    }
}
