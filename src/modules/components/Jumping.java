/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import modules.entities.Entity;
import modules.entities.Character;

/**
 *
 * @author camet2651
 */
public class Jumping extends Component {

    int ySpeed;

    public Jumping(String type) {
        super("jump");
    }

    @Override
    public void initialize(Entity entity) {
    }

    @Override
    public void update(Entity entity) {

    }

    /**
     * Sets the Character to a jumping state
     */
    public void jump(Character c) {
        if (c.isOnGround()) {
            c.setYSpeed(-11);//tweak
            c.setJumping(true);
            c.setXSpeed(4);//tweak
            c.setOnGround(false);
        }
    }

    /**
     * Allows the character to jump and fall
     *
     */
    public void jumpAction(Character c) {
        if (c.getIsJumping() && !c.isOnGround()) {
  ySpeed += 5;//tweak
          c.setY(c.getY() - ySpeed); 
        }
    }

}
