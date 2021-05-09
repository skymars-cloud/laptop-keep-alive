package com.smc.keepalive;
import java.awt.*;
import java.util.*;
public class KeepAlive {

    public static void jiggle( ) throws Exception {
        Robot hal = new Robot();
        Random random = new Random();
        while (true) {
            hal.delay(1000 * 30);
            Point point = MouseInfo.getPointerInfo().getLocation();

            hal.mouseMove(point.x + 1, point.y + 1);
            hal.mouseMove(point.x , point.y);

            point = MouseInfo.getPointerInfo().getLocation();
            System.out.println(point.toString() + "x>>" + point.x + "  y>>" + point.y);
        }
    }

    public static void main(String[] args) throws Exception{
        jiggle( );
    }

    public static void jiggleLegacy( ) throws Exception{
        Robot hal = new Robot();
        Random random = new Random();
        while(true){
            hal.delay(1000 * 60);
            int x = random.nextInt() % 640;
            int y = random.nextInt() % 480;
            // Toolkit.getDefaultToolkit().getScreenSize() to obtain
            // the screen size and use screen.width and screen.height instead of 640 and 480
            hal.mouseMove(x,y);
        }
    }

}
