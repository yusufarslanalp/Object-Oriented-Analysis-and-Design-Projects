package com.company;

public class CoreSize implements CPU_RamProperty {
    int core_size;


    public CoreSize(int core_size) {
        this.core_size = core_size;
    }

    @Override
    public String toString() {
        String result = "";
        result += Integer.toString( core_size ) + "cores ";
        return result;
    }
}
