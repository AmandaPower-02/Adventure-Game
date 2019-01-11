/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;

/**
 * Creates a new Gem as a subclass of Entity to use in a game of Fireboy and
 * Watergirl. Characters can collect their corresponding Gems as they progress
 * through each level.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Gem extends Entity {

    /**
     * Initializes a new Gem to use in a game of Fireboy and Watergirl using its
     * x and y position.
     *
     * @param x an integer representing the x position of the Gem
     * @param y an integer representing the y position of the Gem
     * @param photo a SpriteSheet representing the appearance of the Gem
     */
    public Gem(int x, int y, SpriteSheet photo) {
        super(x, y, 20, 20, photo);
    }
}
