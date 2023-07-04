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
        Animal animal[] = new Animal[3];
        animal[0] = new Cat(1);
        animal[1] = new Dog(2);
        animal[2] = new Frog(1);
        System.out.println("Cat:\nCarnivorous: "+animal[0].isCarnivorous()+"\nMammalian: "+animal[0].isMammalian()+"\nNumber of legs: "+
                ((LandAble)animal[0]).getNumberOfLegs());
        animal[0].sayHello();
        System.out.println("Dog:\nCarnivorous: "+animal[1].isCarnivorous()+"\nMammalian: "+animal[1].isMammalian()+"\nNumber of legs: "+
                ((LandAble)animal[1]).getNumberOfLegs());
        animal[1].sayHello();
        System.out.println("Frog:\nCarnivorous: "+animal[2].isCarnivorous()+"\nMammalian: "+animal[2].isMammalian()+"\nNumber of legs: "+
                ((LandAble)animal[2]).getNumberOfLegs());
        animal[2].sayHello();
        System.out.println("has Gills: "+((WaterAble)animal[2]).hasGills());
        System.out.println("has Lays Eggs: "+((WaterAble)animal[2]).hasLaysEggs());
        
    }
    
}
