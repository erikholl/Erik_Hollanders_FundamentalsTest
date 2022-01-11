package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    private int plantCount = 0;     // initialize at 0 when notebook is created
    private int animalCount = 0;    //              ,,      ,,

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook() {
    }
    // following UML - however, as this is default constructor, it can also
    // be left out of the code

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) {
        if (!animalExistsAlreadyInNotebook(animal)) {   // see help method
            addToAnimalTypeList(animal);                // see help method
            animals.add(animal);
            animalCount++;
        } else {
            System.out.println("animal " + animal.getName() + " already " +
                                       "exists in your notebook");
        }
    }

    public void addPlant(Plant plant) {
        if (!plantExistsAlreadyInNotebook(plant)) {     // see help method
            plants.add(plant);
            plantCount++;
        } else {
            System.out.println("plant " + plant.getName() + " already exists " +
                                       "in your notebook");
        }
    }

    // help method - returns 'true' if animal name already exists
    private boolean animalExistsAlreadyInNotebook(Animal animal) {
        List<String> animalNameList = animals.stream()
                .map(Animal::getName) // in lambda: o -> o.getName()
                .collect(Collectors.toList());
        return animalNameList.contains(animal.getName());
    }

    // help method - checks AnimalType and adds to correct AnimalType list
    private void addToAnimalTypeList(Animal animal) {
        if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        } else if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        }
    }

    // help method - returns 'true' if plant name already exists
    private boolean plantExistsAlreadyInNotebook(Plant plant) {
        List<String> plantNameList = plants.stream()
                .map(Plant::getName)
                .collect(Collectors.toList());
        return plantNameList.contains(plant.getName());
    }

    public void printNotebook() {
        System.out.println("Your forest notebook contains these animals...:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("\n...and these plants:");
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName)); // a -> a.getName()
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName)); // p -> p.getName()
    }

    public void sortAnimalsByHeight() {

    }

    public void sortPlantsByHeight() {

    }
}
