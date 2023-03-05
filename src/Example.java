import java.util.*;
public class Example {
    public static void main(String[] args) {
        Tutor tutor1 = new Tutor("John Doe", "T001", "1 Main St", "PhD", 5, new Date(), 2);
        Tutor tutor2 = new Tutor("Jane Smith", "T002", "2 Elm St", "MSc", 3, new Date(), 1);
        List<Tutor> tutors = Arrays.asList(tutor1, tutor2);

        Student student1 = new Student("Alice Lee", "S001", "3 Oak St", 2022, "ABC School", Arrays.asList(80, 90, 85));
        Student student2 = new Student("Bob Tan", "S002", "4 Maple St", 2022, "XYZ School", Arrays.asList(75, 70, 80));
        List<Student> students = Arrays.asList(student1, student2);

        HeadMaster headMaster = new HeadMaster("Mary Lim", "H001", "5 Pine St");

        TuitionCenter center = new TuitionCenter("6 Walnut St", headMaster, tutors, students);

        PandaiTuitionCentre pandai = new PandaiTuitionCentre();
        pandai.addCenter(center);

        System.out.println("Number of students: " + pandai.getNumberOfStudents());
        System.out.println("Number of tutors: " + pandai.getNumberOfTutors());
        System.out.println("Average score: " + pandai.getAverageScore());
        System.out.println("Minimum score: " + pandai.getMinimumScore());
        System.out.println("Tutors: " + pandai.getTutors());
    }
}