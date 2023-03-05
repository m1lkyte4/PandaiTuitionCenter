import java.util.List;
public class TuitionCenter {
    private String physicalAddress;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String physicalAddress, HeadMaster headMaster, List<Tutor> tutors, List<Student> students) {
        this.physicalAddress = physicalAddress;
        this.headMaster = headMaster;
        this.tutors = tutors;
        this.students = students;
    }

    // getters and setters for each attribute
    public String getPhysicalAddress(){
        return physicalAddress;
    }
    public void setPhysicalAddress(String physicalAddress){
        this.physicalAddress = physicalAddress;
    }

    public HeadMaster getHeadMaster() {
        return headMaster;
    }
    public void setHeadMaster(HeadMaster headMaster){
        this.headMaster = headMaster;
    }

    public List<Student> getStudents(){
        return students;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }


    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfTutors() {
        return tutors.size();
    }

    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    public int getMinimumScore() {
        int min = Integer.MAX_VALUE;
        for (Student student : students) {
            int studentMin = student.getMinimumScore();
            if (studentMin < min) {
                min = studentMin;
            }
        }
        return min;
    }
    public List<Tutor> getTutors() {
        return tutors;
    }

    public String toString() {
        return "Tuition Center: " + physicalAddress;
    }

}
