package com.company;

public class TurkeyComponentFactory implements SmartphoneComponentFactory {

    @Override
    public DisplayProperty create_display_property() {
        return new DisplayColorVariety( 32 );
    }

    @Override
    public BatteryProperty create_battery_property() {
        return new BatteryChemical( "Lithium-Boron" );
    }

    @Override
    public CPU_RamProperty create_cpu_ram_property() {
        return new CoreSize( 8 );
    }

    @Override
    public StorageProperty create_storage_property() {

        return new StorageMax( 128 );
    }

    @Override
    public CameraProperty create_camera_property() {

        return new CameraZoom( 4 );
    }

    @Override
    public CaseProperty create_case_property() {

        return new CaseWPDegree( 2.0 );
    }


}
