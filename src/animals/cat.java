package animals;

import mammal.animal;

public class cat extends animal {
    public cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " is meowing: Meow meow!");
    }
}