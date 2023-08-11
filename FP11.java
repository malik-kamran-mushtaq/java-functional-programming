//courses containing Spring 
//Lamda expression
import java.util.List;

public class FP11 {

    public static void main(String args[]){

        List<String> courses = List.of("Spring", "Spring Boot", "Microservices", "React", "API");
        System.out.println("Printing courses...");
        
        courses.stream()
            .map(course ->course+ " "+ course.length())
            .forEach(System.out::println);
    }

    
}
