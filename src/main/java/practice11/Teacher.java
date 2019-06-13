package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass>... classes) {
        super(id, name, age);
        if (classes.length > 0) {
            this.classes = classes[0];
            for (Klass aClass : this.classes) {
                aClass.attach(this);
            }
        } else {
            this.classes = new LinkedList<>();
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String ret = super.introduce().concat(" I am a Teacher. I teach ");
        if (this.classes.size() == 0) {
            ret = ret.concat("No Class");
        } else {
            int i = 0;
            for (Klass klass : this.classes) {
                ret = i == 0 ?
                        ret.concat(String.format("Class %d", klass.getNumber())) :
                        ret.concat(String.format(", %d", klass.getNumber()));
                i += 1;
            }
        }

        return ret.concat(".");
    }

    public String introduceWith(Student student) {
        String ret = super.introduce().concat(" I am a Teacher.");
        return this.classes.contains(student.getKlass()) ?
                ret.concat(String.format(" I teach %s.", student.getName())) :
                ret.concat(String.format(" I don't teach %s.", student.getName()));
    }

    public boolean isTeaching(Student student) {
        return this.classes.contains(student.getKlass());
    }

    public void update(Student student, boolean isLeader) {
        String str = isLeader ?String.format("I am %s. I know %s become Leader of Class %d.\n",
                this.getName(), student.getName(), student.getKlass().getNumber()) :
                String.format("I am %s. I know %s has joined Class %d.\n",
                this.getName(), student.getName(), student.getKlass().getNumber());
        System.out.print(str);
    }
}