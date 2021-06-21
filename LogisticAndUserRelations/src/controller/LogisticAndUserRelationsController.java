/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import relationssystem.model.Car;
import relationssystem.model.Company;
import relationssystem.model.Contact;
import relationssystem.model.Customer;
import view.CarView;
import view.ContactView;
import view.CustomerView;
import view.FreightCompanyView;

/**
 *
 * @author MERT
 */
public class LogisticAndUserRelationsController {

    private Car car;
    private Customer customer;
    private Contact contact;
    private Company company;

    private CarView carView;
    private CustomerView customerView;
    private ContactView contactView;
    private FreightCompanyView freightCompanyView;

    public static LogisticAndUserRelationsController.Builder builder() {
        return new LogisticAndUserRelationsController.Builder();
    }

    public LogisticAndUserRelationsController(Car car, Customer customer ,Contact contact, Company company ,CarView carView ,CustomerView customerView ,ContactView contactView , FreightCompanyView freightCompanyView) {
        setCar(car);
        setCustomer(customer);
        setCompany(company);
        setContact(contact);
        setCarView(carView);
        setCustomerView(customerView);
        setContactView(contactView);
        setFreightCompanyView(freightCompanyView);
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCarView(CarView carView) {
        this.carView = carView;
    }

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
    }

    public void setFreightCompanyView(FreightCompanyView freightCompanyView) {
        this.freightCompanyView = freightCompanyView;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CarView getCarView() {
        return carView;
    }

    public CustomerView getCustomerView() {
        return customerView;
    }

    public Contact getContact() {
        return contact;
    }

    public Company getCompany() {
        return company;
    }


    public FreightCompanyView getFreightCompanyView() {
        return freightCompanyView;
    }


    public ContactView getContactView() {
        return contactView;
    }

    public void updateCarView() {
        carView.printCarDetail(car);
    }

    public void updateCustomerView() {
        customerView.printCustomerDetail(customer);
    }

    public void updateCompanyView() {
        freightCompanyView.printCompanyDetailView(company);
    }

    public void updateContactView() {
        contactView.printContactDetailView(contact);
    }

    public void setContactView(ContactView contactView) {
        this.contactView = contactView;
    }

    public static class Builder {

        private Car car;
        private Customer customer;
        private Contact contact;
        private Company company;

        private CarView carView;
        private CustomerView customerView;
        private ContactView contactView;
        private FreightCompanyView freightCompanyView;


        Builder() {
        }

        public Builder setContactView(ContactView contactView) {
            this.contactView = contactView;
            return this;
        }

        public Builder setFreightCompanyView(FreightCompanyView freightCompanyView) {
            this.freightCompanyView = freightCompanyView;
            return this;
        }

        public Builder setCompany(Company company) {
            this.company = company;
            return this;
        }

        public Builder setCarView(CarView carView) {
            this.carView = carView;
            return this;
        }
        public Builder setCustomerView(CustomerView customerView) {
            this.customerView = customerView;
            return this;
        }

        public Builder setCar(Car car) {
            this.car = car;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public LogisticAndUserRelationsController build() {
            return new LogisticAndUserRelationsController(this.car,this.customer, this.contact, this.company, this.carView,this.customerView, this.contactView, this.freightCompanyView);
        }

    }

}