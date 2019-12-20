package by.belhard.j19.homeworks.homework05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Wardrobe {

    private Clothes[] shelves;

    public Wardrobe(int shelvesNumber) {
        if (shelvesNumber < 1)
            return;

        this.shelves = new Clothes[shelvesNumber];
    }

    public void putOnShelf(Clothes clothes, int shelf) {

        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("Bad input");
            return;
        }

        if (shelves[shelf] == null)
            shelves[shelf] = clothes;
        else
            System.out.println("Busy");

    }

    public void throwInto(Clothes clothes) {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] == null)
                shelves[i] = clothes;
                System.out.println(clothes.getTitle() + " is throw into " + i + " shelf");
                return;
        }
        System.out.println("No free shelf");
    }

    public Clothes getFromShelf(int shelf) {

        Clothes result = null;

        if (shelf < 0 || shelf >= shelves.length) {
            System.out.println("Bad input");
            return null;
        } else if (shelves[shelf] == null) {
            System.out.println("empty shelf");
        } else {
            result = shelves[shelf];
            System.out.println("Get " + result.getTitle());
            shelves[shelf] = null;
        }
        return result;
    }

    public void lookInto() {
        System.out.println(" ------  WARD  ------");
        for (int i = 0; i < shelves.length; i++) {
//            System.out.println("", i, shelves[i].getTitle());
        }
    }

}
