import java.util.List;

public class FP04 {

    public static void main(String args[]){

        List<Integer> numbers = List.of(1,23,56,12,34,78,5,12);
        //printAllNumbers(numbers);
        System.out.println("Now the even numbers...");
        printEvenNumbers(numbers);
    }

    // private static boolean isEven(int n){
    //     return n % 2 == 0;
    // }

    // private static void printAllNumbers(List<Integer> num) {
        
    //     num.stream()                          
    //         .forEach(System.out::println);   
    // }

    private static void printEvenNumbers(List<Integer> num) {
        
        num.stream() 
            //.filter(FP04::isEven)                //we use filter 
            .filter(numbers -> numbers%2==0)   //Lamda expression             
            .forEach(System.out::println);   
    }
    
}