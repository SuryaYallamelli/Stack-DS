// Custom implementation.
// Stack Data Structure.
import java.util.*;

class stackDS{

  public static class Node{
   int data;
   Node next;

   // constructor
   Node(int data){
    this.data = data;
    next = null;
   }
  }

  // --> Stack data Structure implemented using linked list

  public static class Stack{
    static Node head = null;

    // push method
    public static void push(int data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public static boolean isEmpty(){
    return head == null;
    }

    // pop method
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      Node top = head;
      top = head;
      head = head.next;
      return top.data;
    }

    // peek method
    public static int peek(){
      if(isEmpty()){
        return -1;
      }
      Node top = head;
      return top.data;
    }
  }

  
  // --> Slack data structure implemented using Arraylist
  static class stack{

    ArrayList<Integer> list = new ArrayList<>();

    public Node head = null;

    // Method to push elements
    public void push(int data){

      list.add(data);
    }

    public boolean isEmpty(){
      return list.size() == 0;
      }

    // Method to pop elements
    public int pop(){

      if(isEmpty()){
        return -1;
      }

      int top = list.remove(list.size()-1);
      return top;
    }

    // Method to peek elements
    public int peek(){
      if(isEmpty()){
        return -1;
      }
      return list.get(list.size()-1);
    }
  }

  // main method
  public static void main(String[] args){

    // --> Invoking Stack class created using Linkedlist

    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    while(!stack.isEmpty()){
      System.out.println(stack.peek());
      stack.pop();
    }

    // --> Invoking stack class created using Arraylist

    stack lst = new stack();

    lst.push(1);
    lst.push(4);
    lst.push(3);

    while(!lst.isEmpty()){
      System.out.println(lst.peek());
      lst.pop();
    }

  }
}
