package com.phonebook.phonebook.services;

import com.phonebook.phonebook.entity.Contact;
import com.phonebook.phonebook.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    ContactRepo repo;

    public List<Contact> getAllContact(){
        return repo.findAll();
    }

    public Contact addNewContact(Contact contact){
        return repo.save(contact);
    }

    public void deleteAllContacts(){
        repo.deleteAll();
    }

    public Contact getContactById(Long id){
        return repo.findContactById(id);
    }

    public void deleteContactById(Long id){
        repo.deleteById(id);
    }

    public Contact editContact(Long id, Contact contactUpdated){
        Contact contactToUpdate = repo.findContactById(id);
        contactToUpdate.setName(contactUpdated.getName());
        contactToUpdate.setPhoneNumber(contactUpdated.getPhoneNumber());
        repo.save(contactToUpdate);
        return contactToUpdate;
    }
}
