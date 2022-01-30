package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet;
    private double maxFoodSize = -1;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Optional<Set<Plant>> getPlantDiet() {
        return this.plantDiet == null ? Optional.empty() :
                Optional.of(this.plantDiet);
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
        return "Omnivore{" + super.toString() +
                ", plantDiet=" + (getPlantDiet().isPresent() ?
                getPlantDiet().get() : "UNKNOWN") +
                ", maxFoodSize='" + (getMaxFoodSize() == -1 ? "UNKNOWN" :
                getMaxFoodSize()) +
                "'}";
    }
}
