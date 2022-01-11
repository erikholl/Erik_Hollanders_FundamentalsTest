package be.intecbrussel.the_notebook.entities.animal_entities;

// COMPLETED
public class Carnivore extends Animal {
    private double maxFoodSize = 0;     // default value

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
        return "Carnivore: " +
                "name='" + getName() + '\'' +
                ", height='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", length='" + getLength() + '\'' +
                ", maxFoodSize=" + maxFoodSize +
                ".";
    }
}
