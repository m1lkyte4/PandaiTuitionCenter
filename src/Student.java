import java.util.*;
public class Student {
    private String name;
    private String ic;
    private String address;
    private int year;
    private String schoolName;
    private List<Integer> scores;

    public Student(String name, String ic, String address, int year, String schoolName, List<Integer> scores) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    // getters and setters for each attribute
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getIc(){
        return ic;
    }
    public void setIc(String ic){
        this.ic = ic;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public List<Integer> getScores(){
        return scores;
    }
    public void setScores(List<Integer> scores){
        this.scores = scores;
    }


    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public int getMinimumScore() {
        int min = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public String toString() {
        return "Student: " + name + " (" + ic + ")";
    }
}