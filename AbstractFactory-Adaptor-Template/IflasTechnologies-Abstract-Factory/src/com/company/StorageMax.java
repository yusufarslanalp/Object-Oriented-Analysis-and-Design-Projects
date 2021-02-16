package com.company;

public class StorageMax implements StorageProperty {
    int max_storage;


    public StorageMax(int max_storage) {
        this.max_storage = max_storage;
    }

    @Override
    public String toString() {
        return "Max " + Integer.toString( max_storage ) + "GB";
    }
}
