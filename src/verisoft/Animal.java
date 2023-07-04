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
public abstract class Animal {
    private boolean mammalian;
    private boolean carnivorous;
    public int mood;
    public static int moodHappy = 1;
    public static int moodScare = 2;

    public Animal(boolean mammalian, boolean carnivorous, int mood) {
        this.mammalian = mammalian;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    public boolean isMammalian() {
        return mammalian;
    }

    public void setMammalian(boolean mammalian) {
        this.mammalian = mammalian;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
    
    public void sayHello()
    {
        
    }
    
    public void sayHello(int mood)
    {
        
    }
    
    
}
