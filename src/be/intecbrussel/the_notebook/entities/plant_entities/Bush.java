package be.intecbrussel.the_notebook.entities.plant_entities;

// COMPLETED
public class Bush extends Plant {
    private String fruit = "UNKNOWN";               // default value
    private LeafType leafType;
    // no default, following UML. if no leafType will be recorded in the
    // notebook, leafType and methods using leafType will return null...

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

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush: " +
                "name=" + getName() +
                ", height=" + getHeight() +
                ", fruit=" + fruit +
                ", leafType=" + leafType + " ";
    }
}
