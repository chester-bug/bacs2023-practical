/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5;

/**
 *
 * @author user1
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("English", 1000, 0);
        
        course.addStudent("Ahmad");
        course.addStudent("Ali");
        course.addStudent("Meow");
        
        System.out.println(course);
        
        course.toString();
        System.out.println("Total fees collected: " + course.calcFeesCollected());
        
        String[] newStudentNames = course.getStudentNames();
        for(int i = 0 ; i < course.getNoOfStudents(); i++){
            System.out.println(newStudentNames[i]);
        }
    }
}
