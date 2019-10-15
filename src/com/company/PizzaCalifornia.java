package com.company;

public class PizzaCalifornia extends Pizza{
    private double mustard;
    private double ricotta;
    private double pate;
    private double redPepper;

    // Constructor
    PizzaCalifornia(double weight, int diametr, boolean livrare, double price, double mustard,
                    double ricotta, double pate, double redPepper){

        super (weight, diametr, livrare, price);
        this.mustard = mustard;
        this.ricotta = ricotta;
        this.pate = pate;
        this.redPepper = redPepper;
    }

    // Getters
    public double getMustard(){
        return this.mustard;
    }

    public double getRicotta(){
        return this.ricotta;
    }

    public double getPate(){
        return this.pate;
    }

    public double getRedPepper(){
        return this.redPepper;
    }

    // Setters
    public void setMustard(double mustard){
        this.mustard = mustard;
    }

    public void setRicotta(double ricotta){
        this.ricotta = ricotta;
    }

    public void setPate(double pate){
        this.pate = pate;
    }

    public void setRedPepper(double redPepper){
        this.redPepper = redPepper;
    }

    @Override
    public String toString() {
        return
                "Greutate :" +getWeight()+ ",  Diametru : " +getDiametr()+
                ", Livrare : " +getLivrare()+ ", Pret : " +getPrice()+
                "; Ingrediente[kg] : Mustar : " +mustard+ ", Ricotta : " +ricotta+
                ", Pastet : " +pate+ ", Chiper Rosu : " +redPepper+ "";
    }
}
