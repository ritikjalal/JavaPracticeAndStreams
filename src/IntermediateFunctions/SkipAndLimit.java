package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SkipAndLimit {

    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> list1=list.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println(list1);


        List<Integer> list2=list.stream()
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(list2);



    }
}
