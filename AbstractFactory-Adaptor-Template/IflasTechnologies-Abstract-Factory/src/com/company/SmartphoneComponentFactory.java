package com.company;

public interface SmartphoneComponentFactory {
    DisplayProperty create_display_property();
    BatteryProperty create_battery_property();
    CPU_RamProperty create_cpu_ram_property();
    StorageProperty create_storage_property();
    CameraProperty create_camera_property();
    CaseProperty create_case_property();


}
