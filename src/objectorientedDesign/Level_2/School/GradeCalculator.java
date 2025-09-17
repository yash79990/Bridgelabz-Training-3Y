package objectorientedDesign.Level_2.School;

public class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        if (subjectCount == 0) {
            return "No subjects enrolled.";
        }

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        double average = (double) totalMarks / subjectCount;

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "D";
    }
}