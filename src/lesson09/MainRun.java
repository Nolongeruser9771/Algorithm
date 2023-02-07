package lesson09;

import java.util.Stack;

public class MainRun {
    public static void main(String[] args) {
//        myArrayStack myStack = new myArrayStack(3);
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.show();
//
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//
//        myArrayQueue myQueue = new myArrayQueue(3);
//        myQueue.push(1);
//        System.out.println(myQueue.count());
//        myQueue.push(2);
//        System.out.println(myQueue.count());
//        myQueue.push(3);
//        System.out.println(myQueue.count());
//        myQueue.push(4);
//        System.out.println(myQueue.count());
//        myQueue.show();
//
//        myQueue.pop();
//        System.out.println(myQueue.count());
//        myQueue.show();
//        myQueue.pop();
//        System.out.println(myQueue.count());
//        myQueue.show();
//        myQueue.pop();
//        System.out.println(myQueue.count());
//        myQueue.show();

//        myLinkedListStack myLinkedListStack = new myLinkedListStack();
//
//        myLinkedListStack.push(1);
//        myLinkedListStack.push(2);
//        myLinkedListStack.push(3);
//        myLinkedListStack.push(4);
//
//        myLinkedListStack.pop();
//        myLinkedListStack.show();
//        myLinkedListStack.pop();
//        myLinkedListStack.show();
//        myLinkedListStack.pop();
//        myLinkedListStack.show();
//        myLinkedListStack.pop();
//        myLinkedListStack.show();
//
//        myLinkedListQueue myLinkedListQueue = new myLinkedListQueue();
//
//        myLinkedListQueue.push(1);
//        myLinkedListQueue.push(2);
//        myLinkedListQueue.push(3);
//        myLinkedListQueue.show();
//
//        myLinkedListQueue.pop();
//        myLinkedListQueue.show();
//        myLinkedListQueue.pop();
//        myLinkedListQueue.show();
//        myLinkedListQueue.pop();
//        myLinkedListQueue.show();
//        myLinkedListQueue.pop();
//        myLinkedListQueue.show();

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        for (Integer i:myStack) {
            System.out.println(i + "; ");
        }

        System.out.println("Pop: " + myStack.peek());
        System.out.println("Pop: " + myStack.peek());
        System.out.println("Pop: " + myStack.peek());

        for (Integer i:myStack) {
            System.out.println(i + "; ");
        }

        System.out.println(myStack.isEmpty());
    }
}
