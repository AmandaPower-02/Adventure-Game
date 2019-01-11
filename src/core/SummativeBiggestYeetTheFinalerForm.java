/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import core.kernal.CoreEngine;

/**
 * Runs Fireboy and Watergirl.
 * 
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class SummativeBiggestYeetTheFinalerForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoreEngine core = new CoreEngine();
        core.initialize("Fireboy and Watergirl", 840, 680);
        core.start();
    }
}
