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
 * @author Amanda
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
    
    public void update(){
        
        for(int i = 0; i < released.length; i++){
            released[i] = false;
            if(!keys[i] && current[i])
                released[i] = true;
        }
        
        for(int i = 0; i < pressed.length; i++){
            pressed[i] = false;
            if(keys[i] && !current[i])
                pressed[i] = true;
        }
        
        for(int i = 0; i < current.length; i++){
            current[i] = false;
            if(keys[i])
                current[i] = true;
        }
    }
    
    public boolean isKeyDown(int keyCode){
        return current[keyCode];
    }
    
    public boolean isJustPressed(int keyCode){
        return pressed[keyCode];
    }
    
    public boolean isJustReleased(int keyCode){
        return released[keyCode];
    }
}
