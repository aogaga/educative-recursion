package adt;

public class SinglyLinkedList<T> {

  public Node headNode;
  public int size;

  public SinglyLinkedList(){
    headNode = null;
    size = 0;
  }

  public boolean isEmpty(){
    return (headNode == null);
  }

  public void insertAtHead(T data){
    Node newNode = new Node();
    newNode.data = data;

    newNode.nextNode = headNode;
    headNode = newNode;
    size++;
  }

  public void printList(){
    if(isEmpty()){
        System.out.println("List is Empty");
        return;
    }

    Node temp = headNode;
    System.out.print("List : ");

    while(temp.nextNode != null){
      System.out.print(temp.data.toString() + " -> " );
      temp = temp.nextNode;
    }
    System.out.println(temp.data.toString() + " -> null ");

  }

  public void insertAtEnd(T data){
    if(isEmpty()){
      insertAtHead(data);
      return;
    }

    Node newNode = new Node();
    newNode.data = data;
    newNode.nextNode = null;

    Node last = headNode;

    while (last.nextNode != null){
      last = last.nextNode;
    }

    last.nextNode = newNode;
    size++;
  }
}
