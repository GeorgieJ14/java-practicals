/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_aoop_practicals;

/**
 *
 * @author p0074564
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink d1;
        Drink d2;
        d1 = new Coffee();
        d2 = new Tea();
        d1.prepareRecipe();
        System.out.println("-------");
        d2.prepareRecipe();
    }    
}
