package com.company;

public class GlobalComponentFactory implements SmartphoneComponentFactory {
    @Override
    public DisplayProperty create_display_property() {
        return new DisplayColorVariety( 24 );
    }

    @Override
    public BatteryProperty create_battery_property() {
        return new BatteryChemical( "Lithium-Cobalt" );
    }

    @Override
    public CPU_RamProperty create_cpu_ram_property() {
        return new CoreSize( 2 );
    }

    @Override
    public StorageProperty create_storage_property() {

        return new StorageMax( 32 );
    }

    @Override
    public CameraProperty create_camera_property() {

        return new CameraZoom( 2 );
    }

    @Override
    public CaseProperty create_case_property() {

        return new CaseWPDegree( 0.5 );
    }
}
