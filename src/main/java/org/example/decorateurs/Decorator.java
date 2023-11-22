package org.example.decorateurs;

import org.example.composants.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;
    public Decorator(Boisson boisson){
        this.boisson = boisson;
    }
}
