package com.company;

import java.util.ArrayList;

public class Battery {
    ArrayList<BatteryProperty> properties = new ArrayList<BatteryProperty>();


    void
    add_property( BatteryProperty property )
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
