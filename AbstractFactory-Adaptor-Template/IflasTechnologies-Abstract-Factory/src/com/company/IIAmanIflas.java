package com.company;

public class IIAmanIflas extends Smartphone {
    SmartphoneComponentFactory componentFactory;

    IIAmanIflas( SmartphoneComponentFactory componentFactory ) {
        this.componentFactory = componentFactory;
        prepare();
    }

    @Override
    void prepare() {
        DisplayProperty display_market_p; //display market property
        DisplayProperty display_model_p; //display model property
        display_market_p = componentFactory.create_display_property( );
        display_model_p = new DisplaySize( 4.5 );
        display.add_property( display_model_p );
        display.add_property( display_market_p );

        BatteryProperty battery_market_p;
        BatteryProperty battery_model_p;
        battery_market_p = componentFactory.create_battery_property();
        battery_model_p = new BatteryStandartProperty( 16, 2000 );
        battery.add_property( battery_model_p );
        battery.add_property( battery_market_p );

        CPU_RamProperty cpu_ram_market_prop;
        CPU_RamProperty cpu_ram_model_prop;
        cpu_ram_market_prop = componentFactory.create_cpu_ram_property();
        cpu_ram_model_prop = new FrecuencySize( 2.2, 4 );
        cpu_ram.add_property( cpu_ram_model_prop );
        cpu_ram.add_property( cpu_ram_market_prop );

        StorageProperty storage_model_prop;
        StorageProperty storage_market_prop;
        storage_model_prop = new StorageSupportStorageSize( true, 16 );
        storage_market_prop = componentFactory.create_storage_property();
        storage.add_property( storage_model_prop );
        storage.add_property( storage_market_prop );

        CameraProperty camera_model_prop;
        CameraProperty camera_market_prop;
        camera_model_prop = new CameraDual( 8, 5 );
        camera_market_prop = componentFactory.create_camera_property();
        camera.add_property( camera_model_prop );
        camera.add_property( camera_market_prop );

        CaseProperty case_model_prop;
        CaseProperty case_market_prop;
        case_model_prop = new CaseStandartProperties( 143, 69, 7.3,
                false, true, "plastic" );
        case_market_prop = componentFactory.create_case_property();
        phone_case.add_property( case_model_prop );
        phone_case.add_property( case_market_prop );



    }


}
