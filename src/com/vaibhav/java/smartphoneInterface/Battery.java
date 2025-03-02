package com.vaibhav.java.smartphoneInterface;

public interface Battery {
    int batteryCapacity = 4200;

    public default int getBatteryCapacity(){
        return batteryCapacity;
    }
    void setBatteryPercentage(int batteryPercentage);
    int getBatteryPercentage();
    boolean getChargingStatus();
    void setChargingStatus(boolean chargingStatus);
}
