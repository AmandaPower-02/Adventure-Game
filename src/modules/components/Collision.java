/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import java.awt.Rectangle;
import modules.entities.Entity;
import modules.entities.Character;
import modules.entities.MovingPlatform;
import modules.entities.Platform;

/**
 *
 * @author camet2651
 */
public class Collision extends Component {

    Rectangle overlap;
    boolean onGround;

    public Collision() {
        super("collision");
    }

    @Override
    public void initialize(Entity entity) {
        this.overlap = new Rectangle(0, 0, 0, 0);
    }

    @Override
    public void update(Entity entity) {
      
    }

    //checks if player is on top of platform,
    public void onTop(Platform[] platforms, MovingPlatform[] movingPlatforms, Character e) {
        for (Platform p : platforms) {
            if (e.getY() == p.getY() + p.getHeight()) {
                if ((e.getX() >= p.getX() && e.getX() + e.getWidth() <= p.getX() + p.getWidth())) {
                    e.setOnGround(true);
                } else if (e.getX() < p.getX() && e.getX() + e.getWidth() >= p.getX()) {
                    e.setOnGround(true);
                } else if (e.getX() + e.getWidth() > p.getX() + p.getWidth() && e.getX() <= p.getX() + p.getWidth()) {
                    e.setOnGround(true);
                }
            }
        }

        for (Platform p : movingPlatforms) {
            if ((e.getX() >= p.getX() && e.getX() + e.getWidth() <= p.getX() + p.getWidth())) {
                e.setOnGround(true);
            } else if (e.getX() < p.getX() && e.getX() + e.getWidth() >= p.getX()) {
                e.setOnGround(true);
            } else if (e.getX() + e.getWidth() > p.getX() + p.getWidth() && e.getX() <= p.getX() + p.getWidth()) {
                e.setOnGround(true);
            }
        }
    }

    //checks if player is hitting sides or bottom of a platform
    public void stopJumpingPlatform(Platform[] platforms, MovingPlatform[] movingPlatforms, Character e) {
        for (Platform p : platforms) {
            this.overlap = e.getBounds().intersection(p.getBounds());
            if (this.overlap.height < this.overlap.width) {
                //hitting top 
                if (e.getYSpeed() < 0) {
                    // stop moving up/down
                    e.setYSpeed(0);
                    // correct the position
                    e.setY(p.getY() - e.getHeight());
                }
                if (e.getYSpeed() > 0) {
                    e.setY(p.getY() + p.getHeight());
                    e.setOnGround(true);
                    e.setJumping(false);
                    e.setXSpeed(2);//tweaked
                }
            } else {
                // player is on the right
                if (e.getX() < p.getX()) {
                    e.setX(e.getX() - this.overlap.width);
                } else {
                    e.setX(e.getX() + this.overlap.width);
                }
                e.setOnGround(false);
            }
        }
    }

    public boolean hittingObject(Character c, Entity e) {
        return (c.getBounds().intersects(e.getBounds()));
    }
}
