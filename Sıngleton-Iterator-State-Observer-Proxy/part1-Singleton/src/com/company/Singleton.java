package com.company;

public class Singleton extends Super {
    private static Singleton unique_instance;

    public static Singleton get_instance(){
        if( unique_instance == null )
        {
            unique_instance = new Singleton();
        }
        return unique_instance;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
    private Singleton(){}
}













