/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a WaterGem as a subclass of Gem to use in a game of Fireboy and
 * Watergirl. Only Watergirls can collect WaterGems as they progress through
 * each Level.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class WaterGem extends Gem {

    /**
     * Initializes a FireGem as a Gem to use in a game of Fireboy and Watergirl
     * using its x and y position on the screen.
     *
     * @param x an integer representing the x position of the WaterGem
     * @param y an integer representing the y position of the WaterGem
     */
    public WaterGem(int x, int y) {
        super(x, y);
    }
}
