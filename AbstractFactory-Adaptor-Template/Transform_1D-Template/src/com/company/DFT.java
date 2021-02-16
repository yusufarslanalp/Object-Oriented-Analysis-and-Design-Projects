package com.company;

import java.util.ArrayList;


public class DFT extends Transform_1D {
    protected ArrayList<Complex_number> transformed_data = new ArrayList<Complex_number>();
    protected boolean print_execution_time = false;
    protected long duration;

    public DFT(String input_path, String output_path) {
        super(input_path, output_path);
    }

    @Override
    void transform() {


        long startTime = System.nanoTime();
        for(int i = 0; i < input_data.size(); i++)
        {
            transformed_data.add( formula( i ) );
        }
        long endTime = System.nanoTime();
        duration = (endTime - startTime);

        output = "";
        for(int i = 0; i < transformed_data.size(); i++)
        {
            output += transformed_data.get( i );
            output += "\n";
        }
        //System.out.println( transformed_data );
    }

    Complex_number
    formula( int index )
    {
        double real_result = 0;
        double imaginary_result = 0;
        double angle;
        int size = input_data.size();
        for( int i = 0; i < size; i++ )
        {
            angle =  ((2*Math.PI) / size) * index * i   ;
            real_result += input_data.get(i) * Math.cos( angle );
            imaginary_result -= input_data.get(i) * Math.sin( angle );
        }
        return new Complex_number(  real_result  , imaginary_result );
    }

    @Override
    void hook_execution_time() {
        if( print_execution_time )
        {   //convert nanosecond to milisecond
            duration = duration / 1000000;
            System.out.println( "Time of execution: " + duration + " milliseconds" );
        }
    }

    void
    set_print_exec_time( boolean value )
    {
        print_execution_time = value;
    }
}
