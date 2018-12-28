/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Amanda
 */
public class Window {
    
    private int width;
    private int height;
    
    private JFrame screen;
    private Canvas canvas;
    
    public Window (String title, int width){
        
        screen = new JFrame(title);
        
        this.width = width;
        this.height = width/16*9;
        
        init();
    }
    
    private void init (){
        
        screen.setSize(new Dimension(width, height));
        screen.setResizable(false);
        screen.setLocationRelativeTo(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        
        canvas = new Canvas();
        
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        
        screen.add(canvas);
        screen.pack();
        
    }
    
    
    public Canvas getCanvas(){
        return canvas;
    }
    
    public int getWidth (){
        return width;
    }
    
    public int getHeight (){
        return height;
    }
}
