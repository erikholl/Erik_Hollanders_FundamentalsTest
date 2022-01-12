package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

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
        if (plantDietNullCheck(plantDiet)) {            // see help method
            Set<Plant> plantDietUnknown = new HashSet<>();
            plantDietUnknown.add(new Plant("UNKNOWN"));
            return plantDietUnknown;
        } else
            return plantDiet;
    }

    // help method if plantDiet is null (not entered)
    private boolean plantDietNullCheck(Set<Plant> plantDiet) {
        return plantDiet == null;
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
        return "Omnivore{name='" + getName() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", length='" + getLength() + '\'' +
                ", plantDiet=" + getPlantDiet() +
                ", maxFoodSize='" + getMaxFoodSize() + "'}";
    }
}
