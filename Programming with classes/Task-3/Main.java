import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Student> getStudentsWithRequiredMarks(List<Student> students, int lowMark, int highMark) {
        return students.stream().filter(student -> student.isAllMarksMatch(lowMark, highMark)).toList();
    }

    private static void printStudentWithRequiredMarks(List<Student> students, int lowMark, int highMark) {
        System.out.println(getStudentsWithRequiredMarks(students, lowMark, highMark));
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(10);
        students.add(new Student("Алексеев. И.А.", "050301", new int[]{ 9, 9, 9, 9, 9, 9, 9, 10}));
        students.add(new Student("Иванов. П.И.", "050601", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        students.add(new Student("Сидоров. Ж.К.", "053301", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        students.add(new Student("Александров. П.Т.", "150301", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        students.add(new Student("Алексеев. К.А.", "054301", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        students.add(new Student("Крыжовников. П.И.", "150301", new int[]{ 8, 8, 8, 6, 7, 8, 9, 10}));
        students.add(new Student("Евгеньев. Л.К.", "050301", new int[]{ 9, 9, 9, 9, 9, 9, 9, 10}));
        students.add(new Student("Остапчук. П.М.", "0531301", new int[]{ 9, 9, 9, 9, 9, 9, 9, 10}));
        students.add(new Student("Алексеев. И.Ж.", "052301", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        students.add(new Student("Алексеев. И.О.", "150304", new int[]{ 3, 4, 5, 6, 7, 8, 9, 10}));
        printStudentWithRequiredMarks(students, 9, 10);
    }
}
