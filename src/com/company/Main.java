package com.company;


import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        System.out.println("Salam");
        ClockDisplay clockDisplay = new ClockDisplay();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                clockDisplay.timeTick();
                System.out.println(clockDisplay.getTime());
            }
        }, 0, 1000);
    }
}
