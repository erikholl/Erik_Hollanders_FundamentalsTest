package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {
    protected String name;
    protected double height;

    public Plant(String name) {
        this.name = name;
        setHeight(0);           // default value
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + getName() + "'}";
    }
}
