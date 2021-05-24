package com.smc.keepalive;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;
public class KeepAlive {

    public static void operate(Robot robot) throws Exception {
        System.out.println("i am moving the mouse and clicking capslock 2 times");
        Point point = MouseInfo.getPointerInfo().getLocation();

        robot.mouseMove(point.x + 1, point.y + 1);
        robot.mouseMove(point.x , point.y);

        point = MouseInfo.getPointerInfo().getLocation();

        System.out.println(point.toString() + "x>>" + point.x + "  y>>" + point.y);
    }

    public static void jiggle() throws Exception {
        Robot robot = new Robot();
        while (true) {
            operate( robot);
            robot.delay(1000 * 30);
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
