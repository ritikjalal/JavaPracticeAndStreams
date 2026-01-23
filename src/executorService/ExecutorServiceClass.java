package executorService;

import java.util.*;
import java.util.concurrent.*;

public class ExecutorServiceClass {

    public static void main(String[] args) {


        //creating a fixed size pool then we use executor service

        ExecutorService executorService= Executors.newFixedThreadPool(5);

        Runnable task=()->{
            System.out.println(Thread.currentThread().getName() + " is running");
        };

        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);


        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);


        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);

        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);

        executorService.shutdown();


    }

}
