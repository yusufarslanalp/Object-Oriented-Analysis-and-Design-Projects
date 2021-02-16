package com.company;

public class Traffic_light implements Observer {
    State red_state;
    State green_state;
    State yellow_state;

    //set state as yellow. So initial state will be RED.
    State state;

    Traffic_dedector traffic_dedector;

    public Traffic_light( Traffic_dedector traffic_dedector ) {
        red_state = new Red_state( this );
        green_state = new Green_state( this );
        yellow_state = new Yellow_state( this );

        //set state as yellow. So initial state will be RED.
        state = yellow_state;

        this.traffic_dedector = traffic_dedector;
        traffic_dedector.register_observers( this );
    }

    @Override
    public void update( boolean traffic ) {
        if( traffic ){
            ((Green_state)green_state).setTime( 90 );
        }
        else{
            ((Green_state)green_state).setTime( 60 );
        }
    }

    void turn_on_red(){
        state.turn_on_red();
    }

    void turn_on_green(){
        state.turn_on_green();
    }

    void turn_on_yellow(){
        state.turn_on_yellow();
    }



    public void setState(State state) {
        this.state = state;
    }

    public State getRed_state() {
        return red_state;
    }

    public State getGreen_state() {
        return green_state;
    }

    public State getYellow_state() {
        return yellow_state;
    }
}
