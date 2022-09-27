package gr.aueb.sev.chapter10;

import jdk.internal.util.xml.impl.Input;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductsDemo {
    static String[] products = new String[100];
    static int top = -1;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        String inputName = "";
        String inputNewName = "";
        do{
            printMenu();
            choice = getChoice();

            switch (choice){
                case 1:
                    inputName = getName().trim();
                    insert(products,inputName);
                    break;
                case 2:
                    inputName = getName().trim();
                    //System.out.printf("Item%sexists",(itemExists(inputName)) ? "" : " does not ");
                    break;
                case 3:
                    inputName = getName().trim();
                    inputNewName = getName().trim();
                    replace(products,inputName,inputNewName);
                    break;
                case 4:
                    inputName = getName();
                    delete(products,inputName);
                    break;
                case 5:
                    //copy basket
                    break;
                case 6:
                    printItem(products);
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Επιλέξτε 1 -7");
                    break;
            }
        }while(choice != 7);
    }
    public static void insert(String[] arr, String name){
        if(arr == null || name == null) return;
        if(name.equals("")) return;

        if(getPosition(arr,name) == -1){
            top++;
            arr[top] = name;
        }else{
            System.out.println("Item already exists.");
        }
    }
    public static int getPosition(String[] arr,String name){
        if(arr == null || name == null) return -1;
        if(name.equals("")) return -1;

        for(int i = 0;i <= top; i++){
            if(arr[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static void replace(String[] arr, String oldName, String newName){
        if(arr == null || newName == null) return;
        if(newName.equals("")) return;

        int positionToUpdate = getPosition(arr,oldName);
        if(positionToUpdate == -1) {
            System.out.println("Item not found.");
        }else {
            arr[positionToUpdate] = newName;
        }
    }
    public static String delete(String[] arr, String name){
        if(arr == null || name == null) return "";
        if(name.equals("")) return "";

        int positionToDelete = getPosition(arr,name);
        String toBeReturned = "";

        if(positionToDelete == -1){
            System.out.println("Item not found");
        }else{
            toBeReturned = arr[positionToDelete];
            System.arraycopy(arr,positionToDelete + 1, arr ,positionToDelete, (top-positionToDelete));
            top--;

        }
        return toBeReturned;
    }
    public static boolean itemExists(String[] arr,String name){
        return(getPosition(arr,name) != -1);
    }
    public static void printMenu(){
        System.out.println("Choose one of the below: ");
        System.out.println("1.Εισαγωγή προϊόντος");
        System.out.println("2.Αναζήτηση προϊόντος");
        System.out.println("3.Ενημέρωση προϊόντος");
        System.out.println("4.Διαγραφή προϊόντος");
        System.out.println("5.Αντιγραφή καλαθιού");
        System.out.println("6.Εμφάνιση καλαθιού");
        System.out.println("7.Έξοδος");
    }
    public static int getChoice(){
        try{
            return in.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Παρακαλώ δώστε έγκυρη τιμή: ");
            return -1;
        }
    }
    public static String getName(){
        System.out.println("Δώστε όνομα: ");
        return in.next();
    }
    public static void printItem(String[] arr){
        for(int i = 0 ;i <= top; i++){
            System.out.println(arr[i]);
        }
    }
}
