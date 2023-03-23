package be.technifutur.menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Menu extends Item {

    private Map<String, Item> itemMap = new LinkedHashMap<>();
    private MenuVue vue;

    public Menu(String label, MenuVue vue) {
        super(label);
        Objects.requireNonNull(vue);
        this.vue = vue;
    }

    public void setVue(MenuVue vue) {
        Objects.requireNonNull(vue);
        this.vue = vue;
    }

    public MenuVue getVue() {
        return vue;
    }

    public Item addItem(String key, Item value) {
        return itemMap.put(key, value);
    }

    public Item removeItem(String key, Item value) {
        return itemMap.remove(key);
    }

    @Override
    public void execute() {
        String choice = vue.getChoice(this);

        while(itemMap.containsKey(choice)){
            choice = vue.getChoice(this);
        }
        itemMap.get(choice).execute();


    }


    public Map<String, String> getItemText() {

        return this.itemMap.entrySet()
    }
}
