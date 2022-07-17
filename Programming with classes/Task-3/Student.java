
public class Student {
    private final String fullName;
    private final String groupNumber;
    private final int[] marks;

    public Student(String fullName, String groupNumber, int[] marks) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public boolean isAllMarksMatch(int lowMark, int highMark) {
        for (int mark : marks) {
            if (mark < lowMark || mark > highMark) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
