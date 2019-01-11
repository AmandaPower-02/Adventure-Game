/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Allows for the loading of images. Will be used to load images for game
 * entities.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class ImageLoader {

    /**
     * Loads in the images to be used in the game.
     *
     * @param file a String representing the name of the image's file
     * @return null
     */
    public static BufferedImage image(String file) {
        try {
            return ImageIO.read(ImageLoader.class.getResource("/textures/" + file));
        } catch (IOException ex) {
            System.exit(1);
        }
        return null;
    }
}
