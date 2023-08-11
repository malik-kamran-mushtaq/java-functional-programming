//Optional class in java

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP12 {
    public static void main(String args[]) {

        List<String> fruits = List.of("apple", "mango", "banana", "pineapple", "watermelon", "kiwi");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get());

        Optional<String> fruit = Optional.of("Dragon fruit");
        Optional<String> empty = Optional.empty();
    }
    
}
