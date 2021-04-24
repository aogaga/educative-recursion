import static org.junit.jupiter.api.Assertions.*;

import adt.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListRecursionTest {
  LinkedListRecursion lr;
  SinglyLinkedList<Integer> sl;

  @BeforeEach
  void setUp() {
    lr = new LinkedListRecursion();
    sl = new SinglyLinkedList();
  }

  @Test
  void linkedListLengthTest(){
    sl.insertAtHead(5);
    sl.insertAtEnd(6);
    sl.insertAtHead(3);

    int sum = lr.linkedListLength(sl.headNode);
    assertEquals(sum, 3);
  }

  @Test
  void sumLinkedListTest(){
    sl.insertAtHead(5);
    sl.insertAtEnd(2);
    sl.insertAtHead(3);

    int sum = lr.sumLinkedList(sl.headNode);
    assertEquals(sum, 10);
  }

  @Test
  void findValInLinkedList(){
    sl.insertAtHead(5);
    sl.insertAtEnd(2);
    sl.insertAtHead(3);

    boolean result = lr.findValInLinkedList(sl.headNode, 3);
    assertEquals(result, true);

    boolean result2 = lr.findValInLinkedList(sl.headNode, 7);
    assertEquals(result2, false);
  }


  @Test
  void testReversePrintLinkedList(){

    sl.insertAtHead(5);
    sl.insertAtHead(4);
    sl.insertAtHead(3);
    sl.insertAtHead(2);
    sl.insertAtHead(1);

    lr.reversePrintLinkedList(sl.headNode);
  }

}