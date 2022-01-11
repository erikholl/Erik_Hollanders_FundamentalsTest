package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        // create instance of Notebook
        ForestNotebook blackForestWk1 = new ForestNotebook();

        // create instances of plants, their specifics and add to notebook
        Tree willow = new Tree("Willow");
        willow.setLeafType(LeafType.SPEAR);
        blackForestWk1.addPlant(willow);

        Flower sunFlower = new Flower("Sunflower", 1.5);
        sunFlower.setSmell(Scent.MUSKY);
        blackForestWk1.addPlant(sunFlower);

        Weed licorice = new Weed("Licorice", 0.2);
        licorice.setArea(1.6);
        blackForestWk1.addPlant(licorice);

        Bush conifer = new Bush("Conifer", 1.8);
        conifer.setFruit("Red berries");
        conifer.setLeafType(LeafType.HEART);
        blackForestWk1.addPlant(conifer);

        Bush butterflyBush = new Bush("Butterfly Bush", 0.9);
        butterflyBush.setLeafType(LeafType.SPEAR);
        blackForestWk1.addPlant(butterflyBush);

        Tree walnutTree = new Tree("Walnut tree", 11.1);
        blackForestWk1.addPlant(walnutTree);

        // create a plantDiet for Herbivores (and Omnivores)
        Set<Plant> plantDiet1 = new HashSet<>();
        plantDiet1.add(licorice);
        plantDiet1.add(conifer);
        plantDiet1.add(butterflyBush);

        // create instances of animals, their specifics and add to notebook
        Herbivore mole = new Herbivore("Mole");
        mole.setPlantDiet(plantDiet1); // TODO: add diet in 1 go (loop)?
        blackForestWk1.addAnimal(mole);

        Herbivore rabbit = new Herbivore("Rabbit", 1.2, 0.3, 0.2);
        rabbit.setPlantDiet(plantDiet1);
        blackForestWk1.addAnimal(rabbit);

        Herbivore butterfly = new Herbivore("Butterfly", 0.003, 0.06, 0.08);
        butterfly.setPlantDiet(plantDiet1);
        blackForestWk1.addAnimal(butterfly);

        Carnivore vulture = new Carnivore("Vulture");
        vulture.setMaxFoodSize(0.5);
        blackForestWk1.addAnimal(vulture);

        Carnivore coyote = new Carnivore("Coyote", 12.4, 0.5, 0.8);
        coyote.setMaxFoodSize(1.1);
        blackForestWk1.addAnimal(coyote);

        Carnivore lynx = new Carnivore("Lynx", 17.0, 0.4, 0.9);
        coyote.setMaxFoodSize(0.6);
        blackForestWk1.addAnimal(lynx);

        Omnivore fox = new Omnivore("Fox");
        fox.setPlantDiet(plantDiet1);
        fox.setMaxFoodSize(0.5);
        blackForestWk1.addAnimal(fox);

        Omnivore bear = new Omnivore("Bear", 222.2, 2.2, 2.2);
        bear.setPlantDiet(plantDiet1);
        bear.setMaxFoodSize(2.2);
        blackForestWk1.addAnimal(bear);

        Omnivore owl = new Omnivore("Owl");
        owl.setPlantDiet(plantDiet1);
        owl.setMaxFoodSize(0.3030303);
        blackForestWk1.addAnimal(owl);

        // check if adding an animal already in the notebook will be blocked
        Carnivore lynx2 = new Carnivore("Lynx", 12.1, 0.3, 0.8);
        lynx2.setMaxFoodSize(0.6);
        blackForestWk1.addAnimal(lynx2);

        // check if adding a plant already in the notebook will be blocked
        Plant willow2 = new Tree("Willow");
        blackForestWk1.addPlant(willow2);

        // get / print # of animals & # of plants recorded in the notebook
        System.out.println("# of plants added: " + blackForestWk1.getPlantCount());
        System.out.println("# of animals added: " + blackForestWk1.getAnimalCount());
        System.out.println("------------------------------------------------");

        // print the notebook (not sorted)
        blackForestWk1.printNotebook();
        System.out.println("------------------------------------------------");

        // print Herbivores, Omnivores and Carnivores lists
        System.out.println(blackForestWk1.getHerbivores());
        System.out.println(blackForestWk1.getOmnivores());
        System.out.println(blackForestWk1.getCarnivores());
        System.out.println("------------------------------------------------");

        // sort animals and plants
        blackForestWk1.sortAnimalsByName();
        blackForestWk1.sortPlantsByName();

        // print the notebook, animals / plants sorted alphabetically on name
        blackForestWk1.printNotebook();
    }
}
