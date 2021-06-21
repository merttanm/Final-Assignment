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

    public LogisticAndUserRelationsController(Car car, CarView carView) {
        this.car = car;
        this.carView = carView;
    }

    /*  ------Değiştim------
    public LogisticAndUserRelationsController(CustomerView customerView) {
        this.customerView = customerView;
    } 
     */
    // Builder pattern kullandım
    public static Builder builder() {
        return new LogisticAndUserRelationsController.Builder();
    }

    public LogisticAndUserRelationsController(Company company, FreightCompanyView freightCompanyView) {
        this.company = company;
        this.freightCompanyView = freightCompanyView;
    }

    public LogisticAndUserRelationsController(Contact contact, ContactView contactView) {
        this.contact = contact;
        this.contactView = contactView;
    }

    public LogisticAndUserRelationsController() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CarView getCarView() {
        return carView;
    }

    public void setCarView(CarView carView) {
        this.carView = carView;
    }

    public CustomerView getCustomerView() {
        return customerView;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public FreightCompanyView getFreightCompanyView() {
        return freightCompanyView;
    }

    public void setFreightCompanyView(FreightCompanyView freightCompanyView) {
        this.freightCompanyView = freightCompanyView;
    }

    public void setFreightCompanyView(Company company) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
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

    public void setContactView(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setContactView(ContactView contactView) {
        this.contactView = contactView;
    }

    public static class Builder {

        private final LogisticAndUserRelationsController instance = new LogisticAndUserRelationsController();

        private Builder() {
        }

        public Builder from(CustomerView customerView) {
            instance.customerView = customerView;
            return this;
        }

        public LogisticAndUserRelationsController build() {
            return instance;
        }
    }

}
