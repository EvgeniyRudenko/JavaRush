package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream outputFile = new FileInputStream(fileName);
        FileInputStream inputFile = new FileInputStream(reader.readLine());
        reader.close();

        byte[] buffer1 = new byte[inputFile.available()];
        inputFile.read(buffer1);
        inputFile.close();

        byte[] buffer2  = new byte[outputFile.available()];
        outputFile.read(buffer2);
        outputFile.close();

        FileOutputStream inputStream = new FileOutputStream(fileName);
        inputStream.write(buffer1);
        inputStream.write(buffer2);
        inputStream.close();

    }
}
