package gr.aueb.sev.chapter17;

/*
public class Main {
    public static void main(String[] args) {
        */
/*Node head = new Node();
        head.setItem("Hello");
        int data = (int) head.getItem();

        System.out.println(data);*//*


        GenericNode<Integer> intNode = new GenericNode<>();
        GenericNode<Integer> intNode2 = new GenericNode<Integer>();

        GenericNode<String> strNode = new GenericNode<>();

        String s = strNode.getItem();

        Integer[] intArr = {1,2,3};
        String[] strArr = {"Hi1","Hi2"};

        printArray(intArr);
        printArray(strArr);

        print(intNode);
        //print(strNode);
    }

    public static <T> void printArray(T[] arr){
        for (T arrayItem : arr){
            System.out.println(arrayItem);
        }
    }

    public static void print(GenericNode<? extends Number> node){
        System.out.println(node.getItem());
    }
}
*/
public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.stackPush(1);
        myStack.stackPush(2);
        myStack.stackPush(3);

        int num = myStack.stackPop();
        System.out.println(num);

        myStack.forEach(System.out::println);
    }
}