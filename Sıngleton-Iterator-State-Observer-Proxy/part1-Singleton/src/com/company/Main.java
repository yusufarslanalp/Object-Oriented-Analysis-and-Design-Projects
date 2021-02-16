package com.company;


public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton s1 = Singleton.get_instance();
        Singleton s2 = (Singleton) s1.clone();

        if( s1 == s2 ) System.out.println( "s1 and s2 are equal" );
        else System.out.println( "s1 and s2 NOT equal" );
    }
}




//Singleton s3 = (Singleton) s1.clone();

        /*Super s1 = new Super();
        Super s2 = new Super();

        if( s1 == s2 ) System.out.println( "s1 and s2 are equal" );
        else System.out.println( "s1 and s1 NOT equal" );*/















/*
	// write your code here
        Test t = new Test();
        t.a = 10;
        t.b = 20;

        Test t2;

        //t.print();

        Sub_test sub_test = new Sub_test();
        sub_test.function();
        try {
            System.out.println( "heree" );
            //t2 = (Test) t.foo();
            //System.out.println( t2.a );
            //t2.print();
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }






        Sub sb = new Sub();
        sb.foo();
* */