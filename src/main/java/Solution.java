
import java.util.*;

class Node {
  int value;
  Node left;
  Node right;
}


class Solution{

  public static void printallNodesLevelByLevel(Node root){
    Queue<Node> nodeQueue = new LinkedList<>();

    boolean direction = true;

    nodeQueue.add(root);

    while(nodeQueue != null){

      if(nodeQueue.size() == 1){

       Node tempNode =  nodeQueue.remove();
    System.out.println(tempNode.value);
       if(direction){
         nodeQueue.add(tempNode.right);
         nodeQueue.add(tempNode.left);
       }
      }

      List<Node> nodeList = new ArrayList<>();

      while(nodeQueue.size() != 0){
        nodeList.add(nodeQueue.remove());
      }


      for(Node t : nodeList){

        if(direction){
          nodeQueue.add(t.right);
          nodeQueue.add(t.left);
        }else {
          nodeQueue.add(t.left);
          nodeQueue.add(t.right);

        }

        System.out.println(t.value);
      }


    }

  }
}