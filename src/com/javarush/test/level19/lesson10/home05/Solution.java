package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()){
            String s = reader.readLine();
            String[] words = s.split(" ");
            String output = "";
            for (String word: words){
                String newWord = word.replaceAll("[0123456789]", "");
                if (newWord.length()<word.length() && newWord.length()>0)
                    output += word + " ";
            }
            //output=output.substring(0,output.length()-1);
            writer.write(output);
        }
        reader.close();
        writer.close();
    }
}
