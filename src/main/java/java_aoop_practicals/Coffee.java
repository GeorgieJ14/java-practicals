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
public class Coffee extends Drink {

    protected void addExtras() {
            System.out.println("add sugar and milk");
    }

    protected void dripOrSteep() {
            System.out.println("drip coffee through filter");
    }
}
