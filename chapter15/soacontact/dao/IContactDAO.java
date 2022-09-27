package gr.aueb.sev.chapter15.soacontact.dao;

import gr.aueb.sev.chapter15.soacontact.model.Contact;

import java.util.List;
import java.util.Optional;

public interface IContactDAO {
    boolean insert(Contact contact);
    Optional <Contact> update(Contact contact);
    boolean delete(long id);
    List<Contact> getAll();
    Optional<Contact> getOne(long id);
}
