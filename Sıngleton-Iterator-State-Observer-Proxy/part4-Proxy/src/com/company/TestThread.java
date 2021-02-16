package com.company;

public class TestThread extends Thread {
    ITable table;

    TestThread( ITable table ){
        this.table = table;

    }

    @Override
    public void run() {


        /*for( int i = 0; i < 10000; i++ ){
            synchronized (this){
                int val = (Integer)table.getElementAt( 1, 1 );
                val++;
                table.setElementAt( 1, 1, val );
            }
        }*/

        for( int i = 0; i < 10000; i++ ){
            table.increment_center();

        }


    }
}
