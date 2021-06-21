/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import relationssystem.model.Adress;
import relationssystem.model.Car;
import relationssystem.model.Company;

/**
 *
 * @author MERT
 */
public class FreightCompanyView {

    public void printCompanyDetailView(Company company) {
        System.out.println("NAKLİYECİ FİRMA BİLGİLERİ****************");
        System.out.println("NAKLİYECİ FİRMA KODU ***********" + company.getCompanyId());
        System.out.println("NAKLİYECİ FİRMA ********" + company.getCompanyName());
        System.out.println("NAKLİYECİ VERGİ NUMARASI ****" + company.getTaxNumber());
        System.out.println("NAKLİYECİ TELEFON NUMARASI ****" + company.getCompanyPhoneNumber());
        Adress adress = company.getCompanyAdress();
        System.out.println("ADRESİ " + adress.getCity() + " / " + adress.getDistrict() + "  " + adress.getStress() + "  " + adress.getApartment() + "  " + adress.getDoorNo());
        System.out.println("ŞİRKETİN ARAÇ BİLGİLERİ ********");
        if(company.getCompanyCar()!=null){
          Car car = company.getCompanyCar();
       
            System.out.println("    ARAÇ MARKA   :"  + car.getName());
            System.out.println("    ARAÇ MODEL   :"  + car.getModel());
            System.out.println("    ARAÇ RENK    :"  + car.getColor());
            System.out.println("    ARAÇ PLAKA   :"  +car.getPlate());
        }
        else
            System.out.println("null");
          
        

    }

}
