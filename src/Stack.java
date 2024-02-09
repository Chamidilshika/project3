public class Stack {

    private int top;
    private String[] arr;
    private int capacity;

    public Stack(int size){
        arr = new String [size];
        capacity = size;
        top = -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(String x){
        if (isFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        else{
            top++;
            arr [top] = x;
        }
    }
    public String pop(){
        if (isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        return arr[top--];
    }
}
