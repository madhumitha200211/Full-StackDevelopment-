package com.gentech.inheritance.Assignment;

class Sweet {
    Sweet(String name) {
        System.out.println("Name of Sweet: " + name);
    }

    Sweet(String name, double weight) {
        System.out.println("Name: " + name + " Weight in grams: " + weight);
    }
}

class Chocolate extends Sweet {
    Chocolate(String name, int cost) {
        super(name);
        System.out.println("The cost of the chocolate: " + cost);
    }

    Chocolate(String name, double weight, int cost) {
        super(name, weight);
        System.out.println("The cost of the chocolate: " + cost);
    }
}

class Candy extends Sweet {
    Candy(String name, int cost) {
        super(name);
        System.out.println("The cost of the candy: " + cost);
    }

    Candy(String name, double weight, int cost) {
        super(name, weight);
        System.out.println("The cost of the candy: " + cost);
    }
}

class Color1 extends Candy {
    Color1(String name, int cost, String color) {
        super(name, cost);
        System.out.println("The color of the candy is " + color);
    }

    Color1(String name, double weight, int cost, String color) {
        super(name, weight, cost);
        System.out.println("The color of the candy is " + color);
    }
}

public class HybridInheritanceParameterized {
    public static void main(String[] args) {
        Chocolate c = new Chocolate("Dairy Milk", 10);
        Chocolate c1 = new Chocolate("Milkybar", 12.56, 10);
        System.out.println("******************************");
        Color1 h = new Color1("Toffee", 2, "brown");
        Color1 h1 = new Color1("Lollipop", 2.5, 5, "orange");
    }
}
