package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        //BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Oleks\\Desktop\\999.txt"));
        reader.close();
        while (file.ready()){
            words.addAll(Arrays.asList(file.readLine().split(" ")));
        }
        file.close();
        for (int i = 0; i < words.size(); i++)
        {
            for (int j = 0; j < words.size(); j++)
            {
                String word1 = words.get(i);
                String word2 = words.get(j);
                if (word1.equals(new StringBuilder(word2).reverse().toString()) && i!=j){
                    result.add(new Pair(word1, word2));
                    words.remove(word1);
                    words.remove(word2);
                    continue;
                }
            }
        }
        for (Pair pair: result){
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String first, String second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
