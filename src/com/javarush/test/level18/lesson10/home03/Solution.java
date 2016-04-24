package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputFile1 = new FileOutputStream(reader.readLine());
        FileInputStream inputFile1 = new FileInputStream(reader.readLine());
        FileInputStream inputFile2 = new FileInputStream(reader.readLine());
        reader.close();
        while (inputFile1.available()>0){
            outputFile1.write(inputFile1.read());
        }
        while (inputFile2.available()>0){
            outputFile1.write(inputFile2.read());
        }
        outputFile1.close();
        inputFile1.close();
        inputFile2.close();
    }
}
