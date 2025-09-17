package objectorientedDesign.Level_2.School;


public class SchoolResultDemo {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John");

        // Add subjects
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        // Create grade calculator
        GradeCalculator calculator = new GradeCalculator();

        // Calculate and print grade
        String grade = calculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println(" - " + s.getName() + ": " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
