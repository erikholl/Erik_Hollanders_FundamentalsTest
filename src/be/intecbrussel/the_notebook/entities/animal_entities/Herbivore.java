package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Optional;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Optional<Set<Plant>> getPlantDiet() {
        return this.plantDiet == null ? Optional.empty() :
                Optional.of(this.plantDiet);
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
        return "Herbivore{" + super.toString() +
                ", plantDiet=" + (getPlantDiet().isPresent() ?
                getPlantDiet().get() : "UNKNOWN") + "}";
    }
}
