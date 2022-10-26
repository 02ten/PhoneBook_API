package com.phonebook.phonebook.controllers;

import com.phonebook.phonebook.entity.Contact;
import com.phonebook.phonebook.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class RestContact {
    @Autowired
    private ContactService contactService;

    @GetMapping()
    public List<Contact> getAllContacts(){
        return contactService.getAllContact();
    }

    @PostMapping()
    public Contact addContact(@RequestBody Contact contact){
        return contactService.addNewContact(contact);
    }

    @DeleteMapping()
    public void deleteAllContacts(){
        contactService.deleteAllContacts();
    }
    @GetMapping("/{id}")
    public Contact getContact(@PathVariable("id") Long id){
        return contactService.getContactById(id);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable("id") Long id, @RequestBody Contact contact){
        return contactService.editContact(id,contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Long id){
        contactService.deleteContactById(id);
    }

}
