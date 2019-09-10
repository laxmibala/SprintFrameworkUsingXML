package MobileServices;

import MobileServices.Airtel;

public class Vodaphone implements Sim {
    String  internetSpeed;
    Services services;

    //setter injection
    public void setInternetSpeed(String internetSpeed){
        this.internetSpeed=internetSpeed;
    }

    public void calling() {
        System.out.println("vodafone Calling");
    }

    public void browsingInternet() {
        System.out.println("Browsing internet through vodafone network");
    }

    @Override
    public void displayInternetConnection(){
        System.out.println("Current Internet Conection Speed: " +internetSpeed);
    }

    //object injection
    public void setServices(Services services){
        this.services=services;
    }

    public void services(){
        services.activateService();
    }
}
