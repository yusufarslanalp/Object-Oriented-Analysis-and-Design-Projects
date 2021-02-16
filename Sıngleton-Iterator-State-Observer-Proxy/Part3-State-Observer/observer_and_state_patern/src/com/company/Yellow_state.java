package com.company;

import java.util.concurrent.TimeUnit;

public class Yellow_state implements State {
    int time = 3;
    Traffic_light traffic_light;

    Yellow_state( Traffic_light traffic_light ){
        this.traffic_light = traffic_light;
    }

    @Override
    public void turn_on_red() {
        State new_state = traffic_light.getRed_state();
        traffic_light.setState( new_state );
        new_state.print();
    }

    @Override
    public void turn_on_green() {
        System.out.println( "turning yellow to green forbidden" );
    }

    @Override
    public void turn_on_yellow() {
        System.out.println( "turning yellow to yellow forbidden" );
    }

    @Override
    public void print() {
        System.out.println( "YELLOW (" + time + "sn)" );
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void setTime(int time) {
        this.time = time;
    }
}
