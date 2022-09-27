package gr.aueb.sev.chapter14;

public class Lion extends AbstractAnimal{

    public Lion(){
        setId(1);
        setName("YellowLion");
        setAge(10d);
    }


    @Override
    public void speak() {
        System.out.println("Lion says hello");
    }

    @Override
    public String toString() {
        return "(" + getId() + "," + getName() + "," + getAge() + ")";
    }
}
