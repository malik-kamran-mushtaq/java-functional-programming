//all the courses 
//Lamda expression

//commented lines are also the way to do it
import java.util.List;

public class FP06 {

    public static void main(String args[]){

        List<String> courses = List.of("Spring", "Spring Boot", "Microservices", "React", "API");
        System.out.println("Printing courses...");
        //printCourses(courses);
        courses.stream()               
            .forEach(System.out::println);
    }

    // private static void printCourses(List<String> course) {
        
    //     course.stream()               
    //         .forEach(System.out::println);   
    // }
    
}
