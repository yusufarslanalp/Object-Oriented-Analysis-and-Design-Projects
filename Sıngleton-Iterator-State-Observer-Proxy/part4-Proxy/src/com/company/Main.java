package com.company;

public class Main {



    public static void main(String[] args) throws InterruptedException {
	    DataBaseTable DB_table_1 = new DataBaseTable();


        TestThread t1 = new TestThread( DB_table_1 );
        TestThread t2 = new TestThread( DB_table_1 );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println( "DataBaseTable has no multi thread property" );
        System.out.println( "Two thread increased center value of table 10 000 times." );
        System.out.println( "The center value should be 20 000. But it is not." );
        System.out.println( "With proxy design patern we can solve this issue " );
        System.out.println( DB_table_1 );


        DataBaseTable DB_table_2 = new DataBaseTable();
        ProxyDataBaseTable proxy_DB_table = new ProxyDataBaseTable( DB_table_2 );

        TestThread t3 = new TestThread( proxy_DB_table );
        TestThread t4 = new TestThread( proxy_DB_table );
        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println( "ProxyDataBaseTable class is a proxy for DataBaseTable class." );
        System.out.println( "Due to ProxyDataBaseTable class center value of table is 20 000" );
        System.out.println( proxy_DB_table );



    }
}
