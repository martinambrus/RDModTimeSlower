package com.timeslower;

import com.github.martinambrus.rdapi.game.Game;
import com.github.martinambrus.rdapi.keyboard.KeyboardListener;
import com.github.martinambrus.rdapi.timer.TimerInterface;
import org.lwjgl.input.Keyboard;

import static com.github.martinambrus.rdapi.timer.TimerHelper.runTaskDelayed;

public class RDModTimeSlower implements KeyboardListener {

    private String version = "1.0";
    private Game gameInstance;
    private TimerInterface timer;
    private float tpsIncrementRate = 10F;
    private float fpsSlowDownPercentage = 20F;
    private float oldTimerValue = 0F;
    private long slowDownPauseMS = 2500;

    public RDModTimeSlower(Game gameInstance ) {
        System.out.println( "PluginTimerSlower v" + this.version + " running" );
        this.gameInstance = gameInstance;
        this.timer = gameInstance.getTimerInstance();
        this.oldTimerValue = this.timer.getTicksPerSecond();
        this.gameInstance.addKeyboardListener( this );
    }

    @Override
    public void onKeyPressed(int key) {
        /*if ( key == Keyboard.KEY_U ) {
           System.out.println( "Ticks changed from " + this.timer.getTicksPerSecond() + " to " + ( this.timer.getTicksPerSecond() - this.tpsIncrementRate ) );
           this.timer.setTicksPerSecond( this.timer.getTicksPerSecond() - this.tpsIncrementRate );
        }

        if ( key == Keyboard.KEY_I ) {
           System.out.println( "Ticks changed from " + this.timer.getTicksPerSecond() + " to " + ( this.timer.getTicksPerSecond() + this.tpsIncrementRate ) );
           this.timer.setTicksPerSecond( this.timer.getTicksPerSecond() + this.tpsIncrementRate );
        }*/

        if ( key == Keyboard.KEY_T ) {
            System.out.println( "Time seems to slow down for a bit..." );
            this.oldTimerValue = this.timer.getTicksPerSecond();
            float newTPS = ( this.timer.getTicksPerSecond() / 100 ) * this.fpsSlowDownPercentage;
            this.timer.setTicksPerSecond( newTPS );
            runTaskDelayed(new Runnable() {
                @Override
                public void run() {
                    RDModTimeSlower.this.timer.setTicksPerSecond( RDModTimeSlower.this.oldTimerValue );
                }
            }, slowDownPauseMS );
        }
    }
}
