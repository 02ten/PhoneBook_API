package com.phonebook.phonebook.repo;

import com.phonebook.phonebook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Long> {
    Contact findContactById(Long id);
}
