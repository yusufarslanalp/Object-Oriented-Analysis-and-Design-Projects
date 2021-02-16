package com.company;

import java.util.ArrayList;

public class Traffic_dedector extends HiTech implements Subject {
    //if raffic == true; traffic increased.
    //if traffic == false every thing is normal
    boolean traffic = false;
    ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void changeDetected(boolean flag) {
        notify_observers();
    }


    void change_traffic( boolean traffic ){
        this.traffic = traffic;
        changeDetected( this.traffic );
    }

    @Override
    public void register_observers( Observer o ) {
        observers.add( o );
    }

    @Override
    public void remove_observers( Observer o ) {
        int index = observers.indexOf( o );
        if( index >= 0 ){
            observers.remove( o );
        }
    }

    @Override
    public void notify_observers() {
        for( int i = 0; i < observers.size(); i++ ){
            Observer o = observers.get(i);
            o.update( traffic );
        }
    }
}
