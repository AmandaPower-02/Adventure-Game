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
        super(x, y, 30, 40);
        this.gemsCollected = 0;
        this.isDead = false;
        this.onGround = true;
        this.speedY = 0;
        this.speedX = 5;//tweak
        this.isJumping = false;
    }

    public void setOnGround(boolean b) {
        this.onGround = b;
    }

    public boolean isOnGround() {
        return this.onGround;
    }

    public int getYSpeed() {
        return this.speedY;
    }

    public void setYSpeed(int newSpeed) {
        this.speedY = newSpeed;
    }
    
     public int getXSpeed() {
        return this.speedX;
    }

    public void setXSpeed(int newSpeed) {
        this.speedX = newSpeed;
    }
    
      public boolean getIsJumping() {
        return this.isJumping;
    }

    public void setJumping(boolean b) {
        this.isJumping = b;
    }
}
