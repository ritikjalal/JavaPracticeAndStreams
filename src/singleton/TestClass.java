package singleton;

public class TestClass {


    private static volatile TestClass testClassInstance=null;

    private TestClass(){
        System.out.println("created once");
    }

    public  static TestClass getTestClassInstance() {
        if (testClassInstance == null){
            synchronized (TestClass.class) {
                //this concept is called doubleChecking
                if(testClassInstance==null)
                    testClassInstance = new TestClass();
            }
        }

        return testClassInstance;
    }

}
