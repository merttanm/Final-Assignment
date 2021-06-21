/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationssystem;

import controller.LogisticAndUserRelationsController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import relationssystem.model.Adress;
import relationssystem.model.AutomotivFuel;
import relationssystem.model.Car;
import relationssystem.model.CarType;
import relationssystem.model.Company;
import relationssystem.model.Contact;
import relationssystem.model.Customer;
import relationssystem.model.Vehicle;
import view.CarView;
import view.ContactView;
import view.CustomerView;
import view.FreightCompanyView;

/**
 *
 * @author MERT
 */
public class LogisticAndUserRelationsSystem {

    private static List<Car> carList = new ArrayList<Car>();
    private static List<Customer> customerList = new ArrayList<Customer>();
    private static List<Company> companyList = new ArrayList<Company>();
    private static List<Contact> contactList = new ArrayList<Contact>();

    public static void main(String[] args) throws IOException {

        LogisticAndUserRelationsSystem logisticAndUserRelations = new LogisticAndUserRelationsSystem();

        System.out.println("E Naklet Nakletmenin en kolay yolu");
        while (true) {

            System.out.println("    1 - ARAÇ LİSTESİ ");
            System.out.println("    2 - MÜŞTERİ LİSTESİ");
            System.out.println("    3 - NAKLİYECİ FİRMA LİSTESİ");
            System.out.println("    4 - REZERVASYONLARIM");
            System.out.println("    5 - NAKLİYECİDEN REZERVASYON OLUŞTUR");
            System.out.println("    6 - ARAÇ EKLE");
            System.out.println("    7 - MÜŞTERİ EKLE");
            System.out.println("    8 - NAKLİYE ŞİRKETİ EKLE");
            System.out.println("    9 - ARAÇ SİL");
            System.out.println("    10- MÜŞTERİ SİL");
            System.out.println("    11- NAKLİYECİ SİL");
            System.out.println("    12- TALEP SONLANDIR/İPTAL ET");

            System.out.println("    0- Çıkış");
            System.out.println(" YAPMAK İSTEDİĞİNİZ İŞLEM NUMARASINI GİRİNİZ... ");

            LogisticAndUserRelationsController controller = new LogisticAndUserRelationsController();
            CarView carView = new CarView();
            CustomerView customerView = new CustomerView();
            ContactView contactView = new ContactView();
            FreightCompanyView reservationView = new FreightCompanyView();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            try {
                int i = Integer.parseInt(s);
                switch (i) {
                    case 0:
                        System.out.println("ÇIKIŞ YAPTINIZ...");
                        System.exit(0);
                    case 1:
                        if (logisticAndUserRelations.carList.isEmpty()) {
                            System.out.println("SİSTEME KAYITLI ARAÇ BULUNMAMAKTADIR...");
                        } else {
                            for (Car car : logisticAndUserRelations.carList) {
                                controller.setCar(car);
                                controller.setCarView(carView);
                                controller.updateCarView();
                            }
                        }
                        break;
                    case 2:
                        if (logisticAndUserRelations.customerList.isEmpty()) {
                            System.out.println("SİSTEME KAYITLI MÜŞTERİ BULUNMAMAKTADIR...");
                        } else {
                            for (Customer customer : logisticAndUserRelations.customerList) {
                                controller.setCustomer(customer);
                                controller.setCustomerView(customerView);
                                controller.updateCustomerView();
                            }
                        }
                        break;
                    case 3:
                        if (logisticAndUserRelations.companyList.isEmpty()) {
                            System.out.println("SİSTEME KAYITLI ŞİRKET BULUNMAMAKTADIR...");
                        } else {
                            for (Company company : logisticAndUserRelations.companyList) {
                                controller.setCompany(company);
                                controller.setFreightCompanyView(reservationView);
                                controller.updateCompanyView();
                            }
                        }
                        break;
                    case 4:
                        if (logisticAndUserRelations.contactList.isEmpty()) {
                            System.out.println("SİSTEME KAYITLI REZERVASYON BULUNMAMAKTADIR...");
                        } else {
                            for (Contact contact : logisticAndUserRelations.contactList) {
                                controller.setContact(contact);
                                controller.setContactView(contactView);
                                controller.updateContactView();
                            }
                        }
                        break;
                    case 5:
                        logisticAndUserRelations.insertNewReservationModel();
                        break;
                    case 6:
                        logisticAndUserRelations.insertNewCarModel();
                        break;
                    case 7:
                        logisticAndUserRelations.insertNewCustomerModel();
                        break;
                    case 8:
                        logisticAndUserRelations.insertNewCompanyModel();
                        break;
                    case 9:
                        logisticAndUserRelations.deleteCarFromList();
                        break;
                    case 10:
                        logisticAndUserRelations.deleteCustomerFromList();
                        break;
                    case 11:
                        logisticAndUserRelations.deleteCompanyFromList();
                        break;
                    case 12:
                        logisticAndUserRelations.deleteOrCancelReservation();
                        break;
                }
                String answer = logisticAndUserRelations.checkToContinue();
                if (!answer.equalsIgnoreCase("*")) {
                    System.err.println("Uygulama Sonlandırılıyor ... ");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Hatalı Seçim Yapıldı!!!! Uygulama Sonlandırılıyor ... ");
                System.exit(0);
            }
        }
    }

    public static Car insertNewCarModel() throws IOException {
        Car car = new Car();
        System.out.println("ARAÇ MARKASINI : ");
        String name = readConsoleData();
        car.setName(name);
        System.out.println("ARAÇ ŞASE NO : ");
        int sase = Integer.parseInt(readConsoleData());
        car.setSaseNo(sase);
        System.out.println("ARAÇ MODELİ : ");
        String model = readConsoleData();
        car.setModel(model);
        /* System.out.println("ŞİRKET ADİ : ");
        String companyName = readConsoleData();
        car.setCompanyName(companyName);*/
        System.out.println("ARAÇ PLAKA : ");
        String plate = readConsoleData();
        car.setPlate(plate);
        System.out.println("ARAÇ RENGİ :");
        String color = readConsoleData();
        car.setColor(color);
        System.out.println("ARAÇ YAŞI :");
        int age = Integer.parseInt(readConsoleData());
        car.setAge(age);
        System.out.println("KAMYON TÜRÜ? [TRUCK/VAN]:");
        String cartype = readConsoleData();
        if ("TRUCK".equalsIgnoreCase(cartype)) {
            car.setCarType(CarType.TRUCK);
        } else {
            car.setCarType(CarType.VAN);
        }

        System.out.println("BENZİNLİ Mİ? [EVET/HAYIR]:");
        String fuelOil = readConsoleData();
        if ("EVET".equalsIgnoreCase(fuelOil)) {
            car.setAutomotivFuel(AutomotivFuel.GASOLINE);
        } else {
            car.setAutomotivFuel(AutomotivFuel.DIESEL);
        }
        car.setIsReseved(false);
        carList.add(car);
        return car;
    }

    public static void deleteOrCancelReservation() throws IOException {

        System.out.println("ARAÇ PLAKASINI GİRİN:    ");
        String plate = readConsoleData();

        Car car = findReservedCar(plate);
        if (car == null) {
            System.out.println(plate + " PLAKALI ARAÇ SİSTEMDE BULUNAMADI...");
        } else {
            car.setIsReseved(false);
            car.setNumMonth(0);
            car.setNumWeek(0);
            car.setNumDay(0);

            for (Contact contact : contactList) {
                for (Car reservCar : contact.getCarList()) {
                    if (car.getPlate().equals(reservCar.getPlate())) {
                        contactList.remove(contact);
                        System.out.println("REZERVASYON SİLİNDİ...");
                    }
                }
            }
        }
    }

    public static void deleteCarFromList() throws IOException {

        System.out.println("SİLİNMESİNİ İSTEDİĞİNİZ ARACIN ŞASE NUMARASINI GİRİN ");
        String saseNo = readConsoleData();
        int count = 0;
        for (Car car : carList) {
            if (car.getSaseNo().equals(saseNo)) {
                carList.remove(count);
                System.out.println(count + " adet araç sistemden silindi...");
            }
            count++;
        }

    }

    public static void deleteCustomerFromList() throws IOException {
        System.out.println("SİLİNMESİNİ İSTEDİĞİNİZ MÜŞTERİNİN KİMLİK NUMARASINI GİRİN ");
        String identityCarNo = readConsoleData();
        int count = 0;
        for (Customer customer : customerList) {
            if (customer.getIdentityNo().equals(identityCarNo)) {
                customerList.remove(count);
                System.out.println(count + " adet müşteri sistemden silindi...");
            }
            count++;
        }
    }

    public static void deleteCompanyFromList() throws IOException {

        /*
        DOLDURMAYI BEKLİYOR
         */
    }

    public static void insertNewCompanyModel() throws IOException {
        Company company = new Company();

        System.out.println("ŞİRKET ID : ");
        String companyId = readConsoleData();
        company.setCompanyId(companyId);

        System.out.println("ŞİRKET ADI : ");
        String companyName = readConsoleData();
        company.setCompanyName(companyName);

        System.out.println("VERGİ NUMARASI : ");
        Long taxNumber = Long.parseLong(readConsoleData());
        company.setTaxNumber(taxNumber);

        System.out.println("TELEFON NUMARASI : ");
        String phoneNumber = readConsoleData();
        company.setCompanyPhoneNumber(phoneNumber);

        System.out.println("ŞİRKETİN ENVANTERİNDE KAÇ ARAÇ VAR : ");
        String numberOfVehicles = readConsoleData();
        company.setNumberOfVehicles(numberOfVehicles);

        company.setCompanyAdress(createAdress());
        System.out.println("ARAÇ EKLEMEK İSTER MİSİNİZ? [EVET/HAYIR]:");
        String addCar = readConsoleData();
        if ("EVET".equalsIgnoreCase(addCar)) {
            for (int i = 0; i < numberOfVehicles.length(); i++) {
                company.setCompanyCar(insertNewCarModel());
            }
        } else {
            System.out.println("ŞİRKET ENVANTERİNE ARAÇ EKLENMEDİ");
        }

        company.setCompanyCar(insertNewCarModel());

        companyList.add(company);

    }

    public static void insertNewCustomerModel() throws IOException {
        Customer customer = new Customer();

        System.out.println("KİMLİK NUMARASI : ");
        Long identityNo = Long.parseLong(readConsoleData());
        customer.setIdentityNo(identityNo);

        System.out.println("ADI : ");
        String name = readConsoleData();
        customer.setCustomerName(name);

        System.out.println("SOYADI : ");
        String surName = readConsoleData();
        customer.setCustomerSurname(surName);

        System.out.println("YAŞI : ");
        Integer age = Integer.parseInt(readConsoleData());
        customer.setCustomerAge(age);
        if (age < 18) {
            customer.setIsValid(false);
        } else {
            customer.setIsValid(true);
        }
        customer.setCustomerAdress(createAdress());

        System.out.println("SÜRÜCÜ KART NO : ");
        Integer driverCardNo = Integer.parseInt(readConsoleData());
        customer.setDriverCarNumber(driverCardNo);

        System.out.println("CEP NUMARASI : ");
        String cebNo = readConsoleData();
        customer.setPhoneNumber(cebNo);
        customerList.add(customer);

    }

    public static String readConsoleData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }

    public static Adress createAdress() throws IOException {
        Adress adress = new Adress();

        System.out.println("İL : ");
        String city = readConsoleData();
        adress.setCity(city);

        System.out.println("İLÇE : ");
        String district = readConsoleData();
        adress.setDistrict(district);

        System.out.println("SOKAK : ");
        String street = readConsoleData();
        adress.setStress(street);

        System.out.println("APARTMAN : ");
        String apartment = readConsoleData();
        adress.setApartment(apartment);

        System.out.println("KAPI NO : ");
        Integer doorNo = Integer.parseInt(readConsoleData());
        adress.setDoorNo(doorNo);
        return adress;
    }

    public static String checkToContinue() throws IOException {
        System.out.println("DEVAM ETMEK İÇİN * ÇIKIŞ İÇİN 0 GİRİN  ");
        String key = readConsoleData();
        return key;
    }

    public static Contact insertNewReservationModel() throws IOException {
        Contact contact = null;
        System.out.println("REZERVASYONU YAPACAK MÜŞTERİ KİMLİK NUMARASINI GİRİN :  ");
        Long reservationCustomerIdentityNumber = Long.parseLong(readConsoleData());
        Customer customer = findCustomer(reservationCustomerIdentityNumber);

        System.out.println("REZERVASYON YAPMAK İSTEDİĞİNİZ ŞİRKET ADI :  ");
        String reservationCompanyName = readConsoleData();
        Company company = findCompany(reservationCompanyName);

        if (customer == null && company == null) {
            System.out.println("GİRİLEN BİLGİYE AİT MÜŞTERİ BULUNMAMAKTADIR VEYA BÖYLE BİR ŞİRKET YOKTUR");
        } else {
            contact = new Contact();
            if (!customer.isIsValid()) {
                System.out.println("ŞAHSIN REZERVASYONYAPMA YETKİSİ BULUNMAMAKTADIR...");
            } else {
                contact.setCustomer(customer);
                System.out.println(customer.getCustomerName() + " " + customer.getCustomerSurname() + "KAÇ ADET ARAÇ KİRALAYACAK ? :  ");
                Integer countOfRentCar = Integer.parseInt(readConsoleData());

                System.out.println("REZERVASYON BAŞLANGIÇ TARİHİNİ GİRİNİZ  [YYYY-MM-DD]  : ");
                Date reservationBeginDate = Date.valueOf(readConsoleData());
                contact.setRezervBeginDate(reservationBeginDate);

                System.out.println("REZERVASYON BAŞLANGIÇ TARİHİNİ GİRİNİZ  [YYYY-MM-DD]  : ");
                Date reservationEndDate = Date.valueOf(readConsoleData());
                contact.setRezervEndDate(reservationEndDate);

                Long[] dayWeekMonth = seperateReservationDateAndSetToCar(reservationBeginDate, reservationEndDate);

                List<Car> rezervCarList = new ArrayList<>();
                List<Company> rezervCompanyList = new ArrayList<>();
                for (int i = 0; i < countOfRentCar; i++) {
                    System.out.println(i + ".  ARACIN PLAKASI :  ");
                    String plate = readConsoleData();
                    Car car = findNotReservedCar(plate);
                    if (car != null) {
                        car.setIsReseved(true);
                        car.setNumDay(dayWeekMonth[0].intValue());
                        car.setNumWeek(dayWeekMonth[1].intValue());
                        car.setNumMonth(dayWeekMonth[2].intValue());
                        car.setDailyCost(10);
                        car.setWeeklyCost(7);
                        car.setMonthlyCost(5);
                        rezervCarList.add(car);
                        rezervCompanyList.add(company);
                    } else {
                        System.out.println(plate + " PLAKALI ARAÇ BULUNAMADI. LÜTFEN REZERV EDİLMEDİĞİNDEN EMİN OLUN...");
                    }
                }
            }
        }
        contactList.add(contact);
        return contact;
    }

    public static Long[] seperateReservationDateAndSetToCar(Date reservationBeginDate, Date reservationEndDate) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(reservationBeginDate);
        cal2.setTime(reservationEndDate);
        Long milSecondReservationBegin = cal1.getTimeInMillis();
        Long milSecondReservationEnd = cal2.getTimeInMillis();
        Long diff = milSecondReservationEnd - milSecondReservationBegin;
        Long diffDays = diff / (24 * 60 * 60 * 1000);
        Long diffWeek = diff / (7 * 24 * 60 * 60 * 1000);
        Long diffMont = diff / (30 * 7 * 24 * 60 * 1000);
        return new Long[]{diffDays, diffWeek, diffMont};

    }

    public static Customer findCustomer(Long reservationCustomerIdentityNumber) {
        int i = 0;
        for (Customer customer : customerList) {
            if (customer.getIdentityNo().equals(reservationCustomerIdentityNumber)) {
                return customerList.get(i);
            }
            i++;
        }
        return null;
    }

    public static Company findCompany(String reservationCompanyName) {
        int i = 0;
        for (Company company : companyList) {
            if (company.getCompanyName().equals(reservationCompanyName)) {
                return companyList.get(i);
            }
            i++;
        }
        return null;
    }

    public static Car findNotReservedCar(String plate) {
        for (Car car : carList) {
            if (car.isIsReseved() == false && car.getPlate().equals(plate)) {

                return car;
            }
        }
        return null;
    }

    public static Car findReservedCar(String plate) {
        for (Car car : carList) {
            if (car.isIsReseved() == true && car.getPlate().equals(plate)) {

                return car;
            }
        }
        return null;
    }

    public static class Singleton {

        private static Integer instanceCount;

        private Singleton() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instanceCount++;
        }

        public static Singleton getInstance() {
            return new Singleton();
        }

        public static int getInstanceCount() {
            return instanceCount;
        }
    }

}
