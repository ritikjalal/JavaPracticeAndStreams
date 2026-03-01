package Codes.stackAndQueue;

import java.util.*;


//to convert infix to prefix
//follow these steps
// reverse infix
//then infix to postfix
// reverse the postfix

//you will get the desired prefix conversion



class Solution1{


    public int priority(char c){

        if(c=='^') return 3;
        else if( (c=='*' ) ||  (c=='/' ) ) return 2;
        else return 1;

    }

    public String infixToPostFix(String s){

        System.out.println("string: "+ s);

        Stack<Character>st=new Stack<>();
        String ans="";

        for(char i: s.toCharArray()){
            if( (i>='A' && i<='Z') || (i>='a' && i<='z') || (i>='0' && i<='9') ){
                ans=ans+i;
            }
            else if( (i=='(')){
                st.push((char)i);
            }
            else if((i==')')){
                while(!st.isEmpty() && st.peek()!='('){
                    ans=ans+st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && priority(i) < priority(st.peek()) ){
                    ans=ans+st.peek();
                    st.pop();
                }
                st.push(i);

            }

        }

        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }

        return ans;


    }

    public String ReverseString(String s){

        char[] arr=s.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<j){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;

            i++;
            j--;
        }
        return new String(arr);

    }


}


public class InfixToPrefixConversion {

    public static void main(String[] args) {

        String s="(A+B)*C-D+F";

        Solution1 solution=new Solution1();

        String res=solution.ReverseString(s);
        System.out.println(res);

        String ans=solution.infixToPostFix(res);

        String res1=solution.ReverseString(ans);

        System.out.println(res1);


    }

}
