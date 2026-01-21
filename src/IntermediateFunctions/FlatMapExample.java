package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<String>> lists=Arrays.asList(
                Arrays.asList("ritik","jalal"),
                Arrays.asList("aman","pachwari")
        );

        //flat map helps us for the above example
        //where the elements are istslef as list
        //so it will flat the map

        lists.stream()
                .flatMap(list->list.stream())
                .map(i->i.toUpperCase())
                .forEach(System.out::println);





    }

}
