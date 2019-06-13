package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList;
    private List<Teacher> teacherList;

    public Klass(int number) {
        this.number = number;
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student leader) {
        if (this.studentList.contains(leader)) {
            this.leader = leader;
            this.notifyTeacher(leader, true);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        if (!this.studentList.contains(student)) {
            this.studentList.add(student);
            student.setKlass(this);
            this.notifyTeacher(student, false);
        }
    }

    public void attach(Teacher teacher) {
        teacherList.add(teacher);
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }

    public void notifyTeacher(Student student, boolean isLeader) {
        for (Teacher teacher : this.teacherList) {
            teacher.update(student, isLeader);
        }
    }
}