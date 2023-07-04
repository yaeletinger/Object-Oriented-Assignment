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
public class Dog extends Animal implements LandAble{
    private int numberOfLegs = 4;

    public Dog(int mood) {
        super(true, true, mood);
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public void sayHello()
    {
        System.out.println("wagging their tails");     
    }
    
    @Override
    public void sayHello(int mood)
    {
        if(this.mood == Dog.moodHappy)
            System.out.println("they will bark loudly");
        else
            if(this.mood == Dog.moodScare)
                System.out.println("they will make a whooping sound");
    }
}
