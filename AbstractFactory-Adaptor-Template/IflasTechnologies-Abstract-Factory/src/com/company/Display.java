package com.company;

import java.util.ArrayList;

public class Display {
    ArrayList<DisplayProperty> properties = new ArrayList<DisplayProperty>();;

    void
    add_property( DisplayProperty property )
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
