package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapStreams {

    public static void main(String[] args) {


        List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7,8);

        //here filter is predicate function and acts as gate like conditinal check

        arr.stream()
                .filter(n->n%2==0)
                .forEach(System.out::print);


        System.out.println();

        //map will act as transformer it will transform state of the elemnt

        List<String> strings=Arrays.asList("ritik","mango","banana","tea");

        strings.stream()
                .map(name->name.toUpperCase())
                .forEach(System.out::println);




    }

}
