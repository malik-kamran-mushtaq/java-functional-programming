//courses containing Spring 
//Lamda expression
import java.util.List;

public class FP07 {

    public static void main(String args[]){

        List<String> courses = List.of("Spring", "Spring Boot", "Microservices", "React", "API");
        System.out.println("Printing courses...");
        
        courses.stream()
            .filter(course -> course.contains("Spring"))
            .forEach(System.out::println);
    }

    
}
