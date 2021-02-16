package com.company;

import java.util.ArrayList;

public class Storage {
    ArrayList<StorageProperty> properties = new ArrayList<StorageProperty>();

    void
    add_property( StorageProperty property )
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
