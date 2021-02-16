package com.company;

public class ProxyDataBaseTable implements ITable {
    DataBaseTable real_table;

    ProxyDataBaseTable( DataBaseTable real_table ){
        this.real_table = real_table;

    }

    @Override
    public Object getElementAt(int row, int column) {
        int result;
        synchronized (this){
            result = (Integer) real_table.getElementAt( row, column );
            return result;
        }

    }

    @Override
    public void setElementAt(int row, int column, Object o) {
        synchronized (this){
            real_table.setElementAt( row, column, o );
        }
    }

    @Override
    public int getNumberOfRows() {
        return 0;
    }

    @Override
    public int getNumberOfColumns() {
        return 0;
    }

    @Override
    public void increment_center() {
        synchronized (this){
            int val = (Integer)getElementAt( 1, 1 );
            val++;
            setElementAt( 1, 1, val );
        }
    }

    @Override
    public String toString() {
        String result = "";

        result += String.format("% 6d", real_table.table[0][0]);
        result += " " + String.format("% 6d", real_table.table[0][1]);
        result += " " + String.format("% 6d", real_table.table[0][2]) + "\n";


        result += String.format("% 6d", real_table.table[1][0]);
        result += " " + String.format("% 6d", real_table.table[1][1]);
        result += " " + String.format("% 6d", real_table.table[1][2]) + "\n";

        result += String.format("% 6d", real_table.table[2][0]);
        result += " " + String.format("% 6d", real_table.table[2][1]);
        result += " " + String.format("% 6d", real_table.table[2][2]) + "\n";

        return result;
    }

}
