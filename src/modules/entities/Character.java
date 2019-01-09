/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a Character as a subclass of Entity to be used in a game of Fireboy
 * and Watergirl. A Character can either be a Fireboy or a Watergirl. Characters
 * can move throughout each level to attempt to successfully complete it.
 * Characters can also collect their corresponding Gems as they progress through
 * each Level.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Character extends Entity {

    private int gemsCollected;
    private boolean isDead;

    /**
     * Initializes a Character to use in a game of Fireboy and Watergirl using
     * its x and y position on the screen.
     *
     * @param x an integer representing its x position on the screen
     * @param y an integer representing its y position on the screen
     */
    public Character(int x, int y) {
        super(x, y, 30, 40);
        this.gemsCollected = 0;
        this.isDead = false;
    }
}
