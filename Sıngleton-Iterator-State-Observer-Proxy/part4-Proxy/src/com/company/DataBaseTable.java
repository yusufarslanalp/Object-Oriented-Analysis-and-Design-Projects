package com.company;

import javax.xml.crypto.Data;

public class DataBaseTable implements ITable {
    int[][] table;

    DataBaseTable(  ){
        table = new int[][]{    {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                            };
    }


    @Override
    public Object getElementAt(int row, int column) {
       return table[row][column];
    }

    @Override
    public void setElementAt(int row, int column, Object o) {
        table[row][column] = ((Integer)o).intValue();
    }

    @Override
    public int getNumberOfRows() {
        return table.length;
    }

    @Override
    public int getNumberOfColumns() {
        return table[0].length;
    }

    @Override
    public void increment_center() {
        int val = (Integer)getElementAt( 1, 1 );
        val++;
        setElementAt( 1, 1, val );
    }

    @Override
    public String toString() {
        String result = "";

        result += String.format("% 6d", table[0][0]);
        result += " " + String.format("% 6d", table[0][1]);
        result += " " + String.format("% 6d", table[0][2]) + "\n";


        result += String.format("% 6d", table[1][0]);
        result += " " + String.format("% 6d", table[1][1]);
        result += " " + String.format("% 6d", table[1][2]) + "\n";

        result += String.format("% 6d", table[2][0]);
        result += " " + String.format("% 6d", table[2][1]);
        result += " " + String.format("% 6d", table[2][2]) + "\n";

        return result;
    }
}
