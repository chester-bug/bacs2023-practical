/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

/**
 *
 * @author user1
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents ;
    private String[] studentNames = new String[100];
    private static int courseCount = 0;

    public Course(String courseTitle, double feesPerStudent, int noOfStudents) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        this.noOfStudents = noOfStudents;
        courseCount++;
    }
    
    public double calcFeesCollected(){
        return feesPerStudent*noOfStudents;
    }
    
    public void addStudent(String studName){
        studentNames[noOfStudents] = studName;
        noOfStudents++;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public static void setCourseCount(int courseCount) {
        Course.courseCount = courseCount;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-5.2f %-3d", courseTitle, feesPerStudent, noOfStudents);
    }
    
    

}
