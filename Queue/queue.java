//Link: https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1
class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(rear== arr.length){
            System.out.println("queue overflow");
            
        } else{
            arr[rear]= x;
            rear++;
        }
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        // Your code here
        if(rear==front){
            return -1;
        } else {
            int x = arr[front];
            front++;
            return x;
        }
    }
}