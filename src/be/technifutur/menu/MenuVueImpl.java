package be.technifutur.menu;

import java.util.Map;
import java.util.Scanner;

public class MenuVueImpl implements MenuVue{

        private Scanner sc = new Scanner(System.in);
    @Override
    public String getChoice(Menu menu) {
        Map<String,String > testMenu = menu.getItemText();
        choice = sc.nextLine();
        return null;
    }
}
