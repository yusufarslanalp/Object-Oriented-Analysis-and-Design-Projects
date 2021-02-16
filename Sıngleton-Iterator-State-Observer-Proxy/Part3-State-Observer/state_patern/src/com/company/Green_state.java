package com.company;

public class Green_state implements State {
    int time = 60;
    Traffic_light traffic_light;

    Green_state( Traffic_light traffic_light ){
        this.traffic_light = traffic_light;
    }

    @Override
    public void turn_on_red() {
        System.out.println( "turning green to red forbidden" );
    }

    @Override
    public void turn_on_green() {
        System.out.println( "turning green to green forbidden" );
    }

    @Override
    public void turn_on_yellow() {
        State new_state = traffic_light.getYellow_state();
        traffic_light.setState( new_state );
        new_state.print();
    }

    @Override
    public void print() {
        System.out.println( "GREEN (" + time + "sn)" );
    }

    public void setTime(int time) {
        this.time = time;
    }

}
