package Codes.stackAndQueue;

import java.util.*;


class Queue{

    int arr[];
    int size;
    int front;
    int rear;
    int cur;

    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
        cur=0;

    }

    public void add(int ele){

        if(cur==size){
            System.out.println("Queue overflow");
        }
        if(cur==0){
            front++;
            arr[front]=ele;
        }

        //make it circular
        rear=(rear+1)%size;
        arr[rear]=ele;
        cur++;
    }

    public int poll(){
        int el=0;
        if(cur==0){
            el=arr[front];
           return el;
        }
        if(cur==1){
            front--;
            rear--;
        }
        return el;
    }


}


public class QueueImplArray {

    public static void main(String[] args) {

        int n=6;
        Queue q=new Queue(n);




    }


}
