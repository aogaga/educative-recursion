import adt.Node;
import adt.SinglyLinkedList;

public class LinkedListRecursion {
  public int linkedListLength(Node<Integer> node){
    if(node == null){
      return 0;
    }

    return  1 + linkedListLength(node.nextNode);

  }

  public int sumLinkedList(Node<Integer> node){
    if(node == null){
      return 0;
    }
    return node.data + sumLinkedList(node.nextNode);
  }


  public boolean findValInLinkedList(Node<Integer> node, int num){
    if(node == null){
      return  false;
    }

    if(node.data == num){
      return true;
    }else{
      return findValInLinkedList(node.nextNode, num);
    }
  }

  public void reversePrintLinkedList(Node<Integer> node){

    if(node == null){
      return ;
    }

    Node tempNode = node.nextNode;
    reversePrintLinkedList(tempNode);
    System.out.println(node.data);
  }

}
