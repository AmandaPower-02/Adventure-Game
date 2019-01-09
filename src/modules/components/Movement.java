/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import modules.entities.Entity;

/**
 *
 * @author Amanda
 */
public class Movement extends Component {

    private int speedX;
    private int speedY;

    public Movement() {
        super("move");
    }

    @Override
    public void initialize(Entity entity) {
        this.speedX = 10;
        this.speedY = 0;
    }

    @Override
    public void update(Entity entity) {
        entity.setX(entity.getX() + speedX);
        entity.setY(entity.getY() + speedY);
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedX(int speed) {
        speedX = speed;
    }

    public void setSpeedY(int speed) {
        speedY = speed;

    }
}
