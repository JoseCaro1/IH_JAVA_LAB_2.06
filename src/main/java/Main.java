import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jose", 100);
        Student student2 = new Student("Alfonso", 30);
        Student student3 = new Student("Caro", 20);
        Student student4 = new Student("Romero", 50);

        HashMap<String, Student> stringStudentHashMap = new HashMap<>();

        stringStudentHashMap.put(student1.getName(), student1);
        stringStudentHashMap.put(student2.getName(), student2);
        stringStudentHashMap.put(student3.getName(), student3);
        stringStudentHashMap.put(student4.getName(), student4);

        Student.increaseGradeStudentsWithEntry(stringStudentHashMap);
        System.out.println(stringStudentHashMap.get("Caro").getGrade());


    }


}
