package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFile = new FileInputStream(reader.readLine());
        FileOutputStream outputFile = new FileOutputStream(reader.readLine());
        reader.close();
        int i=0;
        while (inputFile.available()>0){
            int b = inputFile.read();
            if (i%2==1)
                outputFile.write(b);
            i++;
        }
        inputFile.close();
        outputFile.close();
    }
}
