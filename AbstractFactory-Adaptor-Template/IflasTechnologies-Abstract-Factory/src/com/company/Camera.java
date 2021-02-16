package com.company;

import java.util.ArrayList;

public class Camera {
    ArrayList<CameraProperty> properties = new ArrayList<CameraProperty>();

    void
    add_property( CameraProperty property )
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
