package practice06;

import javax.annotation.Nullable;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int... klass) {
        super(name, age);
        if (klass.length > 0) {
            this.klass = klass[0];
        }
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String ret = super.introduce().concat(" I am a Teacher. I teach");
        ret.concat(this.klass > 0 ? String.format("Class %d", this.klass) : "No Class");
        return ret;
    }
}
