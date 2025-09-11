/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceproject;

/**
 *
 * @author patriciaortiz
 */
public class Animal {
    private String type = "";
    private String kind = "";
    
    //Constructor. Permite inicializar los atributos.
    public Animal (String type, String kind){
        this.type = type;
        this.kind = kind;
    }
    
    //Métodos
    
    public String eat() {
    return "El " + this.type + " esta comiendo";//Se devuelve una cadena utilizando la palabra reservada return
    }
    
    public String sleep(){
    return "El " + this.type + " esta durmiendo";
    }
    
}//Animal
