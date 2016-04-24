package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {

//    public static void main(String[] args)
//    {
//        System.out.println(getPartOfString("JavaRush - лучший"));
//    }

    public static String getPartOfString(String string)
    {
        if (string==null) throw new TooShortStringException();
        if (string.length()-string.replace(" ","").length()<4)
            throw new TooShortStringException();
        int space1 = string.indexOf(" ");
        int space4 = string.indexOf(" ", 1 + string.indexOf(" ", string.indexOf(" ", space1 + 1) + 1));
        int space5 = string.indexOf(" ", 1 + space4);
        if (space5 != -1)
            return string.substring(space1 + 1, space5);
        if (space4 != -1)
            return string.substring(space1 + 1);
        throw new TooShortStringException();
    }


    public static class TooShortStringException extends RuntimeException{
    }
}
