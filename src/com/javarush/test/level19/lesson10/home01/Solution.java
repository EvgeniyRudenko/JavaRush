package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //Scanner scanner = new Scanner(new File(args[0]));
        Scanner scanner = new Scanner(new File("C:\\Users\\Jeka\\Desktop\\999.txt"));
        Map<String, Double> map = new TreeMap<>();
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            String name = s.split(" ")[0];
            Double value = Double.parseDouble(s.split(" ")[1]);
            map.put(name, (map.get(name)==null ? 0 : map.get(name)) + value);
        }
        scanner.close();
        for (Map.Entry<String, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
