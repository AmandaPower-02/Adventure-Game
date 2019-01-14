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
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class SpriteSheet {

    private BufferedImage image;
    private BufferedImage[] images;
    private int width;

    /**
     * Initializes a SpriteSheet using an image and how many rows there are.
     *
     * @param file a String representing the name of the image file
     * @param row the number of rows in the image
     */
    public SpriteSheet(String file, int row) {
        this.image = ImageLoader.image(file);
        splitSheet(row);
    }

    /**
     * Divides up SpriteSheet to find location of the individual images.
     *
     * @param row an integer representing the number of rows there are
     */
    public void splitSheet(int row) {
        this.images = new BufferedImage[row * row];
        this.width = this.image.getHeight() / row;

        for (int i = 0; i < row * row; i++) {
            int roww = i / row;
            int column = i % row;
            int y = roww * this.width;
            int x = column * this.width;
            this.images[i] = this.image.getSubimage(x, y, this.width, this.width);
        }
    }

    /**
     * Returns the image.
     *
     * @param x an integer representing the x position of the image
     * @return a BufferedImage
     */
    public BufferedImage getImage(int x) {
        if (x < this.images.length) {
            return this.images[x];
        }
        return this.images[0];
    }

    /**
     * Returns the width of the SpriteSheet.
     * 
     * @return an integer representing the width of the SpriteSheet
     */
    public int getWidth() {
        return this.width;
    }
}
