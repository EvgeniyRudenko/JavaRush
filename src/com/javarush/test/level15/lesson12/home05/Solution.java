package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(){

    }

    protected Solution(double s){

    }

    private Solution(short b){

    }

    public Solution(int a){

    }

    protected Solution(String s){

    }

    private Solution(boolean b){

    }

    public Solution(int a, String s){

    }

    protected Solution(String s, String s1){

    }

    private Solution(boolean b, int a){

    }

    Solution(float a ,float b){

    }

    Solution(float a, int c){

    }

    Solution(float a, String s){

    }
}

