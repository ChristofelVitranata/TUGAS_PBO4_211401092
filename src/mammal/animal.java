package mammal;

public abstract class animal {
    public String name;

    public animal(String name) {
        this.name = name;
    }

    public abstract void sound();
}