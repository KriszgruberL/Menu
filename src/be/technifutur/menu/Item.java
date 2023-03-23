package be.technifutur.menu;

import java.util.Objects;

public abstract class Item {
    private final String label;
    private boolean actif = true;

    public Item(String label) {
        if (label == null | label.isBlank()) {
            throw new IllegalArgumentException("Label cannot be displayed");
        }
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public abstract void execute();
}
