package Codes.stackAndQueue;

import java.util.*;


class ImplementStackMin{

    Stack<Integer> st;
    Stack<Integer> minstack;

    public ImplementStackMin(){
        st=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int ele){

        st.push(ele);

        if(minstack.isEmpty() || ele<minstack.peek()){
            minstack.push(ele);
        }

    }

    public void pop(){

        int val=st.peek();

        if(val==minstack.peek()) minstack.pop();

        st.pop();

    }

    public int getMin(){
        return minstack.peek();
    }

}


public class ImplementMinStack {

    public static void main(String[] args) {

        ImplementStackMin stackMin=new ImplementStackMin();

        stackMin.push(5);
        stackMin.push(-2);
        stackMin.push(0);
        stackMin.push(-3);

        System.out.println(stackMin.getMin());

        stackMin.pop();

        System.out.println(stackMin.getMin());

    }

}
