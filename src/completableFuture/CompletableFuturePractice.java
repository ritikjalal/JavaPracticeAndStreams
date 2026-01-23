package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePractice {

    public static void main(String[] args) {


        //introduce in java 8 to handle the async programming
        //it return the completable future thing

        CompletableFuture<String> completableFuture1=CompletableFuture.supplyAsync(()->{
            try {

                Thread.sleep(5000);
                System.out.println("woker thread");

            } catch (Exception e) {

            }
            return "ok";
        });

        //if we have to make this thread run means worker one we have
        //to use the

        String s=null;
        try {
            s=completableFuture1.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s);


        System.out.println("main thread");

    }

}
