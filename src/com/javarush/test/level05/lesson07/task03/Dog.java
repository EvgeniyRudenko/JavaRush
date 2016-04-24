package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String имя;
    private int рост;
    private String цвет;

    public void initialize(String имя)
    {
        this.имя = имя;
    }

    public void initialize(String имя, int рост)
    {
        this.имя = имя;
        this.рост = рост;
    }

    public void initialize(String имя, int рост, String цвет)
    {
        this.имя = имя;
        this.рост = рост;
        this.цвет = цвет;
    }

}
