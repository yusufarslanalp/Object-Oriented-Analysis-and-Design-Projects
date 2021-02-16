package com.company;

public class CameraDual implements CameraProperty {
    int front;
    int rear;

    public CameraDual(int front, int rear) {
        this.front = front;
        this.rear = rear;
    }

    @Override
    public String toString() {
        String result = "";
        result += Integer.toString( front ) + "Mp front ";
        result += Integer.toString( rear ) + "Mp rear";
        return result;
    }
}
