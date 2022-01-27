package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.EnumSet;
import java.util.Optional;

public class Flower extends Plant {
    private Scent smell;
    private Optional<Scent> optionalSmell;
    // I don't know where to start with this Optional - should i first
    // declare a normal Scent, then an Optional Scent and use the Optional
    // Scent in the getter in case there is no normal Scent given?

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        if (smell == null) {
            return Scent.UNKNOWN;
        } else {
            return smell;
        }
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
