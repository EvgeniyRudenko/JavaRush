package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("Man1", 23, "Ukraine");
        Man man2 = new Man("Man2", 28, "World");
        Woman woman1 = new Woman("Woman1", 28, "Ukraine");
        Woman woman2 = new Woman("Woman2", 28, "Ukraine");
        man1.show();
        man2.show();
        woman1.show();
        woman2.show();
        //выведи их на экран тут
    }

    public static class Man{
        private String  name;
        private int age;
        private String  address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void show(){
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman
    {
        private String  name;
        private int age;
        private String  address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void show(){
            System.out.println(name + " " + age + " " + address);
        }
    }
    //добавьте тут ваши классы
}
