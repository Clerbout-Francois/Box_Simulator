/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxsimulator;

/**
 *
 * @author clerb
 */
public interface Annonce {
    
    default void revelationAuteursCode(){
        System.out.println("Ce jeu a été créé par Laura BRISOUX et François CLERBOUT dans le cadre du cours de Java de M1 avec M.MORELLE.");
    }
    
    
}
