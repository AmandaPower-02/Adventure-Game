/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levels;

import modules.entities.Button;
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

    /**
     * Initializes a Level of a game of Fireboy and Watergirl using various
     * entities including: Characters, Platforms, Obstacles, Gems, and Doors.
     *
     * @param f a Character representing a Fireboy
     * @param w a Character representing a Watergirl
     * @param p an array of Platforms
     * @param m an array of Platforms representing MovingPlatforms
     * @param fo an array of Obstacles representing Fire
     * @param wo an array of Obstacles representing Water
     * @param mo an array of Obstacles representing Mud
     * @param b an array of Obstacles representing Buttons
     * @param fg an array of Gems representing FireGems
     * @param wg an array of Gems representing WaterGems
     * @param fd a Door representing a FireDoor
     * @param wd a Door representing a WaterDoor
     */
    public Level(Fireboy f, Watergirl w, Platform[] p, MovingPlatform[] m, Fire[] fo, Water[] wo, Mud[] mo, Button[] b, FireGem[] fg, WaterGem[] wg, FireDoor fd, WaterDoor wd) {
        this.fireboy = f;
        this.watergirl = w;
        this.platforms = p;
        this.movingPlatforms = m;
        this.fire = fo;
        this.water = wo;
        this.mud = mo;
        this.buttons = b;
        this.fireGems = fg;
        this.waterGems = wg;
        this.fireDoor = fd;
        this.waterDoor = wd;
        this.levelComplete = false;
    }
}
