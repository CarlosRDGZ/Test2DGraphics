/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2dgraphics;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author CarlosFco
 */
public class Test2DGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName());
        }*/
        
        pruebaLocalTime();
        
    }
    
    public static void pruebaLocalTime() {
        LocalDateTime now = LocalDateTime.now();
        
        int hour = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();
        
        LocalDateTime n = now.minusMinutes(11);
        LocalDateTime no = now.plusDays(1);
        System.out.println(no.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(hour + ":" + min + ":" + sec);
        System.out.println(n.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }
}