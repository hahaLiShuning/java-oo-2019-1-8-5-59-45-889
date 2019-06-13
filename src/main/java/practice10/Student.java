package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String ret = super.introduce().concat(" ".concat("I am a Student."));

        return ret.concat(" ".concat(this.klass.getLeader() == this ?
                String.format("I am Leader of Class %d.", this.klass.getNumber()) :
                String.format("I am at Class %d.", this.klass.getNumber())));
    }
}
