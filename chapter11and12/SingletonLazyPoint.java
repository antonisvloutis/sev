package gr.aueb.sev.chapter11and12;

public class SingletonLazyPoint {
    private int x;
    private int y;

    private static SingletonLazyPoint SP;

    private SingletonLazyPoint() {}

    public static SingletonLazyPoint getInstance(){
        if (SP == null){
            SP = new SingletonLazyPoint();
        }

        return SP;
    }
}
