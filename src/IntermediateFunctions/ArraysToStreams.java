package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStreams {

    public static void main(String[] args) {

        //array to stream

        int[] arr={1,2,3,4,5};
        IntStream intStream=Arrays.stream(arr);
        intStream.forEach(System.out::print);

        System.out.println();

        //wrapper class

        Integer[] ar={1,2,3,4,5};
        Stream<Integer> stream=Stream.of(ar);
        stream.forEach(System.out::print);

        System.out.println();


        //collections

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream()
                .forEach(System.out::print);











    }

}
