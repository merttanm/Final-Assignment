/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import relationssystem.model.Adress;
import relationssystem.model.Company;


/**
 *
 * @author MERT
 */
public class FreightCompanyView {
    
     public void printCompanyDetail(Company company){
        System.out.println("NAKLİYECİ FİRMA BİLGİLERİ****************");
        System.out.println("NAKLİYECİ FİRMA KODU ***********" + company.getCompanyId());
        System.out.println("NAKLİYECİ FİRMA ********" +company.getCompanyName());
        System.out.println("NAKLİYECİ VERGİ NUMARASI ****" + company.getTaxNumber());
        System.out.println("NAKLİYECİ TELEFON NUMARASI ****" + company.getCompanyPhoneNumber());
        Adress adress = company.getCompanyAdress();
        System.out.println("ADRESİ " + adress.getCity() + " / " + adress.getDistrict() + "  " + adress.getStress() + "  " + adress.getApartment() + "  " + adress.getDoorNo());
    }
    
}
