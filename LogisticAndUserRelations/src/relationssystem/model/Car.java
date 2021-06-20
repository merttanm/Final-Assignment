/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationssystem.model;

import java.math.BigDecimal;

/**
 *
 * @author MERT
 */
public class Car extends Vehicle{ /// Abstract Factory patterns

    private Integer numDay;
    private Integer numWeek;
    private Integer numMonth;
    private CarType carType;
    private String plate;
    private Integer saseNo;
    private AutomotivFuel automotivFuel;
    private Company companyName;

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public AutomotivFuel getAutomotivFuel() {
        return automotivFuel;
    }

    public void setAutomotivFuel(AutomotivFuel automotivFuel) {
        this.automotivFuel = automotivFuel;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    public double getWeeklyCost() {
        return weeklyCost;
    }

    public void setWeeklyCost(double weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public Integer getNumDay() {
        return numDay;
    }

    public void setNumDay(Integer numDay) {
        this.numDay = numDay;
    }

    public Integer getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(Integer numMonth) {
        this.numMonth = numMonth;
    }

    public Integer getNumWeek() {
        return numWeek;
    }

    public void setNumWeek(Integer numWeek) {
        this.numWeek = numWeek;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getSaseNo() {
        return saseNo;
    }

    public void setSaseNo(Integer saseNo) {
        this.saseNo = saseNo;
    }

    @Override
    public double calcRentPrice() {
        return (super.dailyCost * numDay) + (super.weeklyCost * numWeek) + (super.monthlyCost * numMonth);
    }

    @Override
    public boolean isCarReserved() {
        if (super.isIsReseved()) {
            return true;
        } else {
            return false;
        }
    }

    public void setCompanyName(String companyName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
