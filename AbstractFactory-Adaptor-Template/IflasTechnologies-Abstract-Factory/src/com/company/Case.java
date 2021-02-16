package com.company;

import java.util.ArrayList;

public class Case {
    ArrayList<CaseProperty>  properties = new ArrayList<CaseProperty>();

    void
    add_property( CaseProperty property )
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
