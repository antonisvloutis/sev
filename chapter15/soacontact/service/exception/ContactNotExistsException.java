package gr.aueb.sev.chapter15.soacontact.service.exception;

import gr.aueb.sev.chapter15.soacontact.model.Contact;

public class ContactNotExistsException extends Exception {
    public ContactNotExistsException(Contact contact){
        super("Contact with id = " + contact.getId() + " not exists");
    }
    public ContactNotExistsException(long id){
        super("Contact with id = " + id + " not exists");
    }
}
