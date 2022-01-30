package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Optional;

public class Bush extends Plant {
    private String fruit = "UNKNOWN";
    private LeafType leafType;


    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public Optional<LeafType> getLeafType() {
        return this.leafType == null ? Optional.empty() : Optional.of(this.leafType);
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return
                "Bush{" + super.toString() +
                        ", fruit='" + getFruit() + '\'' +
                        ", leafType='" + (getLeafType().isPresent() ?
                        getLeafType().get() : "UNKNOWN") +
                        "'}";
    }
}
