package gr.aueb.sev.chapter15.soacontact.service;

import gr.aueb.sev.chapter15.soacontact.dao.ContactDAOImpl;
import gr.aueb.sev.chapter15.soacontact.dao.IContactDAO;
import gr.aueb.sev.chapter15.soacontact.dto.ContactDTO;
import gr.aueb.sev.chapter15.soacontact.model.Contact;
import gr.aueb.sev.chapter15.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.sev.chapter15.soacontact.service.exception.ContactNotExistsException;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final IContactDAO contactDAO = new ContactDAOImpl();
    private static final IContactService service = new ContactServiceImpl(contactDAO);

    public static void main(String[] args) {
        int choice = 0;
        ContactDTO contactDTO;

        do{
            printMenu();
            choice=getChoice();
            switch (choice) {
                case 1:
                    try {
                        contactDTO = new ContactDTO(getId(), getFirstName(), getLastName());
                        service.insertContact(contactDTO);
                    } catch (ContactAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        long id = getId();
                        service.deleteContact(id);
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        contactDTO = new ContactDTO(getId(), getFirstName(), getLastName());
                        Optional<Contact> optionalContact = service.updateContact((contactDTO));
                        optionalContact.ifPresent(c -> System.out.println("Old contact " + c + " was updated"));
                    } catch (ContactNotExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        long id = getId();
                        Optional<Contact> contact = service.getOneContact(id);
                        contact.ifPresent(System.out::println);
                    }catch (ContactNotExistsException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    List<Contact> contacts = service.getAllContacts();
                    contacts.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο. ");
                    break;
                default:
                    System.out.println("Επιλέξτε 1 - 6: ");
                    break;
            }
        }while(choice != 6);
    }
    public static void printMenu(){
        System.out.println("Επιλέξτε ένα απο τα παρακάτω: ");
        System.out.println("1. Εισαγωγή επαφής");
        System.out.println("2. Διαγραφή επαφής");
        System.out.println("3. Ενημέρωση επαφής");
        System.out.println("4. Αναζήτηση επαφής");
        System.out.println("5. Εκτύπωση επαφών");
        System.out.println("6. Έξοδος");
    }
    public static int getChoice(){
        String s = in.next();
        if (isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    public static String getFirstName(){
        System.out.println("Εισάγετε όνομα: ");
        return in.next();
    }

    public static String getLastName(){
        System.out.println("Εισάγετε επώνυμο: ");
        return in.next();
    }

    public static int getId(){
        System.out.println("Εισάγετε κωδικό: ");
        String s = in.next();
        if(isInt(s)) return Integer.parseInt(s);
        return -1;
    }

    private static boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
