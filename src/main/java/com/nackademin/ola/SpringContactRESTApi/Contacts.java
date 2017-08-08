package com.nackademin.ola.SpringContactRESTApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacts {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private String telephone;


        public Contacts(){

        }

        public Contacts(String firstName, String lastName, String address, String email, String telephone) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
                this.email = email;
                this.telephone = telephone;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getTelephone() {
                return telephone;
        }

        public void setTelephone(String telephone) {
                this.telephone = telephone;
        }
}
