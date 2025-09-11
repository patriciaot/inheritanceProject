/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceproject;

/**
 *
 * @author patriciaortiz
 */
public class Dog extends Animal {
    
    //Constructor  
    Dog (String type, String kind){
    super(type, kind); //La palabra reservada "super" no permite pasar valores a los parámetros definidos en el constructor de una clase que es extendida (Clase base). Los valores pasados en la clase Dog mediante la palabra reservada super serán enviados al constructor de la clase Animal.
    }
    
    //Método
    public String bark() {
    return "El perro está ladrando";
    }
    
    
}//Dog
