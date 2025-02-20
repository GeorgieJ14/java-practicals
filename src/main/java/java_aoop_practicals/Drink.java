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
public abstract class Drink {

    void prepareRecipe() {
        boilWater();
        dripOrSteep();
        pourLiquid();
        addExtras();
    }

    protected abstract void addExtras();

    private void pourLiquid() {
        System.out.println("pour liquid");
    }

    protected abstract void dripOrSteep();

    private void boilWater() {
        System.out.println("Boil water");
    }    
}
