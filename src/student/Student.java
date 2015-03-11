package student;

import java.util.Arrays;

/**
 * Created by student on 11.03.2015.
 */
public class Student {
    private static final int MAX_COURSES=30;
    private String name;
    private String address;
    private int numCourses;
    private String[] courses=new String[MAX_COURSES];
    private int[] grades=new int[MAX_COURSES];

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.numCourses=0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\n' +
                ", address='" + address + '\n' +
                ", numCourses=" + numCourses +'\n' +
                '}';
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses]=course;
        grades[numCourses]=grade;
        numCourses++;

    }
    public void printGrade() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(grades[i]+ "");
        }
    }
    public double  getAverageGrate(){
        int sum=0;
        for (int i = 0; i < numCourses; i++) {
            sum+=grades[i];
        }
        return sum/numCourses;
    }

}
