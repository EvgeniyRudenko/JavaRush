package com.javarush.test.level15.lesson12.home05;

public class SubSolution extends Solution{

    public SubSolution()
    {
        super();
    }

    protected SubSolution(double s)
    {
        super(s);
    }

    public SubSolution(int a)
    {
        super(a);
    }

    protected SubSolution(String s)
    {
        super(s);
    }

    public SubSolution(int a, String s)
    {
        super(a, s);
    }

    protected SubSolution(String s, String s1)
    {
        super(s, s1);
    }

    SubSolution(float a, float b)
    {
        super(a, b);
    }

    SubSolution(float a, int c)
    {
        super(a, c);
    }

    SubSolution(float a, String s)
    {
        super(a, s);
    }

    private SubSolution(short b){
        super();
    }

    private SubSolution(boolean b){
        super();

    }

    private SubSolution(boolean b, int a){
        super();

    }
}
