package be.intecbrussel.the_notebook.entities.plant_entities;

public enum Scent {
    SWEET,
    ORANGE,
    PINEAPPLE,
    MUSKY,
    EARTHY,
    SOUR,
    UNKNOWN // * see note
}

/* *
In my interpretation of the forest notebook, if desired, plants can be
added to the notebook without adding their scent, leaf-type and/or fruit.
Therefore, even though NOT part of the UML, I've added 'UNKNOWN' to the
Scent and LeafType enums. This to replace the ugly 'null' value.
 */

