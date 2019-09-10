package MobileServices;

public class Airtel implements Sim {

   String  internetSpeed;
   String contactNumber;
   private Services services;
   private Contact contact;

    //Constructor injection
    Airtel(String internetSpeed){
        this.internetSpeed= internetSpeed;
    }

    public void calling() {
        System.out.println("Airtel Calling");
    }

    public void browsingInternet() {
        System.out.println("Browsing internet through airtel network");

    }

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


    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void addContact(){
        contact.setContactNumber(contactNumber);
    }
}
