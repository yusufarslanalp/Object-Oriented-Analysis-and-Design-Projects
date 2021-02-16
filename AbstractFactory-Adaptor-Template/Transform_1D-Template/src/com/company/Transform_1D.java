package com.company;

import java.io.*;

import java.util.ArrayList;



public abstract class Transform_1D {

    protected ArrayList<Double> input_data = new ArrayList<Double>();
    protected String output;
    protected String input_path;
    protected String output_path;

    public Transform_1D(String input_path, String output_path) {
        this.input_path = input_path;
        this.output_path = output_path;
    }

    final void do_transformation()
    {
        read_numbers();
        transform();
        write_numbers( );
        hook_execution_time();
    }

    abstract void transform();

    void read_numbers()
    {
        try{
            File file = new File( input_path );
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null)
            {
                //System.out.println(line);
                String[] parsed = line.split("[ \t]+");

                for(int i = 0; i < parsed.length; i++) {
                    input_data.add(Double.parseDouble(parsed[i]));
                }
            }
            //System.out.println( input_data );
        } catch (IOException e) {
            System.out.println( "You should change path in main function to test program" );
            //e.printStackTrace();
        }
    }

    void write_numbers(  )
    {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter( output_path ));

            writer.write( output );
            //writer.write( "dasdad" );

            writer.close();

        } catch (IOException e) {
            System.out.println( "You should change path in main function to test program" );
            //e.printStackTrace();
        }
    }

    void hook_execution_time()
    {
    }
}
