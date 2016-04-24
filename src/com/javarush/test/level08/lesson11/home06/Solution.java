package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("child1", true, 9, null);
        Human child2 = new Human("child2", false, 4, null);
        Human child3 = new Human("child3", false, 4, null);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human mom = new Human("mom", false, 32, children);
        Human dad = new Human("dad", true, 33, children);
        Human grandma1 = new Human("grandma1", false, 65, new ArrayList<>(Arrays.asList(mom)));
        Human grandpa1 = new Human("grandpa1", true, 65, new ArrayList<>(Arrays.asList(mom)));
        Human grandma2 = new Human("grandma2", false, 66, new ArrayList<>(Arrays.asList(dad)));
        Human grandpa2 = new Human("grandpa2", true, 69, new ArrayList<>(Arrays.asList(dad)));
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(grandma1);
        System.out.println(grandpa1);
        System.out.println(grandma2);
        System.out.println(grandpa2);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;
        //напишите тут ваш код


        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = (children==null) ? 0 : this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }

}
