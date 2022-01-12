package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet;
    // UML has unclear symbol for access level - private is consistent with
    // Omnivore / Carnivore

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        if (plantDietNullCheck(plantDiet)) {            // see help method
            Set<Plant> plantDietUnknown = new HashSet<>();
            plantDietUnknown.add(new Plant("UNKNOWN"));
            return plantDietUnknown;
        } else {
            return plantDiet;
        }
    }

    // help method if plantDiet is null (not entered)
    private boolean plantDietNullCheck(Set<Plant> plantDiet) {
        return plantDiet == null;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore{name='" + getName() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", length='" + getLength() + '\'' +
                ", plantDiet=" + getPlantDiet() + "}";
    }
}
