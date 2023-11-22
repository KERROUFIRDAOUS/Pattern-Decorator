package org.example.decorateurs;

import org.example.composants.Boisson;

public class Chocolat extends Decorator{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription(){
        return boisson.getDescription()+" Au chocolat";
    }
    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
