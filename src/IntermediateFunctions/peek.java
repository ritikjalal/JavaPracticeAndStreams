package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peek {

    public static void main(String[] args) {


        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);

        //peek is used to print the element of the stream

        List<Integer> list1=list.stream()
                .peek(System.out::println)
                .map(i->i*i)
                .collect(Collectors.toList());

        System.out.println(list1);

    }
}
