package org.example;

import org.example.composants.Boisson;
import org.example.composants.Espresso;
import org.example.composants.Sumatra;
import org.example.decorateurs.Caramel;
import org.example.decorateurs.Chocolat;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        

    }
}