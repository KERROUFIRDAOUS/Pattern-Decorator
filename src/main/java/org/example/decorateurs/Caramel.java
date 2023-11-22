package org.example.decorateurs;

import org.example.composants.Boisson;

public class Caramel extends Decorator{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription(){
        return boisson.getDescription()+" Au Caramel";
    }

    @Override
    public double cout() {
        return 0.8+ boisson.cout();
    }
}
