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
 * Creates Level One of Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class LevelOne extends Level {

    /**
     * Initializes the first Level of Fireboy and Watergirl by initializing the
     * game entities.
     */
    public LevelOne() {
        super.fireboy = new Fireboy(40, 600);
        super.watergirl = new Watergirl(40, 500);

        super.platforms = new Platform[30];
        super.platforms[0] = new Platform(0, 640, 420, 40);
        super.platforms[1] = new Platform(0, 0, 20, 640);
        super.platforms[2] = new Platform(420, 660, 80, 20);
        super.platforms[3] = new Platform(500, 640, 40, 40);
        super.platforms[4] = new Platform(540, 660, 80, 20);
        super.platforms[5] = new Platform(620, 640, 220, 40);
        super.platforms[6] = new Platform(740, 560, 80, 80);
        super.platforms[7] = new Platform(820, 0, 20, 640);
        super.platforms[8] = new Platform(20, 540, 240, 40);
        super.platforms[9] = new Platform(20, 440, 320, 40);

        super.movingPlatforms = new MovingPlatform[1];
        super.movingPlatforms[0] = new MovingPlatform(720, 270, 100);

        super.fire = new Fire[1];
        super.fire[0] = new Fire(420, 640, 80, 20);

        super.water = new Water[1];
        super.water[0] = new Water(540, 640, 80, 20);

        super.mud = new Mud[1];
        super.mud[0] = new Mud(520, 200, 80, 20);

        super.buttons = new Button[2];
        super.buttons[0] = new Button(210, 310, movingPlatforms[0]);
        super.buttons[1] = new Button(610, 210, movingPlatforms[0]);

        super.fireGems = new FireGem[4];
        super.fireGems[0] = new FireGem(450, 870);
        super.fireGems[1] = new FireGem(140, 280);
        super.fireGems[2] = new FireGem(180, 60);
        super.fireGems[3] = new FireGem(380, 60);

        super.waterGems = new WaterGem[4];
        super.waterGems[0] = new WaterGem(570, 870);
        super.waterGems[1] = new WaterGem(460, 300);
        super.waterGems[2] = new WaterGem(40, 100);
        super.waterGems[3] = new WaterGem(440, 60);

        super.fireDoor = new FireDoor(700, 50);
        super.waterDoor = new WaterDoor(760, 50);
    }
}
