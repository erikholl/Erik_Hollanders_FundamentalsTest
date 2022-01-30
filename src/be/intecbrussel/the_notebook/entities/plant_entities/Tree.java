package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Optional;

public class Tree extends Plant {
    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
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
                "Tree{" + super.toString() +
                        ", leafType='" + (getLeafType().isPresent() ?
                        getLeafType().get() : "UNKNOWN") +
                        "'}";
    }
}
