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
