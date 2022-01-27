package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet;
    // optional: should i make the plant Optional? or, the Diet Optional? it
    // is the Diet that is being documented (or not documented), so i think
    // the Set<Plant> should be an Optional<Set<Plant>> (and not a
    // Set<Optional<Plant>. But how?? Additional variable, Optional? Or, use
    // Optional in getter of plantDiet? or setter? where oh where, how oh how?

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet = new HashSet<>(); // added later, after feedback Manuel.
        // makes sense to initialize the plantDiet with the construction of a
        // new Herbivore
    }

    public Set<Plant> getPlantDiet() {
        if (plantDietNullCheck(plantDiet)) {            // see help method
            Set<Plant> plantDietUnknown = new HashSet<>();
            plantDietUnknown.add(new Plant("UNKNOWN"));
            return plantDietUnknown;
        } else return plantDiet;
    }

    // help method if plantDiet is null (not entered)
    private boolean plantDietNullCheck(Set<Plant> plantDiet) {
        return plantDiet == null;
    }

        public void setPlantDiet (Set<Plant> plantDiet) {
            this.plantDiet = plantDiet;
        }

        public void addPlantToDiet (Plant plant){
            plantDiet.add(plant);
        }

        public void printDiet () {
            plantDiet.forEach(System.out::println);
        }

        @Override
        public String toString () {
            return "Herbivore{name='" + getName() + '\'' +
                    ", weight='" + getWeight() + '\'' +
                    ", height='" + getHeight() + '\'' +
                    ", length='" + getLength() + '\'' +
                    ", plantDiet=" + getPlantDiet() + "}";
        }
    }
