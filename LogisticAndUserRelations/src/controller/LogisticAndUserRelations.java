/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import relationssystem.model.Car;
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
public class LogisticAndUserRelations {

    private Car car;
    private Customer customer;
    private Contact contact;

    private CarView carView;
    private CustomerView customerView;
    private ContactView contactView;
    private FreightCompanyView reservationView;

    public LogisticAndUserRelations(Car car, CarView carView) {
        this.car = car;
        this.carView = carView;
    }

    public LogisticAndUserRelations(CustomerView customerView) {
        this.customerView = customerView;
    }

    public LogisticAndUserRelations(Contact contact, ContactView contactView) {
        this.contact = contact;
        this.contactView = contactView;
    }

    public LogisticAndUserRelations() {
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

    public Contact getReservation() {
        return contact;
    }

    public void setReservation(Contact contact) {
        this.contact = contact;
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

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
    }

    public ContactView getReservationView() {
        return contactView;
    }

    public void setReservationView(ContactView contactView) {
        this.contactView = contactView;
    }

    public void updateCarView() {
        carView.printCarDetail(car);
    }

    public void updateCustomerView() {
        customerView.printCustomerDetail(customer);
    }

    public void updateRezervaionView() {
        contactView.printContactDetailView(contact);
    }

}
