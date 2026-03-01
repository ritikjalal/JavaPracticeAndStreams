package Codes.stackAndQueue;

import java.util.*;


//priority of operator downwards

// ^
// * /
// + -

class Solution{

    public int priority(char c){

        if(c=='^') return 3;
        else if( (c=='*' ) ||  (c=='/' ) ) return 2;
        else return 1;

    }

    public String infixToPostFix(String s){

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

}

public class InfixToPostfixInversion {

    public static void main(String[] args) {

        String s="a+b*(c^d-e)";

        Solution solution=new Solution();

        String res=solution.infixToPostFix(s);

        System.out.println(res);


    }

}
