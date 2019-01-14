/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;

/**
 * Creates a Button as a subclass of Obstacle to use in a game of Fireboy and
 * Watergirl. Buttons control the movement of MovingPlatforms. Characters
 * interact with Buttons to complete each Level. When a Character comes into
 * contact with a Button, the Button will be pushed down and a MovingPlatform
 * will move.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Button extends Obstacle {

    private final MovingPlatform movingPlatform;

    /**
     * Initializes a MovingPlatform as a subclass of Obstacle using its x and y
     * position, its width and height, and the MovingPlatform that it will
     * control.
     *
     * @param x an integer representing the x position of the Button
     * @param y an integer representing the y position of the Button
     * @param movingPlatform an Entity representing a MovingPlatform that the
     * Button controls
     */
    public Button(int x, int y, MovingPlatform movingPlatform) {
        super(x, y, 20, 10, new SpriteSheet("Button.png", 1));
        this.movingPlatform = movingPlatform;
    }

    /**
     * Returns the MovingPlatform that the Button controls.
     *
     * @return an Entity representing a MovingPlatform that the Button controls
     */
    public MovingPlatform getPlatform() {
        return this.movingPlatform;
    }
}
