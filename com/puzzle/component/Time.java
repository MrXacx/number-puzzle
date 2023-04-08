package com.puzzle.component;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

import com.puzzle.component.Stopwatch;

/**
* @author Ariel Santos
* @version 2.0
* @since 3.0
*/

public class Time extends Stopwatch{
    private int days = 0, hours = 0, minutes = 0, seconds = 0;
    
    public void start(JLabel counter){
    	super.start();
        (new Timer()).scheduleAtFixedRate(
            new TimerTask() {
                public void run() {
                    counter.setText(stop()); // atualiza texto da label
                }
            },
            0, 1000
        ); // executa run() a cada 1s
    }
}

