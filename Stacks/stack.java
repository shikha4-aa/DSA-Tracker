class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(top==arr.length){
            System.out.println("stack overflow");
        } else{
           top++;
            arr[top]= x;
             
        }
    }

    public int pop() {
        // Your Code
        int x=0;
        if(top == -1){
            return -1;
        } else{
             x = arr[top];
            top--;
        }
        return x;
    }
}