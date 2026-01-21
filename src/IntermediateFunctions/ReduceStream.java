package IntermediateFunctions;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {

    public static void main(String[] args) {


        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);


        //this reduce is a terminal operation
        //because it is giving result

        Integer sum=list.stream()
                .reduce(0,(a,b)->a+b);

        System.out.println(sum);



    }

}
