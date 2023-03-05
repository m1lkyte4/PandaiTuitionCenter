import java.util.*;

public class PandaiTuitionCentre {
    private List<TuitionCenter> centers;

    public PandaiTuitionCentre() {
        centers = new ArrayList<>();
    }

    public void addCenter(TuitionCenter center) {
        centers.add(center);
    }

    public void removeCenter(TuitionCenter center) {
        centers.remove(center);
    }

    public int getNumberOfStudents() {
        int sum = 0;
        for (TuitionCenter center : centers) {
            sum += center.getNumberOfStudents();
        }
        return sum;
    }

    public int getNumberOfTutors() {
        int sum = 0;
        for (TuitionCenter center : centers) {
            sum += center.getNumberOfTutors();
        }
        return sum;
    }

    public double getAverageScore() {
        double sum = 0;
        int count = 0;
        for (TuitionCenter center : centers) {
            List<Student> students = center.getStudents();
            if (!students.isEmpty()) {
                sum += center.getAverageScore() * students.size();
                count += students.size();
            }
        }
        return sum / count;
    }

    public int getMinimumScore() {
        int min = Integer.MAX_VALUE;
        for (TuitionCenter center : centers) {
            int centerMin = center.getMinimumScore();
            if (centerMin < min) {
                min = centerMin;
            }
        }
        return min;
    }

    public List<Tutor> getTutors() {
        List<Tutor> result = new ArrayList<>();
        for (TuitionCenter center : centers) {
            result.addAll(center.getTutors());
        }
        return result;
    }
}
