package com.javarush.test.level08.lesson08.task04;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

import java.util.*;

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i < 10; i++)
        {
            map.put("human"+i, new Date());
        }
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for(Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ){
            Date date = iterator.next().getValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int month = calendar.get(Calendar.MONTH)+1;
            //System.out.println(month);
            if (month >=6 && month <=8)
                iterator.remove();
        }
    }

/*    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();                  //значение
            System.out.println(key + " : " + value);
        }
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Date value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }
    }*/
}
