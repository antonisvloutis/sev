package gr.aueb.sev.chapter16.cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");
        City clonedAthens = athens.clone();

        Trainee alice = new Trainee("Alice",athens);
        Trainee clonedAlice = alice.clone();
        clonedAlice.setCity(new City("Volos"));

        /*clonedAthens.setDescription("Athens2");*/

        System.out.println(alice);
        System.out.println(clonedAlice);

    }
}
