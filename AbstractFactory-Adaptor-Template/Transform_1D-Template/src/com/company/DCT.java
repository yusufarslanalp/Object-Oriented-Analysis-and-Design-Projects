package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class DCT extends Transform_1D {
    protected ArrayList<Double> transformed_data = new ArrayList<Double>();

    public DCT(String input_path, String output_path) {
        super(input_path, output_path);
    }

    @Override
    void transform() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        for(int i = 0; i < input_data.size(); i++)
        {
            transformed_data.add( formula( i ) );

        }

        output = "";
        for(int i = 0; i < transformed_data.size(); i++)
        {
            output += df.format( transformed_data.get( i ) );
            output += "\n";
        }
        //System.out.println( transformed_data );
    }

    double
    formula( int index )
    {
        double result = 0;
        double angle;
        int size = input_data.size();
        for( int i = 0; i < size; i++ )
        {
            angle = (Math.PI / size) * (i + 0.5) * index;
            result += input_data.get(i) * Math.cos( angle );
        }
        return result;
    }
}
