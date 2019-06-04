package com.company.lab2.AnimalRescue;

public class Main {
    public static void main(String[] args) {
        Dog Oscar = new Dog();
        System.out.println(Oscar.breed);
        Oscar.drink();
        Oscar.play();
        Oscar.eat();

        Cat Biby = new Cat();
        System.out.println(Biby.breed);
        Biby.eat();
        Biby.health();
        Biby.play();

        GuineaPig Bubu = new GuineaPig();
        System.out.println(Bubu.breed);
        Bubu.drink();
        Bubu.eat();
        Bubu.health();


        Doctor Fermus = new Doctor();
        System.out.println(Fermus.name);
        Fermus.specialization();

        Adopter Jony = new Adopter();
        System.out.println(Jony.name);
        Jony.money();


        AnimalFood Pedigree = new AnimalFood();
        System.out.println(Pedigree.name);
        Pedigree.price();
        Pedigree.quantity();
        Pedigree.disponibility();



    }
}
