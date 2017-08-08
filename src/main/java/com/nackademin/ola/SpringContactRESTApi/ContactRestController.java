package com.nackademin.ola.SpringContactRESTApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {

    @Autowired
    private ContactRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Contacts> getAll(@RequestParam(value = "firstname", required = false) String search) {
        if (search == null) {
            return repo.findAll();
        } else {
            return repo.findByFirstNameContainingIgnoreCase(search);
        }
    }

    //Search by email
    @RequestMapping(value = "search")
    public List<Contacts> getSearch(@RequestParam(value = "email", required = false) String search) throws Exception{

        if(search==null){
            return repo.findAll();
        }else{
            return repo.findByEmailContainingIgnoreCase(search);
        }
     }

    @RequestMapping(method = RequestMethod.POST)
    public Contacts create(@RequestBody Contacts contact) {
        return repo.save(contact);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable Long id) {
        repo.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public Contacts update(@PathVariable Long id, @RequestBody Contacts contact) {
        Contacts update = repo.findOne(id);
        update.setAddress(contact.getAddress());
        update.setEmail(contact.getEmail());
        update.setFirstName(contact.getFirstName());
        update.setLastName(contact.getLastName());
        update.setTelephone(contact.getTelephone());
        return repo.save(update);
    }

}