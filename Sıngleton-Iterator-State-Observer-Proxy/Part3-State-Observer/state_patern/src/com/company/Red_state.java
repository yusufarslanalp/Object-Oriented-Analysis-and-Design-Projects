package com.company;

public class Red_state implements State {
    int time = 15;
    Traffic_light traffic_light;

    Red_state( Traffic_light traffic_light ){
        this.traffic_light = traffic_light;
    }


    @Override
    public void turn_on_red() {
        System.out.println( "turning red to red forbidden" );
    }

    @Override
    public void turn_on_green() {
        State new_state = traffic_light.getGreen_state();
        traffic_light.setState( new_state );
        new_state.print();
    }

    @Override
    public void turn_on_yellow() {
        System.out.println( "turning red to yellow forbidden" );
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void print(){
        System.out.println( "RED (" + time + "sn)" );
    }
}
