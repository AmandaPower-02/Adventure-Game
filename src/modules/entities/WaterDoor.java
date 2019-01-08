/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a WaterDoor to use in a game of Fireboy and Watergirl. WaterDoor
 * allows the Watergirl to pass the level. When a Watergirl stands in front of a
 * WaterDoor, the WaterDoor will open to allow the Watergirl to go through.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class WaterDoor extends Door {

    /**
     * Initializes a WaterDoor using its x and y position on the screen.
     *
     * @param x an integer representing the WaterDoor's x position on the screen
     * @param y an integer representing the WaterDoor's y position on the screen
     */
    public WaterDoor(int x, int y) {
        super(x, y);
    }
}
