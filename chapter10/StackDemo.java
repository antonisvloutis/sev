package gr.aueb.sev.chapter10;

public class StackDemo {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        Integer num;
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        num = pop();
        printStack();
        System.out.println("Popped: "+num );
    }

    public static void push(int num){
        if(!isFull()){
            top++;
            stack[top] = num;
            //stack[++top] = num;
        }else{
            System.out.println("Stack is full.");
        }
    }

    /**
     * Pops out the last element of the stack
     *
     * @return an Integer or null if stack is empty
     */
    public static Integer pop(){
        return(!isEmpty()) ? stack[top--] : null;
    }
    public static boolean isFull(){
        return(top == stack.length-1);
    }
    public static boolean isEmpty(){
        return(top == -1);
    }
    public static void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
}
