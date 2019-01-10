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
public abstract class Component {

    protected String type;

    public Component(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void initialize(Entity entity);

    public abstract void update(Entity entity);

}
