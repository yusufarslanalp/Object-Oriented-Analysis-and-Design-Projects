package com.company;

public abstract class Smartphone {

    Display display = new Display();
    Battery battery = new Battery();
    CPU_Ram cpu_ram = new CPU_Ram();
    Storage storage = new Storage();
    Camera camera = new Camera();
    Case phone_case = new Case();


    void
    attach_cpu_ram(){
        System.out.println( "CPU and RAM attached to the board." );
        System.out.println( "Attached CPU&RAM: " + cpu_ram.toString() + "\n" );
    }

    void
    attach_display(){
        System.out.println( "Display attached." );
        System.out.println( "Attached display: " + display.toString() + "\n" );
    }

    void
    attach_battery(){
        System.out.println( "Battery attached." );
        System.out.println( "Attached battery: " + battery.toString() + "\n" );
    }

    void
    attach_storage(){
        System.out.println( "Storage attached: " );
        System.out.println( "Attached storage: " + storage.toString() + "\n" );
    }

    void
    attach_camera(){
        System.out.println( "Camera attached" );
        System.out.println( "Attached camera: " + camera.toString() + "\n" );
    }

    void
    close_phone_case(){
        System.out.println( "Case closed:" );
        System.out.println( "Closed case: " + phone_case.toString() );
    }

    abstract void prepare();

    @Override
    public String toString() {
        String result = "";

        result += "Display: " + display.toString() + "\n";
        result += "Battery: " + battery.toString() + "\n";

        result += "CPU&Ram: : " + cpu_ram.toString() + "\n";

        result += "Storage: " + storage.toString() + "\n";

        result += "Camera: " + camera.toString() + "\n";

        result += "Case: " + phone_case.toString() + "\n";

        return result;
    }
}
