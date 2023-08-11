import java.util.List;

public class FP01Structured{
    public static void main(String args[]){
        printAllNumbers(List.of(1,23,56,12,34,78,5,12));
    }

    private static void printAllNumbers(List<Integer> num) {
        for(int n:num){
            System.out.println(n);
        }

    }
}