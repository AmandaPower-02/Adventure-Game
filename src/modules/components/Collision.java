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
public class Collision extends Component {
    Rectangle overlap; 

    public Collision(String type) {
        super("collision");
    }

    @Override
    public void initialize(Entity entity) {
        overlap = new Rectangle(0,0,0,0);
    }

    @Override
    public void update(Entity entity) {
       
    }
    
    

    
    
    
}
