package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот,
который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        int n;
        for (int i = 0; i < 20; i++)
        {
            n = Integer.parseInt(reader.readLine());
            list.add(n);
            if (n%6==0){
                list3.add(n);
                list2.add(n);
            }
            else if (n%3==0)
                list3.add(n);
            else if (n%2==0)
                list2.add(n);
            else
                list0.add(n);
        }
        printList(list3);
        printList(list2);
        printList(list0);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
