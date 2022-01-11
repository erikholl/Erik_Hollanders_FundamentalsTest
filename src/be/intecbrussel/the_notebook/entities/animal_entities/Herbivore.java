package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.Set;

// COMPLETED
public class Herbivore extends Animal {
    private Set<Plant> plantDiet;
    // UML has unclear symbol for access level - I picked private (consistent
    // with Omnivore and other access level is not needed

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
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
        return "Herbivore: " +
                "name='" + getName() + '\'' +
                ", height='" + getWeight() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", length='" + getLength() + '\'' +
                ", plantDiet=" + plantDiet +
                ".";
    }
}
