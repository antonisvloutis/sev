package gr.aueb.sev.chapter14;

public class ItemDemo {
    public static void main(String[] args) {
        Item book = new Book();
        Item cd = new CompactDisc();

        deliver(book);
        deliver(cd);

    }
    public static void deliver(Item item){
        if(item instanceof Book){
            System.out.println(item);
        }else if (item instanceof CompactDisc){
            System.out.println(item);
        }else {
            throw new AssertionError(item);
        }
    }
}
