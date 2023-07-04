/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verisoft;

/**
 *
 * @author USER
 */
public class VeriSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal[] = new Animal[4];
        animal[0] = new Cat(1);
        animal[1] = new Dog(2);
        animal[2] = new Frog(1);
        System.out.println(animal[0].isCarnivorous()+" "+animal[0].isMammalian());
        animal[0].sayHello();
        animal[0].sayHello(animal[0].mood);
        System.out.println(((WaterAble)animal[2]).hasGills());
        
    }
    
}
