package IntermediateFunctions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class DistinctAndSorted {

    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,4,2,2,4,5,6,6,8);


        //helps in removing duplication

        list.stream()
                .distinct()
                .forEach(System.out::print);

        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

    }

}
