
package com.springservice.clientone.utils;

public class utils {
    public static void addDelay(int secondsToSleep) {
        try {
            Thread.sleep(secondsToSleep * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }    
    }
}
