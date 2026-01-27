package completableFuture;

import java.util.Objects;
import java.util.concurrent.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuturePractice {

    public static void main(String[] args) throws Exception{


        //introduce in java 8 to handle the async programming
        //it return the completable future thing

       CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
           return "Hello World";
       });

        System.out.println(completableFuture.get());


        //one strongest feature of the completabale future is chaining of task

        CompletableFuture<Integer> integerCompletableFuture=CompletableFuture.supplyAsync(()->{
            return 10;
        });


        //now we will do async task
        // thenApplyAsync() allows chaining task
        //thenAccept() consume the result

        integerCompletableFuture.thenApplyAsync(result->{
            return result+10;
        }).thenApplyAsync(result->{
            return result*100;
        }).thenAccept(result->{
            System.out.println(result);
        });



        //we can use allOf() and anyOf() to run two completbale future task

        CompletableFuture<Integer> task1=CompletableFuture.supplyAsync(()->{
            return 10;
        });

        CompletableFuture<Integer> task2=CompletableFuture.supplyAsync(()->{
            return 20;
        });


        CompletableFuture<Void> result=CompletableFuture.allOf(task1,task2);

        result.thenRun(()->{

            try{
                System.out.println(task1.get() + task2.get());
            }catch (Exception e){
                throw new RuntimeException();
            }

        });


        // anyOf() returns the result when any of the task is completed

        CompletableFuture<Object> result2=CompletableFuture.anyOf(task1,task2);

        result2.thenAccept(index->{
            System.out.println(index);
        });


        // thenCombine(), thenApply(), thenCompose()


        task2.thenCombine(task1,(task1result,task2result)->task1result-task2result)
                .thenAccept((diff)-> System.out.println(diff));




        //to control the concurrency and manage number
        //of threads we use custom executor

        ExecutorService executorService=Executors.newFixedThreadPool(2);

        CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
            System.out.println("task running");
        },executorService);

        future.join();
        executorService.shutdown();






    }

}
