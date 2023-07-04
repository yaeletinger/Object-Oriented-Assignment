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
public class Cat extends Animal implements LandAble{
    private int numberOfLegs = 4;
    
    public Cat(int mood) {
        super(true, true, mood);
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public void sayHello()
    {
        System.out.println("make a \"meow~\" sound");
        sayHello(this.mood);
    }
    
    @Override
    public void sayHello(int mood)
    {
        if(this.mood == Cat.MOODHAPPY)
            System.out.println("they make a \"purr, purr\" sound");
        else
            System.out.println("they make a \"hiss\" sound");
    }
    
}
