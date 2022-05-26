import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException();
        }
        this.grade = grade;
    }

    public static void increaseGradeStudents(HashMap<String, Student> studentHashMap) {
        for (Student student :
                studentHashMap.values()) {
            if (student.getGrade() + student.getGrade() / 10 < 100) {
                student.setGrade(student.getGrade() + student.getGrade() / 10);
            }
        }
    }

    public static void increaseGradeStudentsWithEntry(HashMap<String, Student> studentHashMap) {
        for ( Map.Entry<String,Student> valor:
                studentHashMap.entrySet()) {
            if (valor.getValue().getGrade() + valor.getValue().getGrade() / 10 < 100) {
                valor.getValue().setGrade(valor.getValue().getGrade() + valor.getValue().getGrade() / 10);
            }
        }
    }


}

