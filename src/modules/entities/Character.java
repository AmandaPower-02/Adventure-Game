/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import modules.components.Jumping;
import modules.components.Movement;

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

    private int gemsCollected, speedY, speedX;
    private boolean isDead, onGround, isJumping;

    /**
     * Initializes a Character to use in a game of Fireboy and Watergirl using
     * its x and y position on the screen.
     *
     * @param x an integer representing the x position of the Character on the
     * screen
     * @param y an integer representing the y position of the Character on the
     * screen
     */
    public Character(int x, int y) {
        super(x, y, 30, 40, new Movement(), new Jumping());
        this.gemsCollected = 0;
        this.isDead = false;
        this.onGround = true;
        this.speedY = 0;
        this.speedX = 5;//tweak
        this.isJumping = false;
    }

    /**
     * Sets the Character to be on the ground.
     *
     * @param b a boolean representing where the Character should be
     */
    public void setOnGround(boolean b) {
        this.onGround = b;
    }

    /**
     * Returns whether if the Character is on the ground or not.
     *
     * @return a boolean representing if the Character is on the ground or not
     */
    public boolean isOnGround() {
        return this.onGround;
    }

    /**
     * Return the y speed of the Character.
     *
     * @return an integer representing the y speed of the Character
     */
    public int getYSpeed() {
        return this.speedY;
    }

    /**
     * Sets the y speed of the Character.
     *
     * @param newSpeed an integer representing the y speed that the Character
     * will be set to
     */
    public void setYSpeed(int newSpeed) {
        this.speedY = newSpeed;
    }

    /**
     * Returns the x speed of the Character.
     *
     * @return an integer representing the x speed of the Character
     */
    public int getXSpeed() {
        return this.speedX;
    }

    /**
     * Sets the x speed of the Character.
     *
     * @param newSpeed an integer representing the x speed that the Character
     * will be set to
     */
    public void setXSpeed(int newSpeed) {
        this.speedX = newSpeed;
    }

    /**
     * Returns whether if the Character is jumping or not.
     *
     * @return a boolean representing whether if the Character is jumping or not
     */
    public boolean isJumping() {
        return this.isJumping;
    }

    /**
     * Sets the Character to be jumping if it's on the ground.
     *
     * @param b a boolean representing if the Character needs to be set to be
     * jumping or not
     */
    public void setJumping(boolean b) {
        this.isJumping = b;
    }
}
