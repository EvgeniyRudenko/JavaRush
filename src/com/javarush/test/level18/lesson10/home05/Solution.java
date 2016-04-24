package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader inputFile = new BufferedReader(new FileReader ("C:\\Users\\Jeka\\Desktop\\999.txt"));
//        FileOutputStream outputFile = new FileOutputStream("C:\\Users\\Jeka\\Desktop\\888.txt");
        BufferedReader inputFile = new BufferedReader(new FileReader (reader.readLine()));
        FileOutputStream outputFile = new FileOutputStream(reader.readLine());
        reader.close();
        String[] values = inputFile.readLine().split(" ");
        String output = "";
        for (int i = 0; i < values.length; i++)
        {
            output += Math.round(Double.parseDouble(values[i])) + " ";
        }
        output=output.substring(0,output.length()-1);
        //System.out.println(output);
        outputFile.write(output.getBytes());
        inputFile.close();
        outputFile.close();
    }
}
