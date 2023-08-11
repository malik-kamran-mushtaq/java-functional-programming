//map function
//squares of even numbers 
//Lamda expression
import java.util.List;

public class FP09 {

    public static void main(String args[]){

        List<Integer> numbers = List.of(1,2,5,12,4,8,5,13);
        System.out.println("Now the squares of even numbers...");
        printSquaresOfEvenNumbers(numbers);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> num) {
        
        num.stream()             
            .filter(numbers -> numbers%2==0) 
            .map(number -> number * number)              
            .forEach(System.out::println);   
    }
    
}