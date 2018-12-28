/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;
import java.util.HashMap;
import modules.components.Component;

/**
 *
 * @author Amanda
 */
public class Entity {

    private int x;
    private int y;
    private int width;
    private int height;
    private SpriteSheet look;
    private HashMap<String, Component> components;

    public Entity(int x, int y, int width, int height, SpriteSheet look, Component... components) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.look = look;
        
        this.components = new HashMap<String, Component>() ;
        for (Component component: components) {
            this.components.put( component.getType(), component);
        }
                                
        
        initialize();

    }

    private void initialize() {
        for (Component component: components.values()) {
            component.initialize(this);
            
        }
        

    }

    public void update() {
        for (Component component: components.values()) {
            component.update(this);
        }
        
    }

    public int getX(){
       return x; 
    }
    
    public int getY(){
        return y;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public SpriteSheet getLook(){
        return look;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
       this.y = y;
    }
            
}
