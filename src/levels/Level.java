/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levels;

import core.kernal.Window;
import core.renderer.RendererEngine;
import java.util.ArrayList;
import java.util.Arrays;
import modules.entities.Button;
import modules.entities.Entity;
import modules.entities.Fire;
import modules.entities.FireDoor;
import modules.entities.FireGem;
import modules.entities.Fireboy;
import modules.entities.MovingPlatform;
import modules.entities.Mud;
import modules.entities.Platform;
import modules.entities.Water;
import modules.entities.WaterDoor;
import modules.entities.WaterGem;
import modules.entities.Watergirl;

/**
 * Creates new Levels for Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Level {

    Fireboy fireboy;
    Watergirl watergirl;
    Platform[] platforms;
    MovingPlatform[] movingPlatforms;
    Fire[] fire;
    Water[] water;
    Mud[] mud;
    Button[] buttons;
    FireGem[] fireGems;
    WaterGem[] waterGems;
    FireDoor fireDoor;
    WaterDoor waterDoor;
    private boolean levelComplete;
    private final RendererEngine rendererEngine;
    private ArrayList<Entity> entities;

    /**
     * Initializes a Level of a game of Fireboy and Watergirl using various
     * entities including: Characters, Platforms, Obstacles, Gems, and Doors.
     * Adds all the entities to an array list of entities.
     *
     * @param window a Window that the game entities will be displayed in
     */
    public Level(Window window) {
        this.rendererEngine = new RendererEngine(window);
        
        this.levelComplete = false;
        
        // add all of the entities into an array list
        this.entities = new ArrayList<>();
        this.entities.add(this.fireboy);
        this.entities.add(this.watergirl);
        this.entities.addAll(Arrays.asList(this.platforms));
        this.entities.addAll(Arrays.asList(this.movingPlatforms));
        this.entities.addAll(Arrays.asList(this.fire));
        this.entities.addAll(Arrays.asList(this.water));
        this.entities.addAll(Arrays.asList(this.mud));
        this.entities.addAll(Arrays.asList(this.buttons));
        this.entities.addAll(Arrays.asList(this.fireGems));
        this.entities.addAll(Arrays.asList(this.waterGems));
        this.entities.add(this.fireDoor);
        this.entities.add(this.waterDoor);
    }

    /**
     * Returns whether if the Level has been completed by the user.
     *
     * @return a boolean representing whether or not if the Level has been
     * completed
     */
    public boolean levelComplete() {
        return this.levelComplete;
    }
    
    /**
     * Draws the game entities using a RendererEngine.
     */
    public void draw() {
        this.rendererEngine.draw();
    }
}
