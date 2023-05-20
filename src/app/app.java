package app;

import mammal.mammal;
import animalinfo.info;
import animals.dog;
import animals.cat;

public class app {
    public static void main(String[] args) {
        dog dog = new dog("Xander");
        cat cat = new cat("Kufie");

        mammal dogInfo = new info(dog.name, 3);
        ((info) dogInfo).displayInfo();
        dogInfo.eat();
        dogInfo.sleep();
        dog.sound();

        System.out.println();

        mammal catInfo = new info(cat.name, 5);
        ((info) catInfo).displayInfo();
        catInfo.eat();
        catInfo.sleep();
        cat.sound();
    }
}