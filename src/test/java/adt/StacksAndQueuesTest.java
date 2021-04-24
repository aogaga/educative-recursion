package adt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import java.util.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StacksAndQueuesTest {

  private  StacksAndQueues st;
  @BeforeEach
  void setUp() {
    st = new StacksAndQueues();
  }



  @Test
  void getMyStackTest(){
    Stack<Integer> myStack = st.getMyStack();
    assertEquals(myStack.size(), 3);

    myStack.pop();
    assertEquals(myStack.size(), 2);
  }

  @Test
  void getMyQueueTest(){
    Queue<Integer> qq = st.getMyQueue();
    assertEquals(qq.size(), 3);
  }

}