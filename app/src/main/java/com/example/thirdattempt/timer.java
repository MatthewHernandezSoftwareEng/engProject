package com.example.thirdattempt;



import android.widget.EditText;

import java.util.Timer;
import  java.util.TimerTask;

public class timer extends MainActivity{
    protected int count = 0;
    private int min = 0;
    private int seconds = 61;
    protected EditText clock_display;
    private final Timer time = new Timer();
    private String what_is_on_clock;
    private boolean firstRun = true;
    protected TimerTask clock = new TimerTask() {

        @Override
        public void run() {

            runOnUiThread(() -> {
                if (firstRun) {
                    what_is_on_clock = "Start time is " + min + " minutes.";
                    clock_display.setText(what_is_on_clock);
                    firstRun = false;
                }
                if ((seconds == 61 || seconds == 1) && min != 0) {
                    seconds = 61;
                    min -= 1;
                }
                count -= 1;
                seconds -= 1;
                // System.out.println(count);
                what_is_on_clock = "Time remaining is " + min + " minutes and " + seconds + " seconds.";
                clock_display.setText(what_is_on_clock);
                if (count == 0 ) {
                    what_is_on_clock = "Time remaining is " + min + " minutes and " + 0 + " seconds.";
                    clock_display.setText(what_is_on_clock);
                    clock.cancel();
                }

            });
        }
    };
    public  void runTimer(){
        min = count;
        count = count * 60;

        time.schedule(clock, 0 , 1000);
    }
}

