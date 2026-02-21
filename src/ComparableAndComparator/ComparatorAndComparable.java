package ComparableAndComparator;

import TerminalOperations.Collect;

import java.util.*;

class Employee{

    private int id;
    private String name;
    private double salary;
    private int age;

    Employee(int id,String name,double salary,int age){
        this.id=id;
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    @Override
    public String toString(){
        return id+" "+name+" "+age+" "+salary;
    }

}

class CustomSorting{


    //Sort Integers in Descending Order
    public void arraySorting(){

        List<Integer> nums=Arrays.asList(1,2,3,4,5);

        //lambda
        nums.sort((a,b)->b-a);

        System.out.println(nums);
    }


    //Sort strings based on length
    public void stringLengthSorting(){

        List<String> names = Arrays.asList("Ritik", "Java", "SpringBoot", "API");

        //ascending
        names.sort(Comparator.comparing(String::length));
        System.out.println(names);

        //desecnding
        names.sort(Comparator.comparing(String::length).reversed());
        System.out.println(names);


        names.sort(Comparator.comparing(String::toString));
        System.out.println(names);
    }



}


class salarySortCustomObject implements Comparator<Employee>{

    //sort salary descending
    @Override
    public int compare(Employee e1, Employee e2){
        return Double.compare(e2.getSalary(), e1.getSalary());

        //-1 e1<e2
        //0 equals
        //1 e2>e1
    }


}


class AgeSortThenSalary implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2){
        int age=Integer.compare(e1.getAge(),e2.getAge());

        if(age!=0){
            return age;
        }

        return Double.compare(e2.getSalary(), e1.getSalary());

    }


}




public class ComparatorAndComparable {

    public static void main(String[] args) {



        CustomSorting customSorting=new CustomSorting();

        customSorting.arraySorting();

        customSorting.stringLengthSorting();


        List<Employee> employees= new ArrayList(
                List.of(
                new Employee(1,"ritik",23.0,14),
                new Employee(2,"ayush",24.0,23),
                new Employee(1,"aman",25.0,34)
                )
        );


        Collections.sort(employees,new salarySortCustomObject());

        System.out.println(employees);


        List<Employee> employees1= new ArrayList(
                List.of(
                        new Employee(1,"ritik",23.0,14),
                        new Employee(2,"ayush",24.0,23),
                        new Employee(1,"aman",25.0,34),
                        new Employee(1,"punit",26.0,14)

                )
        );

        Collections.sort(employees1,new AgeSortThenSalary());
        System.out.println(employees1);





    }

}
