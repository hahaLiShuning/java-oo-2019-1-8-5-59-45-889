package practice09;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass... klass) {
        super(id, name, age);
        if (klass.length > 0) {
            this.klass = klass[0];
        }
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String ret = super.introduce().concat(" I am a Teacher. I teach ");
        return ret.concat(this.klass != null && this.klass.getNumber() > 0 ?
                String.format("Class %d.", this.klass.getNumber()) : "No Class.");
    }

    public String introduceWith(Student student) {
        String ret = super.introduce().concat(" I am a Teacher.");
        return ret.concat(this.klass != null && this.klass.getNumber() == student.getKlass().getNumber() ?
                String.format(" I teach %s.", student.getName()) :
                String.format(" I don't teach %s.", student.getName()));
    }
}