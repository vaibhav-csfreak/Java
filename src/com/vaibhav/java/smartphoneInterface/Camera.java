package com.vaibhav.java.smartphoneInterface;

public interface Camera {
    int mp = 12;
    int cameraCount = 2;
    public default void clickPicture(){
        System.out.println("Picture Clicked");
    }
}
