package homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if(name.length()>=3)
        this.name=name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course>=1 && course<11)
        this.course=course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade>=1 && grade<11)
        this.grade=grade;
    }

    public void showInfo() {
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс студента: " + getCourse());
        System.out.println("Оценка студента: " + getGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Mike"));
        student.setCourse(3);
        student.setGrade(8.5);
        student.showInfo();
    }
}
