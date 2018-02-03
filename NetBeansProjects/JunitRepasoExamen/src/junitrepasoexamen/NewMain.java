/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitrepasoexamen;

/**
 *
 * @author El_Ma
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] par = {0,1,2,3,4,5};
        
        
        
        ArrayWrapper hola = new ArrayWrapper(par);
        
        System.out.println(hola.getArray());
        }
    }
    

