package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack_implementation {
    int size;
    int top;
    int stackarray[];
    public Stack_implementation()
    {
        size=10;
        top=-1;
        stackarray=new int[size];
    }
    public boolean isFull()
    {
        boolean response =false;
        if(stackarray[stackarray.length-1]!=0 && top==stackarray.length-1)
         response = true;
        return response;
    }
    public void push(int value)
    {
        if(! isFull() ) //checking the array is full or empty
        {
            top++;
            stackarray[top]=value;
        }
    }
    public int pop()
    {int response=0;
        if(!isEmpty())
        stackarray[top]=0;
    top--;
        return response;
    }
    boolean isEmpty()
    {boolean response =false;
     if(top ==-1)
         response=true;
     return response;
    }
    public  static  void main(String[] agrs)
    { Stack_implementation st=new Stack_implementation();
        for (int length = st.stackarray.length-1; length >= 0; length--) {
            System.out.println(st.stackarray[length]);
        }
        for(int i=0;i<10;i++){
        st.push(40+i);}
        System.out.println("-------");
        for (int length = st.stackarray.length-1; length >= 0; length--)
            System.out.println(st.stackarray[length]);
            st.pop();
                    st.pop();
            System.out.println("-------");
            for (int length = st.stackarray.length-1; length >= 0; length--) {
                System.out.println(st.stackarray[length]);

    }
}}
