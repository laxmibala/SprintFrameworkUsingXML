package MobileServices;

public class Contact {
    String contactNumber;


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


   public void displayContactInfo(){
       System.out.println("Contact number added are:"+contactNumber);
   }

}
