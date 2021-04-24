package adt;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {


  public Stack<Integer> getMyStack(){
    Stack<Integer> mystack = new Stack<>();
    mystack.push(1);
    mystack.push(2);
    mystack.push(4);

    return mystack;
  }


  public Queue<Integer> getMyQueue(){
    Queue<Integer> myQueue = new LinkedList<>();
    myQueue.add(1);
    myQueue.add(2);
    myQueue.add(4);

    return myQueue;
  }
}
