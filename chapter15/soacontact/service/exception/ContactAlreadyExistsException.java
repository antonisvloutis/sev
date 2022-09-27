package gr.aueb.sev.chapter15.soacontact.service.exception;

import gr.aueb.sev.chapter15.soacontact.model.Contact;

public class ContactAlreadyExistsException extends Exception{
    public ContactAlreadyExistsException(Contact contact){
        super("Contact with id = " + contact.getId() + " already exists");

    }
}
