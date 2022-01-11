package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.*;
import java.util.stream.Collectors;

// TODO: empty plantDiet
public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();

    private int plantCount = 0;     // initialize at 0 when notebook is created
    private int animalCount = 0;    //              ,,      ,,

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    // constructor
    public ForestNotebook() {
    }

    // getter / setter methods
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

    // other instance methods
    public void addAnimal(Animal animal) {
//
//        if (checkIfPlantDietIsEmpty(animal)) {
//            if (animal instanceof Herbivore) {
//                ((Herbivore) animal).setPlantDiet();
//            }
//        }
        if (!animalExistsAlreadyInNotebook(animal)) {   // see help method
            addToAnimalTypeList(animal);                // see help method
            animals.add(animal);
            animalCount++;
        } else {
            System.out.println("animal " + animal.getName() + " already " +
                                       "exists in your notebook");
        }
    }

    private boolean checkIfPlantDietIsEmpty(Animal animal) {
        boolean emptyPlantDiet = false;
        if (animal instanceof Herbivore) {
            emptyPlantDiet = ((Herbivore) animal).getPlantDiet() == null;
        }
        if (animal instanceof Omnivore) {
            emptyPlantDiet = ((Omnivore) animal).getPlantDiet() == null;
        }
        return emptyPlantDiet;
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

    public void addPlant(Plant plant) {
        convertNullValuesPlantToUnknown(plant);              // see help method
        if (!plantExistsAlreadyInNotebook(plant)) {     // see help method
            plants.add(plant);
            plantCount++;
        } else {
            System.out.println("plant " + plant.getName() + " already exists " +
                                       "in your notebook");
        }
    }

    private void convertNullValuesPlantToUnknown(Plant plant) {
        if (plant instanceof Tree && ((Tree) plant).getLeafType() == null) {
            ((Tree) plant).setLeafType(LeafType.UNKNOWN);
        }

        if (plant instanceof Bush && ((Bush) plant).getLeafType() == null) {
            ((Bush) plant).setLeafType(LeafType.UNKNOWN);
        }

        if (plant instanceof Flower && ((Flower) plant).getSmell() == null) {
            ((Flower) plant).setSmell(Scent.UNKNOWN);
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
        if (animals.size() == 0) {
            System.out.println("Your forest notebook contains no animals.");
        } else {
            System.out.println("Your forest notebook contains these animals:");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }

        if (plants.size() == 0) {
            System.out.println("Your forest notebook contains no plants.");
        } else {
            System.out.println("\nYour forest notebook contains these plants:");
            for (Plant plant : plants) {
                System.out.println(plant);
            }
        }
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName)); // a -> a.getName()
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName)); // p -> p.getName()
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }
}
