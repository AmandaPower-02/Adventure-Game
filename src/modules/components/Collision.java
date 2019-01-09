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

    public Collision(String type) {
        super("collision");
    }

    @Override
    public void initialize(Entity entity) {
        overlap = new Rectangle(0, 0, 0, 0);
    }

    @Override
    public void update(Entity entity) {

    }

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

    public void stopJumpingPlatform(Platform[] platforms, MovingPlatform[] movingPlatforms, Character e) {
        for (Platform p : platforms)  {
            this.overlap = e.
        }
        this.overlap = this.overlapRectangle(p);
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
            this.onGround = false;
        }
    }
}
