package com.company;

/**
 * Created by mihailkopchev on 3/25/18.
 */
public class Model {
    String name;
    int value;

    public Model(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model)) return false;

        Model model = (Model) o;

        if (value != model.value) return false;
        return name.equals(model.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
