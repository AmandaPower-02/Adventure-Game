/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import java.awt.Rectangle;
import modules.entities.Entity;


/**
 *
 * @author camet2651
 */
public class Jumping extends Component {

    int ySpeed = 11;
    
    public Jumping(String type) {
        super("jump");
    }

    @Override
    public void initialize(Entity entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Entity entity) {
        
    }
    
     /**
     * Allows the character to jump and fall
     *
     */
    public void jumpAction() {
        if (!this.onGround) {
            ySpeed += gravity;
            this.y -= ySpeed;
        }
    }

    /**
     * Stops character from jumping if on platform
     *
     * @param p
     */
    public void stopJumpingPlatform(Platform p) {    
        this.overlap = p.;
        if (this.overlap.height < this.overlap.width) {
            if (this.ySpeed < 0) {
                // stop moving up/down
                this.ySpeed = 0;
                // correct the position
                this.y = p.getY() - this.height;
            }
            if (this.ySpeed > 0) {
                this.y = p.getTop();
                this.onGround = true;
                this.jump = false;
                            this.speed = 2f;//tweak

            }
        } else {
            // player is on the right
            if (this.x < p.getX()) {
                this.x = this.x - this.overlap.width;
            } else {
                this.x = this.x + this.overlap.width;
            }
        }

    }

    
}
