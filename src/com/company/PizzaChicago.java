package com.company;

public class PizzaChicago extends Pizza{
        private String ingredient1;
        private String ingredient2;
        private String ingredient3;
        private String ingredient4;
        private String ingredient5;
        private String ingredient6;
        private String ingredient7;

        // Constructor
        PizzaChicago(double weight, int diametr, boolean livrare, double price, String ingredient1,
                        String ingredient2, String ingredient3, String ingredient4,  String ingredient5,
                     String ingredient6,  String ingredient7){

            super (weight, diametr, livrare, price);
            this.ingredient1=ingredient1;
            this.ingredient2=ingredient2;
            this.ingredient3=ingredient3;
            this.ingredient4=ingredient4;
            this.ingredient4=ingredient5;
            this.ingredient4=ingredient6;
            this.ingredient4=ingredient7;
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

        public String getIngredient5(){
            return this.ingredient5;
        }

         public String getIngredient6(){
            return this.ingredient6;
       }

        public String getIngredient7(){
             return this.ingredient7;
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

        public void setIngredient5(String ingredient5){
            this.ingredient5=ingredient5;
        }

        public void setIngredient6(String ingredient6){
            this.ingredient6=ingredient6;
        }

        public void setIngredient7(String ingredient7){
            this.ingredient7=ingredient7;
        }

    @Override
    public String toString() {
        return
                "Greutate :" +getWeight()+ ",  Diametru : " +getDiametr()+
                ", Livrare : " +getLivrare()+ ", Pret : " +getPrice()+
                "; Ingrediente : " +ingredient1+ ", " +ingredient2+ ", " +ingredient3+
                ", " +ingredient4+ ", " +ingredient5+ ", " +ingredient6+
                ", " +ingredient7+ "";
    }
    }

