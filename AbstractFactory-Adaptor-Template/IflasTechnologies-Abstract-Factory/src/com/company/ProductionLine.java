package com.company;

public abstract class ProductionLine {
    Smartphone order_phone( String model )
    {
        Smartphone phone = create_smartphone( model );

        phone.attach_cpu_ram();
        phone.attach_display();
        phone.attach_battery();
        phone.attach_storage();
        phone.attach_camera();
        phone.close_phone_case();

        return phone;
    }

    abstract Smartphone create_smartphone( String model );
}



