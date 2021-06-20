/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationssystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import relationssystem.model.Car;
import relationssystem.model.Contact;
import relationssystem.model.Customer;

/**
 *
 * @author MERT
 */
public class LogisticAndUserRelations {

    private List<Car> carList = new ArrayList<Car>();
    private List<Customer> customerList = new ArrayList<Customer>();
    private List<Contact> contactList = new ArrayList<Contact>();
    
    public static void main(String[] args) throws IOException {
    
        LogisticAndUserRelations  logisticAndUserRelations = new LogisticAndUserRelations();
        
        System.out.println("E Naklet Nakletmenin en kolay yolu");
        while(true){
        
            System.out.println("    1- Nakliyeci Listesi");
            System.out.println("    2- Müşteri Listesi");
            System.out.println("    3- Sana Uygun Nakliyeciler");
            System.out.println("    4- Araç Ekle");
            System.out.println("    5- Müşteri Ekle");
            System.out.println("    6- Nakliyecimle İletişime Geç");
            System.out.println("    7- Araç sil");
            System.out.println("    8- Müşteri sil");
            System.out.println("    9- Nakliyeci sil");
            System.out.println("    10-Nakliyecimle İletişimi sonlandır");
            
            System.out.println("    0- Çıkış");
            System.out.println(" YAPMAK İSTEDİĞİNİZ İŞLEM NUMARASINI GİRİNİZ... ");
        
        }
        
    }

}
