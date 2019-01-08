/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Character extends Entity {

    private int gemsCollected;
    private boolean isDead;

    /**
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
