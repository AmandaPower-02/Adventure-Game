/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

/**
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Input {
    
    private static Input instance = null;
    
    public static Input getInstance(){
        if(instance == null)
            instance = new Input();
        return instance;
    }
    
    private boolean[] keys = new boolean[256];
    private boolean[] pressed = new boolean[256];
    private boolean[] released = new boolean[256];
    private boolean[] current = new boolean[256];
    
    /**
     * 
     */
    protected Input(){
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
           
            @Override
            public boolean dispatchKeyEvent(KeyEvent k){
                int key = k.getKeyCode();
                synchronized (Input.class){
                    switch(k.getID()){
                        case KeyEvent.KEY_PRESSED:
                            keys[key] = true;
                            break;
                        case KeyEvent.KEY_RELEASED:
                            keys[key] = false;
                            break;
                    }
                    return false;
                }
            }
        });
    }
    
    /**
     * 
     */
    public void update(){
        for(int i = 0; i < this.released.length; i++){
            this.released[i] = false;
            if(!this.keys[i] && this.current[i])
                this.released[i] = true;
        }
        
        for(int i = 0; i < this.pressed.length; i++){
            this.pressed[i] = false;
            if(this.keys[i] && !this.current[i])
                this.pressed[i] = true;
        }
        
        for(int i = 0; i < this.current.length; i++){
            this.current[i] = false;
            if(this.keys[i])
                this.current[i] = true;
        }
    }
    
    /**
     * 
     * @param keyCode
     * @return 
     */
    public boolean isKeyDown(int keyCode){
        return this.current[keyCode];
    }
    
    /**
     * 
     * @param keyCode
     * @return 
     */
    public boolean isJustPressed(int keyCode){
        return this.pressed[keyCode];
    }
    
    /**
     * 
     * @param keyCode
     * @return 
     */
    public boolean isJustReleased(int keyCode){
        return this.released[keyCode];
    }
}
