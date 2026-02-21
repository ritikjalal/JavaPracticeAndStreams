package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DriverClass {


    public static void main(String[] args) {

//
//        TestClass t1=TestClass.getTestClassInstance();
//        TestClass t2=TestClass.getTestClassInstance();
//
//        System.out.println(t1);
//        System.out.println(t2);


        //now we will see for multithreading


        ExecutorService executorService= Executors.newFixedThreadPool(2);

        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());
        executorService.execute(()->TestClass.getTestClassInstance());



    }

}
