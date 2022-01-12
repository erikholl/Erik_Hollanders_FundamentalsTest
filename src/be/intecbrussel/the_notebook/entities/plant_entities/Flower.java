package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {
    private Scent smell = Scent.UNKNOWN;    // default: see explanation in

    // Scent/LeafType enums
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
        return "Flower{name='" + getName() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", smell='" + getSmell() + "'}";
    }
}
