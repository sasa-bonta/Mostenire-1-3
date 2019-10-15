package com.company;

public class Main {

    public static void main(String[] args) {
        PizzaMargherita PizzaMargheritaSmall = new PizzaMargherita(0.400, 30, true,
                45.50, "Tomatoes", "Mozarella", "Basil", "Olive oil");

        PizzaMargherita PizzaMargheritaBig = new PizzaMargherita(0.800, 30, true,
                75.50, "Tomatoes", "Mozarella", "Basil", "Olive oil");

        PizzaChicago PizzaChicagoSmall = new PizzaChicago(0.350, 25, true, 50,
                "Beef", "Sausage", "Pepperoni", "Onion",
                "Mushrooms", "Green Peppers", "Tomato Sauce");

        PizzaCalifornia  PizzaCaliforniaBig = new PizzaCalifornia(1.5, 70, true, 175.00,
                0.050, 0.200, 0.300, 0.175);

        System.out.print("\n\n");
        System.out.print("Pizza Margherita mare - ");
        System.out.println(PizzaMargheritaSmall.toString());
        System.out.print("\n");
        System.out.print("Pizza Margherita mica - ");
        System.out.println(PizzaMargheritaBig.toString());
        System.out.print("\n");
        System.out.print("Pizza Chicago mica - ");
        System.out.println(PizzaChicagoSmall.toString());
        System.out.print("\n");
        System.out.print("Pizza Californie foarte mare - ");
        System.out.println(PizzaCaliforniaBig.toString());
        System.out.print("\n\n");
    }
}