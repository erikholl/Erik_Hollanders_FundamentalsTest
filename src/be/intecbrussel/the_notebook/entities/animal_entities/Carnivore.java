package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal {
    private double maxFoodSize; // max height of animal that can be eaten

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + getName() + '\'' +
                ", height='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", length='" + getLength() + '\'' +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
