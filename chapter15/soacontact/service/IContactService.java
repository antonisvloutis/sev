package gr.aueb.sev.chapter15.soacontact.service;

import gr.aueb.sev.chapter15.soacontact.dto.ContactDTO;
import gr.aueb.sev.chapter15.soacontact.model.Contact;
import gr.aueb.sev.chapter15.soacontact.service.exception.ContactAlreadyExistsException;
import gr.aueb.sev.chapter15.soacontact.service.exception.ContactNotExistsException;

import java.util.List;
import java.util.Optional;

public interface IContactService {

    boolean insertContact(ContactDTO contactDTO) throws ContactAlreadyExistsException;
    Optional<Contact> updateContact(ContactDTO contactDTO) throws ContactNotExistsException;
    void deleteContact(long id) throws ContactNotExistsException;
    List<Contact> getAllContacts();
    Optional<Contact> getOneContact(long id) throws ContactNotExistsException;
}
