/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.renderer;

import core.kernal.ImageLoader;
import java.awt.image.BufferedImage;

/**
 *
 * @author Amanda
 */
public class SpriteSheet {
    
    private BufferedImage image;
    private BufferedImage[] images;
    private int width;
    
    public SpriteSheet(String file, int row){
        
        image = ImageLoader.image(file);
        splitSheet(row);
    }
    
    public void splitSheet(int row){
        
        images = new BufferedImage[row*row];
         width = image.getHeight()/row;
        
        for (int i = 0; i < row*row; i++) {
            int roww = i/row;
            int column = i%row;
            int y = roww*width;
            int x = column*width;
            images [i] = image.getSubimage(x, y, width, width);
        }
        
    }
    
    public BufferedImage getImage (int x){
        
        if(x<images.length){
            return images [x];
        }
        return images [0];
    }
    
    public int getWidth (){
        return width;
    }
    
}
