package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Set;

// COMPLETED
public class Omnivore extends Animal {
    private Set<Plant> plantDiet;       // no default: if no diet noted -> empty
    private double maxFoodSize = 0;     // default value

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore: " +
                "name=" + getName() +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", length=" + getLength() +
                ", plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize + " ";
    }
}
