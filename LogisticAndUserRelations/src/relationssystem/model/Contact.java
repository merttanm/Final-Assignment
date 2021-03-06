/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationssystem.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MERT
 */
public class Contact {

    private Customer customer;
    private Company company;
    private List<Car> carList;
    private Date rezervBeginDate;
    private Date rezervEndDate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void setRezervBeginDate(Date rezervBeginDate) {
        this.rezervBeginDate = rezervBeginDate;
    }

    public void setRezervEndDate(Date rezervEndDate) {
        this.rezervEndDate = rezervEndDate;
    }

    public Date getRezervBeginDate() {
        return rezervBeginDate;
    }

    public Date getRezervEndDate() {
        return rezervEndDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
