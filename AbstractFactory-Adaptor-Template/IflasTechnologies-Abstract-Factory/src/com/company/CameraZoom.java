package com.company;

public class CameraZoom implements CameraProperty {
    int zoom;


    public CameraZoom(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "x" + Integer.toString(zoom) + " Optic zoom";
    }
}
