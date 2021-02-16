package com.company;

import java.util.ArrayList;
import java.io.*;



public class Main {

    public static void main(String[] args)   {

        String dft_input_path = "C:\\Users\\yusuf\\Desktop\\Transform_1D\\src\\com\\company\\input_dft.txt";
        String dft_output_path = "C:\\Users\\yusuf\\Desktop\\Transform_1D\\src\\com\\company\\output_dft.txt";

        //you can chance above paths with yours to test DFT class
        DFT fourier_transform = new DFT( dft_input_path, dft_output_path );
        fourier_transform.set_print_exec_time( true );
        fourier_transform.do_transformation();

        //you can chance above paths with yours to test DCT class
        String dct_input_path = "C:\\Users\\yusuf\\Desktop\\Transform_1D\\src\\com\\company\\input_dct.txt";
        String dct_output_path = "C:\\Users\\yusuf\\Desktop\\Transform_1D\\src\\com\\company\\output_dct.txt";

        DCT cosine_transform = new DCT( dct_input_path, dct_output_path );
        cosine_transform.do_transformation();




    }
}
