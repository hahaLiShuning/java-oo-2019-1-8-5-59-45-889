package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> list;

    public Klass(int number) {
        this.number = number;
        this.list = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader) {
        if (this.list.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        if (!this.list.contains(student)) {
            this.list.add(student);
        }
    }


    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }
}