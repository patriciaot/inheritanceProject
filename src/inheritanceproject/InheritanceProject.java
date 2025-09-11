/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritanceproject;

/**
 *
 * @author patriciaortiz
 */
public class InheritanceProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* INSTANCIAS*/
        
        //Dog        
        Dog dog = new Dog("perro", "mamífero");
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        System.out.println(dog.bark());
        
        //Cat
        Cat cat = new Cat("gato", "mamífero");
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(cat.meow());
        
        
        
        
    } //Método Main
    
}
