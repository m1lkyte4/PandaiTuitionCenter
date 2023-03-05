import java.util.*;

public class Tutor {
    private String name;
    private String id;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private Date dateJoined;
    private int yearsInTheCenter;

    public Tutor(String name, String id, String address, String qualification, int yearsOfExperience, Date dateJoined, int yearsInTheCenter) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateJoined = dateJoined;
        this.yearsInTheCenter = yearsInTheCenter;
    }

    // getters and setters for each attribute
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int YearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    public Date getDateJoined(){
        return dateJoined;
    }
    public void setDateJoined(Date dateJoined){
        this.dateJoined = dateJoined;
    }

    public int getYearsInTheCenter(){
        return yearsInTheCenter;
    }
    public void setYearsInTheCenter(int yearsInTheCenter){
        this.yearsInTheCenter = yearsInTheCenter;
    }

    public String toString() {
        return "Tutor: " + name + " (" + id + ")";
    }

}
