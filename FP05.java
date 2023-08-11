//odd numbers 
//Lamda expression
import java.util.List;

public class FP05 {

    public static void main(String args[]){

        List<Integer> numbers = List.of(1,23,56,12,34,78,5,12);
        System.out.println("Now the odd numbers...");
        printOddNumbers(numbers);
    }

    private static void printOddNumbers(List<Integer> num) {
        
        num.stream()  
            .filter(numbers -> numbers%2!=0)   //Lamda expression             
            .forEach(System.out::println);   
    }
    
}
