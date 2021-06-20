/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationssystem.model;

/**
 *
 * @author MERT
 */
public class Company {

    private String companyId;
    private Adress companyAdress;
    private String companyName;
    private Long taxNumber;
    private String companyPhoneNumber;
    private int numberOfVehicles;     // Şirketin Araçlarının kaç aracı var  
    private int numberOfTruck;         // bunlar hangi türde araç ve bu araçların 
    private int numberOfvan;            // rezervasyonlu olanları hakkında işlemler için bana gerekli
    private boolean carTypeTruck;

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public int getNumberOfTruck() {
        return numberOfTruck;
    }

    public void setNumberOfTruck(int numberOfTruck) {
        this.numberOfTruck = numberOfTruck;
    }

    public int getNumberOfvan() {
        return numberOfvan;
    }

    public void setNumberOfvan(int numberOfvan) {
        this.numberOfvan = numberOfvan;
    }

    public boolean isCarTypeTruck() {
        return carTypeTruck;
    }

    public void setCarTypeTruck(boolean carTypeTruck) {
        this.carTypeTruck = carTypeTruck;
    }

    public boolean isCarTypevan() {
        return carTypevan;
    }

    public void setCarTypevan(boolean carTypevan) {
        this.carTypevan = carTypevan;
    }
    private boolean carTypevan;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Adress getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(Adress companyAdress) {
        this.companyAdress = companyAdress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Long taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

}
