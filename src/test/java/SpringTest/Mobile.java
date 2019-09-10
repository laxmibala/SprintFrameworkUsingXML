package SpringTest;

import MobileServices.Airtel;
import MobileServices.Sim;
import MobileServices.Vodaphone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {
        ApplicationContext context =new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        Sim vodaphone = context.getBean(Vodaphone.class);
        vodaphone.calling();
        vodaphone.browsingInternet();
        vodaphone.displayInternetConnection();
        vodaphone.services();

        Sim airtel = context.getBean("airtel", Airtel.class);
        airtel.calling();
        airtel.browsingInternet();
        airtel.displayInternetConnection();
        airtel.services();

    }

   }
