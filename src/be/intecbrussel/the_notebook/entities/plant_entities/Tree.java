package be.intecbrussel.the_notebook.entities.plant_entities;

// COMPLETED
public class Tree extends Plant {
    private LeafType leafType;
    // no default, following UML. if no leafType will be recorded in the
    // notebook, leafType and methods using leafType will return null...

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree: " +
                "name=" + getName() +
                ", height=" + getHeight() +
                ", leafType=" + leafType + " ";
    }
}
