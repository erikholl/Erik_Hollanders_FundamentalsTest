package be.intecbrussel.the_notebook.entities.animal_entities;

// COMPLETED
public class Animal {
    protected String name;
    protected double weight;
    protected double height;
    protected double length;
    // following UML (protected) but I think private is better - protected
    // does not look to be needed?

    public Animal(String name) {
        this.name = name;
        setWeight(0);                   // default value
        setHeight(0);                   //      ,,
        setLength(0);                   //      ,,
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
