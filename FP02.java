import java.util.List;

public class FP02 {

    public static void main(String args[]){
        printAllNumbers(List.of(1,23,56,12,34,78,5,12));
    }

    // private static void print(int number){
    //     System.out.println(number);
    // }

    private static void printAllNumbers(List<Integer> num) {
        
        // for(int n:num){
        //     System.out.println(n);
        // }
        num.stream()                          //convert the num into a stream and then call the print() method of FP02 class
            .forEach(System.out::println);   //Method reference


    }
    
}
