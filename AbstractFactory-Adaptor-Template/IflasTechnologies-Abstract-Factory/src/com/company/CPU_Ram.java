package com.company;

import java.util.ArrayList;

public class CPU_Ram {
    ArrayList<CPU_RamProperty> properties = new ArrayList<CPU_RamProperty>();

    void
    add_property( CPU_RamProperty property )
    {
        properties.add( property );
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < properties.size(); i++)
        {
            result += properties.get(i).toString() + " ";
        }
        return result;
    }
}
