/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import modules.entities.Entity;

/**
 * Creates a Component to use in a game of Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Component {

    protected String type;

    /**
     * Initializes Component data using its type.
     *
     * @param type a String representing the type of Component it is
     */
    public Component(String type) {
        this.type = type;
    }

    /**
     * Returns the Component's type.
     *
     * @return a String representing the Component's type
     */
    public String getType() {
        return type;
    }

    public abstract void initialize(Entity entity);

    public abstract void update(Entity entity);
}
