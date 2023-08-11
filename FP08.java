//courses containing 4 letters
//Lamda expression
import java.util.List;

public class FP08 {

    public static void main(String args[]){

        List<String> courses = List.of("Spring", "Spring Boot", "Microservices", "React", "API");
        System.out.println("Printing courses...");
        
        courses.stream()
            .filter(course -> course.length() == 3)
            .forEach(System.out::println);
    }

    
}
