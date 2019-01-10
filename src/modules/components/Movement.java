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

    /**
     * initializes the type of component this is
     */
    public Movement() {
        super("move");
    }

    /**
     * initializes the speeds of the entity
     * @param entity an entity
     */
    @Override
    public void initialize(Entity entity) {
        this.speedX = 10;
        this.speedY = 0;
    }

    /**
     * updates the speed of the entity
     * @param entity an entity
     */
    @Override
    public void update(Entity entity) {
        entity.setX(entity.getX() + speedX);
        entity.setY(entity.getY() + speedY);
    }

    /**
     * get the X speed 
     * @return x speed
     */
    public int getSpeedX() {
        return speedX;
    }

    /**
     * get the y speed
     * @return the y speed
     */
    public int getSpeedY() {
        return speedY;
    }

    /**
     * set the x speed
     * @param speed the speed
     */
    public void setSpeedX(int speed) {
        speedX = speed;
    }

    /**
     * set the y speed
     * @param speed the speed
     */
    public void setSpeedY(int speed) {
        speedY = speed;

    }
}
