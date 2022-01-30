package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal {
    protected String name;
    protected double weight;
    protected double height;
    protected double length;

    public Animal(String name) {
        this.name = name;
        setWeight(-1);                   // default value
        setHeight(-1);                   //      ,,
        setLength(-1);                   //      ,,
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

    @Override
    public String toString() {
        return
                "name='" + getName() + '\'' +
                        ", weight='" + (getWeight() == -1 ? "UNKNOWN" :
                        getWeight()) + '\'' +
                        ", height='" + (getHeight() == -1 ? "UNKNOWN" :
                        getHeight()) + '\'' +
                        ", length='" + (getLength() == -1 ? "UNKNOWN" :
                        getLength()) + '\'';
    }
}
