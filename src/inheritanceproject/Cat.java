/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceproject;

/**
 *
 * @author patriciaortiz
 */
public class Cat extends Animal{
    
    //Constructor
    Cat (String type, String kind){
        super (type, kind);
    }
    
    //Método
    public String meow() {
    return "El gato está maullando";
    }
    
}//Cat
