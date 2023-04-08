package com.puzzle.component;

// TIME'S CLASS
import java.util.concurrent.TimeUnit;

// NUMBER'S CLASS
import java.text.DecimalFormat;


/**
* @author Maria Luísa França
* @version 1.0
* @since 4.0
*/

public class Stopwatch {
    private long startTime;
    private DecimalFormat formatter;

    protected void start() {
    	/*
    	* @since 1.0 
    	*/
    	
    	// Define marco temporal do início da contagem
        this.startTime = System.currentTimeMillis();
        // Instancia formatador de números para 2 dígitos
        this.formatter = new DecimalFormat("00");
    }

    protected String stop() {
    	/*
    	* @since 1.0 
    	* @return diferença temporal entre o momento do chamado e o início da contagem
    	*/
    	
        long elapsedTime = System.currentTimeMillis() - startTime;
        
        long days = TimeUnit.MILLISECONDS.toDays(elapsedTime);
    	elapsedTime -= TimeUnit.DAYS.toMillis(days);
        
        long hours = TimeUnit.MILLISECONDS.toHours(elapsedTime);
        elapsedTime -= TimeUnit.HOURS.toMillis(hours);
        
        long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        elapsedTime -= TimeUnit.MINUTES.toMillis(minutes);
        
        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
		
        return String.format("%d dias, %s:%s:%s", days, formatter.format(hours), formatter.format(minutes), formatter.format(seconds));
    }
}
