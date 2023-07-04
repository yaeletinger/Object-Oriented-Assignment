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
    protected int mood;
    public final static int MOODHAPPY = 1;
    public final static int MOODSCARE = 2;

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
    
    abstract public void sayHello();// sayHello(int mood)פונקציה שמדפיסה את התנהגות החיה כשהיא מברכת אנשים ומפעילה את הפונקציה
    abstract protected void sayHello(int mood);//פונקציה המדפיסה את התנהגות החיה לפי המשתנה mood
    
    
}
