package com.company;

public class Pizza {
    private double weight;
    private int diametr;
    private boolean livrare;
    private double price;

    // Constructor
    Pizza(double weight, int diametr, boolean livrare, double price){
        this.weight=weight;
        this.diametr=diametr;
        this.livrare=livrare;
        this.price=price;
    }

    // Getters
    public double getWeight(){
        return this.weight;
    }

    public int getDiametr(){
        return this.diametr;
    }

    public boolean getLivrare(){
        return this.livrare;
    }

    public double getPrice(){
        return this.price;
    }

    // Setters
    public void setWeight(double weight){
        this.weight=weight;
    }

    public void setDiametr(int diametr){
        this.diametr=diametr;
    }

    public void setLivrare(boolean livrare){
        this.livrare=livrare;
    }

    public void setPrice(double price){
        this.price=price;
    }
}
