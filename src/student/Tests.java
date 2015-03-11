package student;

/**
 * Created by student on 11.03.2015.
 */
public class Tests {
    public static void main(String[] args) {
        Student vasya=new Student("Vladimir","красная площадь мовзалей");
        System.out.println(vasya);
        vasya.addCourseGrade("физика", 5);
        vasya.addCourseGrade("фиqwewзика",4);
        vasya.addCourseGrade("физasdика",3);
        vasya.printGrade();
        System.out.println(vasya.getAverageGrate());
        System.out.println(vasya);

    }
}
