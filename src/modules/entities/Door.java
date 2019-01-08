/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a new Door to use in the Fireboy and Watergirl game. Doors allow the
 * Fireboy and Watergirl to finish the game.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Door extends Entity {

    /**
     * Initialize a new Door using its x and y position on the screen.
     *
     * @param x an integer representing the Door's x position
     * @param y an integer representing the Door's y position
     */
    public Door(int x, int y) {
        super(x, y, 40, 50);
    }

    // movement of the Door
}
