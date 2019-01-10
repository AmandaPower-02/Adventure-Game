/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal.states;

/**
 *
 * @author Amanda
 */
public abstract class State {
    
    private static State state;
    
    /**
     * get the state 
     * @return the state
     */
    public static State getState(){
        return state;
    }
    
    /**
     * sets the state to equal what was input
     * @param s sets the state
     */
    public static void setState(State s){
        state = s;
    }
    
    public abstract void update();
    public abstract void render();
}
