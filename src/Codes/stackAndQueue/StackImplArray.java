package Codes.stackAndQueue;

import java.util.*;



//class Stack{
//
//    int arr[];
//    int size;
//    int top;
//
//    Stack(int size){
//        this.size=size;
//        arr=new int[size];
//        top=-1;
//    }
//
//    public void push(int ele){
//        if(top>=size) System.out.println("stack overflow");
//        arr[++top]=ele;
//    }
//
//    public void pop(){
//        if(top==-1) System.out.println("stack underflow");
//        top--;
//    }
//
//    public int peek(){
//        return arr[top];
//    }
//
//    public int size(){
//        return top+1;
//    }
//
//}
//
//public class StackImplArray {
//
//
//    public static void main(String[] args) {
//
//
//        int n=6;
//        Stack st=new Stack(n);
//
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//
//        System.out.println(st.size());
//
//        st.pop();
//
//        System.out.println(st.size());
//
//        System.out.println(st.peek());
//
//
//
//    }
//
//
//}
