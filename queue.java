import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Goal: To create a priority queue of generic pair items
 */

//create a generic comparable item
//  Based off of https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
class Pair<T> implements Comparable<Pair<T>>{
    T priority;
    T content;

    public Pair(T priority, T content){
        this.priority = priority;
        this.content = content;
    }

    //compare by typecasting generic priority as integers
    //and returning the result
    @Override
    public int compareTo(Pair p){
        Integer p1 = (Integer) this.priority;
        Integer p2 = (Integer) p.priority;
        return p1.compareTo(p2);
    }
}

//Actual queue class
public class queue<T>{
    //declare variables
    public static final Integer itemlength = 2;
    public static final Integer queuelength = 10;
    ArrayList<Pair> queue = new ArrayList<>();
    Integer priority;
    T content;

    /*
    priority queue needs the following methods
    1. enqueue
    2. dequeue
    3. peek
    4. poll
     */


    private void enQueue(Integer priority, String content){
        //add a new element pair to priority queue
        Pair np = new Pair(priority, content);
        queue.add(np);
    }

    private void dequeueStandard(){
        //remove next item from queue
        if(queue.size() > 0){
            queue.remove(0);
        } else {
            System.out.println("Queue is empty");
        }
    }

    private static void deuquePriority(Integer priority, String content){
        //remove item that matches above parameters
    }

    private static void peek(){
        //check next FIFO element
    }

    private static void view(){
        //check whole queue

    }

    //check if empty
    private boolean isEmpty(){
        return queue.size() > 0 ? false : true;
    }

    //private priority queue
    private static void newqueue(){


    }

    //print method
    private void print(){
        if(queue.size() > 0){
            for(int i = 0; i < queue.size(); i++){
                System.out.println("Priority: " + queue.get(i).priority + " Content: " + queue.get(i).content);
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    //main method
    public static void main(String[] args){
        queue<Pair> queue = new queue<>();
        queue.enQueue(1, "pain");
        queue.print();
        System.out.println(queue.isEmpty());
        queue.dequeueStandard();
        queue.print();
        System.out.println(queue.isEmpty());
    }
}
