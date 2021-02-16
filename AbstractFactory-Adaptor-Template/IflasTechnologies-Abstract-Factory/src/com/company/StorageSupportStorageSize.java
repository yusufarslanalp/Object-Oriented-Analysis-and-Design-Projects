package com.company;

public class StorageSupportStorageSize implements StorageProperty {
    boolean micro_sd_support;
    int storage_size;


    public StorageSupportStorageSize(boolean micro_sd_support, int storage_size) {
        this.micro_sd_support = micro_sd_support;
        this.storage_size = storage_size;
    }

    @Override
    public String toString() {
        String result = "";
        if(micro_sd_support) result += "MicroSD Support ";
        else result += "NO MicroSD Support ";
        result += Integer.toString(storage_size) + "GB ";
        return result;
    }
}
