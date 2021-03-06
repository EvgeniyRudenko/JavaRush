package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            String s = reader.readLine();
            String[] pieces = s.split(" ");
            int n = pieces.length;
            Calendar calendar = new GregorianCalendar(Integer.parseInt(pieces[n-1]),
                    Integer.parseInt(pieces[n-2])-1, Integer.parseInt(pieces[n-3]));
            String name = "";
            switch (n){
                case 4: name = pieces[0]; break;
                case 5: name = pieces[0] + " " + pieces[1];break;
                case 6: name = pieces[0] + " " + pieces[1] + " " + pieces[2];break;
            }
            PEOPLE.add(new Person(name, calendar.getTime()));
        }
        reader.close();
    }

}
