package be.intecbrussel.the_notebook.entities.plant_entities;

// COMPLETED
public class Flower extends Plant {
    private Scent smell;
    // no default, following UML. if no smell will be recorded in the
    // notebook, smell and methods using smell will return null...

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower: " +
                "name=" + getName() +
                ", height=" + getHeight() +
                ", smell=" + smell + " ";
    }
}
