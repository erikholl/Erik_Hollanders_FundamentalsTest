package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Optional;

public class Flower extends Plant {
    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Optional<Scent> getSmell() {
        return this.smell == null ? Optional.empty() :
                Optional.of(this.smell);
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return
                "Flower{" + super.toString() +
                        ", smell='" + (getSmell().isPresent() ? getSmell().get() :
                        "UNKNOWN") +
                        "'}";
    }
}
