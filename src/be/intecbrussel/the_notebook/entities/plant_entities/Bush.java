package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {
    private String fruit = "UNKNOWN";               // default: see explanation
    private LeafType leafType = LeafType.UNKNOWN;   // in Scent/LeafType enums


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
        return "Bush{name='" + getName() + '\'' +
                ", height='" + getHeight() + '\'' +
                ", fruit='" + getFruit() + '\'' +
                ", leafType='" + getLeafType() + "'}";
    }
}
