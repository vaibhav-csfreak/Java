package com.vaibhav.java.smartphoneInterface;

public class Smartphone implements Battery, Camera, Processor{
    @Override
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    @Override
    public boolean getChargingStatus() {
        return this.chargingStatus;
    }

    @Override
    public void setChargingStatus(boolean chargingStatus) {
        this.chargingStatus=chargingStatus;
    }

    @Override
    public String getProcessor() {
        return this.processor;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    int batteryPercentage;
    boolean chargingStatus;
    String processor;

    public static void main(String[] args){
        Smartphone oppo = new Smartphone();
        Smartphone samsung = new Smartphone();
        oppo.setBatteryPercentage(90);
        oppo.setChargingStatus(true);
        oppo.setProcessor("octa");
        samsung.setBatteryPercentage(80);
        samsung.setChargingStatus(false);
        samsung.setProcessor("quad");
        System.out.println(oppo.getBatteryPercentage());
        System.out.println(oppo.getChargingStatus());
        System.out.println(oppo.getProcessor());
        System.out.println(samsung.getBatteryPercentage());
        System.out.println(samsung.getChargingStatus());
        System.out.println(samsung.getProcessor());
    }
}