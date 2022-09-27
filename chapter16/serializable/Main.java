package gr.aueb.sev.chapter16.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/test/trainee.ser"))) {

            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);
            System.out.println(alice.getName() + " serialized");

        } catch (FileNotFoundException | NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/test/trainee.ser")
        )) {

            Trainee alice;
            alice = (Trainee) ois.readObject();
            System.out.println(alice.getName() + " ");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
