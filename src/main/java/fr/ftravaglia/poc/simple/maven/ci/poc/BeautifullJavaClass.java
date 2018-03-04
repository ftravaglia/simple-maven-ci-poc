/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ftravaglia.poc.simple.maven.ci.poc;

/**
 *
 * @author ftravaglia
 */
public class BeautifullJavaClass {
    public BeautifullJavaClass(){
        super();
    }
    
    /**
     * Imprime le message 'Hello'
     */
    public void sayHello(){
        System.out.println("Hello !");
    }
    
    /**
     * Retourne le nom de la classe
     * @return 
     */
    public String getClassName(){
        return this.getClass().getSimpleName();
    }
}
