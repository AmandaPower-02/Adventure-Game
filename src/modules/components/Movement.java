/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import modules.entities.Entity;

/**
 * Creates Movement as a subclass of Component.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Movement extends Component {

    private int speedX;
    private int speedY;

    /**
     * Initializes the type of component that Movement is.
     */
    public Movement() {
        super("move");
    }

    /**
     * Initializes the Entity's speed.
     *
     * @param entity an Entity representing the Entity to be initialized
     */
    @Override
    public void initialize(Entity entity) {
        this.speedX = 10;
        this.speedY = 0;
    }

    /**
     * Updates the speed of the Entity.
     *
     * @param entity an Entity representing the Entity where the speed needs to
     * be updated
     */
    @Override
    public void update(Entity entity) {
        entity.setX(entity.getX() + this.speedX);
        entity.setY(entity.getY() + this.speedY);
    }

    /**
     * Returns the x speed of the Entity.
     *
     * @return an integer representing the x speed of the Entity
     */
    public int getSpeedX() {
        return this.speedX;
    }

    /**
     * Returns the y speed of the Entity.
     *
     * @return an integer representing the y speed of the Entity
     */
    public int getSpeedY() {
        return this.speedY;
    }

    /**
     * Sets the x speed of the Entity.
     *
     * @param speed an integer representing the new x speed of the Entity
     */
    public void setSpeedX(int speed) {
        this.speedX = speed;
    }

    /**
     * Sets the y speed of the Entity.
     *
     * @param speed an integer representing the new y speed of the Entity
     */
    public void setSpeedY(int speed) {
        this.speedY = speed;
    }
}
