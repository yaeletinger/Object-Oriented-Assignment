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
public class Frog extends Animal implements LandAble, WaterAble{
    private int numberOfLegs = 4;
    
    public Frog(int mood) {
        super(false, false, mood);
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }
    
    @Override
    public void sayHello() {
        sayHello(this.mood);
    }
    
    @Override
    public void sayHello(int mood)
    {
        if(this.mood == Frog.MOODHAPPY)
            System.out.println("it will sing \"quack quack quack\" on the shore");
        else
            System.out.println("it will \"plop into the water\"");
         
    }

  
    
}
