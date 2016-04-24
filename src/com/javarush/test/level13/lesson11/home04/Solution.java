package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //FileOutputStream outputStream = new FileOutputStream(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String s = "";
        ArrayList<String> strings = new ArrayList<>();
        while (!s.equals("exit")){
            s = reader.readLine();
            strings.add(s+"\n");
        }
        for (String string: strings){
            writer.write(string);
        }
        reader.close();
        writer.close();
    }
}
