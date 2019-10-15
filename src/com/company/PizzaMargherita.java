package com.company;

public class PizzaMargherita extends Pizza {
    private String ingredient1;
    private String ingredient2;
    private String ingredient3;
    private String ingredient4;

    // Constructor
    PizzaMargherita(double weight, int diametr, boolean livrare, double price, String ingredient1,
                    String ingredient2, String ingredient3, String ingredient4){

        super (weight, diametr, livrare, price);
        this.ingredient1=ingredient1;
        this.ingredient2=ingredient2;
        this.ingredient3=ingredient3;
        this.ingredient4=ingredient4;
    }

    // Getters
    public String getIngredient1(){
        return this.ingredient1;
    }

    public String getIngredient2(){
        return this.ingredient2;
    }

    public String getIngredient3(){
        return this.ingredient3;
    }

    public String getIngredient4(){
        return this.ingredient4;
    }

    // Setters
    public void setIngredient1(String ingredient1){
        this.ingredient1=ingredient1;
    }

    public void setIngredient2(String ingredient2){
        this.ingredient2=ingredient2;
    }

    public void setIngredient3(String ingredient3){
        this.ingredient3=ingredient3;
    }

    public void setIngredient4(String ingredient4){
        this.ingredient4=ingredient4;
    }

    @Override
    public String toString() {
        return
                "Greutate : " +getWeight()+ ",  Diametru : " +getDiametr()+
                ", Livrare : " +getLivrare()+ ", Pret : " +getPrice()+
                "; Ingrediente : " +ingredient1+ ", " +ingredient2+ ", " +ingredient3+
                 ", " +ingredient4+ "";
    }
}
