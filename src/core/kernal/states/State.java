/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal.states;

/**
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class State {

    private static State state;

    /**
     * Return the state.
     *
     * @return a State representing the state that the game is in
     */
    public static State getState() {
        return state;
    }

    /**
     * Sets the state to equal what the input was.
     *
     * @param s a State representing the state that needs to be set
     */
    public static void setState(State s) {
        state = s;
    }

    public abstract void update();

    public abstract void render();
}
