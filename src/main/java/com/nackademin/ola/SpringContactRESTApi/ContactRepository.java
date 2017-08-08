package com.nackademin.ola.SpringContactRESTApi;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface ContactRepository extends CrudRepository<Contacts, Long> {
    List<Contacts> findAll();

    List<Contacts> findByLastNameContainingIgnoreCase(String lastName);
    //List<Contacts> findByFirstName(String lastName);
    List<Contacts> findByFirstNameContainingIgnoreCase(String lastName);
   // List<Contacts> findByFirstNameContainingIgnoreCaseAndfindByLastNameEquals(String search);
    List<Contacts> findByEmailContainingIgnoreCase(String search);
}