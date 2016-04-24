package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("name",null);
        map.put("country",null);
        map.put("city",null);
        map.put("age",null);
        getCondition(map);
    }

    public static StringBuilder getCondition(Map<String, String> params) {
        if (params==null)
            return new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (Map.Entry entry: params.entrySet()){
            if (entry.getValue()!=null)
                result.append(String.format("%s = '%s' and ", entry.getKey(),entry.getValue()));
        }
        if (result.length()!=0)
            result.replace(result.length() - 5, result.length(), "");
        System.out.println(result);
        return result;
    }
}
