import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class1 {

    public static Map<Object, Long> countOfElements(Object[] arr1){
        Map<Object,Long> map = Arrays.stream(arr1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        return map;
    }
}
