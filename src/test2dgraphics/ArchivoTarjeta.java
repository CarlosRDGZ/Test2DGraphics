/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2dgraphics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CarlosFco
 */
public class ArchivoTarjeta {
    private RandomAccessFile file;
    public ArchivoTarjeta() {
        try {
            file = new RandomAccessFile("Tarjeta.dmc", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void write(String string) {
        try {
            file.writeBytes(string);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public String read() {
        try
        {
            file.seek(0);
            
            byte[] bString = new byte[166];
            file.read(bString);
            String str = new String(bString);
            return str;
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
