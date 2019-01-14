/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levels;

import modules.entities.Fire;
import modules.entities.Fireboy;
import modules.entities.Mud;
import modules.entities.Water;
import modules.entities.WaterGem;
import modules.entities.Watergirl;

/**
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class LevelTwo extends Level {

    public LevelTwo() {
        super.fireboy = new Fireboy(450, 80);
        super.watergirl = new Watergirl(360, 80);

        super.platforms = new Platform[];

        super.mud = new Mud[1];
        super.mud[0] = new Mud(20, 620, 840, 20);

        super.fire = new Fire[1];

        super.water = new Water[1];

        super.waterGems = new WaterGem[6];

    }

}
