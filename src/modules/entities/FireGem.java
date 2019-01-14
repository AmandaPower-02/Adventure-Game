/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;

/**
 * Creates a FireGem as a subclass of Gem to use in a game of Fireboy and
 * Watergirl. Only Fireboys can collect FireGems as they progress through each
 * Level.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class FireGem extends Gem {

    /**
     * Initializes a FireGem as a Gem to use in a game of Fireboy and Watergirl
     * using its x and y position on the screen.
     *
     * @param x an integer representing the x position of the FireGem
     * @param y an integer representing the y position of the FireGem
     */
    public FireGem(int x, int y) {
        super(x, y, new SpriteSheet("FireGem.png", 1));
    }
}
