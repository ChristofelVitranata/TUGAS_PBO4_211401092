package animals;

import mammal.animal;

public class dog extends animal {
    public dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " is barking: Woof woof!");
    }
}