package binary;

import java.io.Serializable;

public class Person implements Serializable {
    private String name, add;

    public Person(String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Person: " + name + " - " + add;
    }
}

